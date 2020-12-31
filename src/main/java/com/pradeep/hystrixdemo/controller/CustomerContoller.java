package com.pradeep.hystrixdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.service.CustomerService;

@RestController
public class CustomerContoller {
	
	@Autowired
	private CustomerService customerService;
	
	 @GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		 
		 return customerService.getCustomer(id);
		
	}
	 
}
