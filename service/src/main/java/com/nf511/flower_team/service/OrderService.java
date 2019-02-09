package com.nf511.flower_team.service;


import com.nf511.flower_team.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    List<Order> selectAllOrder();
    Order selectAllOrderId(@Param("orderId") String orderId);
    List<Order>selectAllOrderByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertOrder(Order order);
    int updateOrder(Order order);
    int deleteOrder(@Param("orderId") int orderId);
    int deleteAll(@Param("orderIds") List<Integer> items);
}
