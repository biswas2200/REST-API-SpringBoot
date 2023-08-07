package com.biswas.project.com.crud.restAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswas.project.com.crud.restAPI.enteties.Products;

public interface ProductDao extends JpaRepository<Products, Long>{

}
