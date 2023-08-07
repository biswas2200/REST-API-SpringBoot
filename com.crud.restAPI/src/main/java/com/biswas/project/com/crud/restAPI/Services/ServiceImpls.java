package com.biswas.project.com.crud.restAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	public Products updateProduct(Products products) {
		dao.save(products);
		return products;
	}
	
	@Override
	public void deleteProduct(long parseLong) {
		dao.getOne(parseLong);
	}

}
