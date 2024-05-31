package com.shivam.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.shivam.springweb.entities.Product;
@SpringBootTest
class SpringRestApiApplicationTests {

	@Test
	void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		assertNotNull(product);
		assertEquals("mobile", product.getName());
	}
	
	@Test
	void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Mi mobile");
		product.setDescription("Its good");
		product.setPrice(12000);
		Product newProduct = restTemplate.postForObject("http://localhost:8080/productapi/products/", product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Mi mobile", newProduct.getName());
	}
	
	@Test
	void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		product.setPrice(12000);	
		restTemplate.put("http://localhost:8080/productapi/products/", product);
		
	}

}
