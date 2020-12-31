package com.pradeep.hystrixdemo.service.impl;

import java.util.List;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.domain.Order;

public interface OrderService {
	
	List<Order> getOrders(Customer customer);

}
