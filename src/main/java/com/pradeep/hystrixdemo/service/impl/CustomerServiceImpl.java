package com.pradeep.hystrixdemo.service.impl;

import org.springframework.stereotype.Service;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomer(String CustId) {
	
		Customer cust = new Customer();
		cust.setId("123");
		cust.setFirstName("John");
		cust.setLastName("Smith");
		
		return cust;
	}

}
