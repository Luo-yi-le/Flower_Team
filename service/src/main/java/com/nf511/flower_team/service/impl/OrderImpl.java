package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.OrderDao;
import com.nf511.flower_team.entity.Order;
import com.nf511.flower_team.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderImpl  implements OrderService {

    @Autowired
    OrderDao orderDao;

    public List<Order> selectAllOrder() {
        return orderDao.selectAllOrder();
    }

    public Order selectAllOrderId(String orderId) {
        return orderDao.selectAllOrderId(orderId);
    }

    public List<Order> selectAllOrderByPage(int pagelimit, int size) {
        return orderDao.selectAllOrderByPage(pagelimit,size);
    }

    public int insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }

    public int updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }

    public int deleteOrder(int orderId) {
        return orderDao.deleteOrder(orderId);
    }

    public int deleteAll(List<Integer> items) {
        return orderDao.deleteAll(items);
    }
}
