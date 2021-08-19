package com.example.demo.controller;

import com.example.demo.repository.ProductrRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

		private final ProductrRepository ProductrRepository;
		
		public ProductController(ProductrRepository ProductrRepository)
		{
			this.ProductrRepository = ProductrRepository;
			
		}
		
		
		@GetMapping
	    public ResponseEntity getAllProducts() {
	        return ResponseEntity.ok(this.ProductrRepository.findAll());
		
		
	
}
}