package com.shoppingapp.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoppingapp.productservice.repository.ProductRepository;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {

	@Container
	//specificam vers mongo care o utilizam
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo: 4.4.2");
	 
	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
		string 


	}
	
	
}
