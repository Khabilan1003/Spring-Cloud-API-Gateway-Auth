package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.OrderResponse;

@Component
public class RestaurantServiceClient {
	@Autowired
	private RestTemplate template;

	public OrderResponse fetchOrderStatus(String orderId) {
		return template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/" + orderId,
				OrderResponse.class);
	}
}
