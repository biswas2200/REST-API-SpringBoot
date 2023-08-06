package com.biswas.project.com.crud.restAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.biswas.project.com.crud.restAPI.enteties.Products;

@Service
public class ServiceImpls implements Services {

	List<Products> list;
	

	public ServiceImpls() {
		list = new ArrayList<>();
		list.add(new Products(1145, "AirBook", "ISBN : 99293484563"));
		list.add(new Products(1295, "Acer LightHouse", "ISBN : 18834596923"));
		list.add(new Products(1487, "Acer Nitro", "ISBN : 263844495858"));
	}
	
	@Override
	public List<Products> getProducts() {
		
		return list;
	}

	@Override
	public Products getProduct(long productId) {
		Products p = null;
		for(Products products : list) {
			if(products.getId() == productId) {
				p=products;
			break;
			}
		}
		return p;
	}
	@Override
	public Products addProducts(Products products) {
		list.add(products);
		return products;
	}
	
	@Override
	public Products updateProduct(Products products) {
		
		list.forEach(e -> {
			if (e.getId() == products.getId()) {
				e.setProcName(products.getProcName());
				e.setDescription(products.getDescription());
			}
		});
		return products;
	}
	
	@Override
	public void deleteProduct(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
