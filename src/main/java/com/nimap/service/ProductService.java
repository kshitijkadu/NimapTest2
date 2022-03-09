package com.nimap.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nimap.model.Product;

public interface ProductService {
//kk
	public Product saveProduct(Product product);
	public Page<Product> getProduct(Pageable pageable);
	//public Iterable<Product> getProduct();
	public String deleteProduct(Long id);
	public  Product getProductById(Long Id);
	

}
