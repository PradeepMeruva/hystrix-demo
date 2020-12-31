package com.pradeep.hystrixdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.domain.Order;
import com.pradeep.hystrixdemo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private OrderService orderService;

	@Override
	public Customer getCustomer(String CustId) {
	
		Customer cust = new Customer();
		cust.setId("123");
		cust.setFirstName("John");
		cust.setLastName("Smith");
		
	List<Order> orders =	orderService.getOrders(cust);
		
	cust.setOrders(orders);
			
		return cust;
	}

}
