package com.nimap.repo;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nimap.model.Product;
@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {
	
	
	public Optional<Product> findById(Long Id);
	
}
