package com.gabriel.br.apitraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.br.apitraining.data.vo.ProductVO;
import com.gabriel.br.apitraining.services.ProductServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/product/v1")
@Tag(name = "Product", description = "EndPoints for Managing Products")
public class ProductController {
	
	@Autowired
	private ProductServices service;
	
	@PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Create Product", description = "Create Product", tags = {"Product"})
	public ProductVO createProduct(@RequestBody ProductVO productVO) {
		return service.create(productVO);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds All Products", description = "Finds All Products", tags = {"Product"})
	public List <ProductVO> findAllProducts(){
		return service.findAll();
	}
	
	@GetMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Find product by ID", description = "Find product by ID", tags = {"Product"})
	public ProductVO findByIdProduct(@PathVariable(value = "id") long id) {
		return service.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Delete product by ID", description = "Delete product by ID", tags = {"Product"})
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Update product", description = "Update product", tags = {"Product"})
	public ProductVO updateProduct(@RequestBody ProductVO productVO) {
		return service.update(productVO);
	}

}
