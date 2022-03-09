package com.nimap.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nimap.model.Category;


//kk
public interface CategoryService {
	
public Category saveCategory(Category category);
//public Iterable<Category> getCategory();
public Page<Category> getCategory(Pageable pageable);
public String deleteCategory(Integer id);
public  Category getCategoryById(Integer Id);


}
