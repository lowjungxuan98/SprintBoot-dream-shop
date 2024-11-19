package com.lowjungxuan.dreamshop.service.order;

import com.lowjungxuan.dreamshop.dto.OrderDto;
import com.lowjungxuan.dreamshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long id);
    OrderDto getOrder(Long id);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
