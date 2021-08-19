package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductrRepository extends JpaRepository<product,Long> {
	
	

}
