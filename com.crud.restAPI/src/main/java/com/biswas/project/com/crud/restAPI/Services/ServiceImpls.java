package com.biswas.project.com.crud.restAPI.Services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswas.project.com.crud.restAPI.dao.ProductDao;
import com.biswas.project.com.crud.restAPI.enteties.Products;

@Service
public class ServiceImpls implements Services {

	@Autowired
	private ProductDao dao;

	public ServiceImpls() {
		
	}
	
	@Override
	public List<Products> getProducts() {
		
		return dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Products getProduct(long productId) {
		
		return dao.getOne(productId);
	}
	@Override
	public Products addProducts(Products products) {
		dao.save(products);
		return products;
	}
	
	@Override
	public Products updateProducts(Products products) {
		dao.save(products);
		return products;
	}
	
	@Override
	public void deleteProduct(long parseLong) {
		@SuppressWarnings("deprecation")
		Products entityProducts = dao.getById(parseLong);
		dao.delete(entityProducts);
	}

}
