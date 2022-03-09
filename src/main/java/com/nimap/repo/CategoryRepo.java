package com.nimap.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nimap.model.Category;
import com.nimap.model.Product;

@Repository
public interface CategoryRepo extends PagingAndSortingRepository<Category, Long>  {

	void findById(Integer id);

	void deleteById(Integer id);

}
