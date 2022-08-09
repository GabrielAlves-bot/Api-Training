package com.gabriel.br.apitraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.br.apitraining.data.vo.ProductVO;
import com.gabriel.br.apitraining.services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductServices service;
	
	@PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductVO createProduct(@RequestBody ProductVO productVO) {
		return service.create(productVO);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List <ProductVO> findAllProducts(){
		return service.findAll();
	}
	
	@GetMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductVO findByIdProduct(@PathVariable(value = "id") long id) {
		return service.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
