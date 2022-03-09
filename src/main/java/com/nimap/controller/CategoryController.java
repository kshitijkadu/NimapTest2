package com.nimap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.model.Category;
import com.nimap.model.Product;
import com.nimap.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	 @PostMapping("/saveCategory")
		public String insertProduct(@RequestBody Category category ) {
	    	  
		 categoryService.saveCategory(category);
			return "product insert successful";
	}
	/* 
	 @GetMapping("/get")
     public @ResponseBody Iterable<Category> getCategory(Category category ) {
   	  
	     return  categoryService.getCategory();
}
	 */
	 @GetMapping("/get/{page}")
     public Page<Category> getCategory(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        
  	   PageRequest pageRequest = PageRequest.of(page, size);
      
  	  return categoryService.getCategory(pageRequest);
	 }
  	  
	 @DeleteMapping("/delete/{id}")
     public String deleteCategorybyId(@PathVariable("id") int id,@RequestBody Category category) {
  	   
  	   return categoryService.deleteCategory(id);
  	   
     }
	 @PutMapping("/update/{id}")
     public  Category updateCategory(@PathVariable("id") int id,@RequestBody Category category) {
		 Category category2 = categoryService.getCategoryById(id);
		 category2.setCategoryId(category.getCategoryId());
		 category2.setCategoryName(category.getCategoryName());
		 category2.setCategoryDescription(category.getCategoryDescription());
		 Category category3= categoryService.saveCategory(category2);
		  return category3;
	 
	 
}
}
