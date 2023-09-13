package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Address;
import com.demo.model.Employee;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public String hello() {

		logger.info("inside hello controller");

		return "Welcome in spring Boot application";

	}

	@GetMapping("/employee")
	public ResponseEntity<Employee> giveEmployee() {

		logger.info("inside Employee controller");
		Employee emp = new Employee("ram", 111, new Address("kolhapur"));

		return new ResponseEntity<>(emp, HttpStatus.CREATED);

	}
	
	@GetMapping("/address")		// for use HATEOAS created 
	public ResponseEntity<Address> giveAddress(){
		
		Address a1 = new Address("Dubai");
		return new ResponseEntity(a1,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/emp")
	public ResponseEntity<Employee> getemployee(){
		
		Employee e1 = new Employee();
		e1.setName("vaibhav");
		e1.setMobile(9090);
		
		// created self link for the address
		Link link = WebMvcLinkBuilder.linkTo(HelloController.class).slash("address").withSelfRel();
		e1.add(link);
		
		return new ResponseEntity(e1,HttpStatus.CREATED);
	}

}
