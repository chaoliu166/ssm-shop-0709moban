package com.smart.shop.service;

import com.smart.shop.domain.dto.OrderDto;
import com.smart.shop.domain.entity.Order;
import com.smart.shop.exception.ServiceException;

import javax.servlet.ServletException;

public interface OrderService {
    String generateOrder(OrderDto orderDto) throws Exception, ServiceException;
}


