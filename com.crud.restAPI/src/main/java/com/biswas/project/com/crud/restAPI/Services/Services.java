package com.biswas.project.com.crud.restAPI.Services;

import java.util.List;

import com.biswas.project.com.crud.restAPI.enteties.Products;

public interface Services {
	public List<Products>getProducts();
	public Products getProduct(long productId);
	public Products addProducts(Products products);
	public Products updateProducts(Products products);
	public void deleteProduct(long parseLong);
	
	
}
