package com.biswas.project.com.crud.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biswas.project.com.crud.restAPI.Services.Services;
import com.biswas.project.com.crud.restAPI.enteties.Products;

@RestController
public class Controller {
	
	@Autowired
	private Services services;
	
	//Get Products
	@GetMapping("/products")
	public List<Products> getProducts() {
		return this.services.getProducts();
		
	}
	
	@GetMapping("/products/{productId}")
	public Products getProduct(@PathVariable String productId) {
		return this.services.getProduct(Long.parseLong(productId));
	}
	
	@PostMapping("/products")
	public Products addProducts(@RequestBody Products products) {
		return this.services.addProducts(products);
	}
	
	@PutMapping("/products")
	public Products updateProduct(@RequestBody Products products) {
		return this.services.updateProducts(products);
	}
	
	@DeleteMapping("/products/{productId}")
		public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
			try {
				this.services.deleteProduct(Long.parseLong(productId));
				return new ResponseEntity<>(HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}



