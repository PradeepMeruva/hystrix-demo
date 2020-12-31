package com.pradeep.hystrixdemo.service;

import com.pradeep.hystrixdemo.domain.Customer;

public interface CustomerService {
	
	Customer getCustomer(String CustId);

}
