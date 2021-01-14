package com.pradeep.hystrixdemo.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.domain.Order;
import com.pradeep.hystrixdemo.service.CustomerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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

		List<Order> orders = this.getOrders(cust);
		
		cust.setOrders(orders);
		return cust;
	}

	@HystrixCommand(fallbackMethod = "getOrdersFallback")
	public List<Order> getOrders(Customer cust) {

		return orderService.getOrders(cust);
	}

	
	public List<Order> getOrdersFallback(Customer cust) {

		return Collections.emptyList();
	}

}
