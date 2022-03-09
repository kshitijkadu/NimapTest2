package com.nimap.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nimap.model.Category;
import com.nimap.repo.CategoryRepo;
import com.nimap.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public Category saveCategory(Category category) {
		
		return categoryRepo.save(category);
	}

/*   @Override
	public Iterable<Category> getCategory() {
		
		return categoryRepo.findAll();
	}
*/
	@Override
	public String deleteCategory(Integer id) {
		categoryRepo.deleteById(id);
		return "delete successfully";
	}

	@Override
	public Category getCategoryById(Integer id) {
		categoryRepo.findById(id);
		return new Category();
	}

	@Override
	public Page<Category> getCategory(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
