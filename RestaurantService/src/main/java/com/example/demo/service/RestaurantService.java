package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RestaurantOrder;
import com.example.demo.dto.OrderResponse;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantOrder orderDAO;

	public String greeting() {
		return "Welcome to Swiggy Restaurant service";
	}

	public OrderResponse getOrder(String orderId) {
		return orderDAO.getOrders(orderId);
	}
}
