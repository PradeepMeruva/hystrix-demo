package com.pradeep.hystrixdemo.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pradeep.hystrixdemo.domain.Customer;
import com.pradeep.hystrixdemo.domain.Order;

@Service
public class OrderServiceImpl implements OrderService {

	public List<Order> getOrders(Customer customer) {

		List<Order> orders = new ArrayList<Order>();

		Order order = new Order();
		order.setId("xyz");
		order.setDate(new Date());
		orders.add(order);

		return orders;
	}

}
