package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	//获取订单
	Order getOrder(String orderId);
	void addOrder(Order order);
}
