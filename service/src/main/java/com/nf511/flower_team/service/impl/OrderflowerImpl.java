package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.OrderflowerDao;
import com.nf511.flower_team.entity.Orderflower;
import com.nf511.flower_team.service.OrderflowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderflowerImpl implements OrderflowerService {

    @Autowired
    OrderflowerDao orderflowerDao;

    public List<Orderflower> selectAllOrderflower() {
        return orderflowerDao.selectAllOrderflower();
    }

    public Orderflower selectAllOrderflowerId(String orderflowerId) {
        return orderflowerDao.selectAllOrderflowerId(orderflowerId);
    }

    public List<Orderflower> selectAllOrderflowerByPage(int pagelimit, int size) {
        return orderflowerDao.selectAllOrderflowerByPage(pagelimit, size);
    }

    public int insertOrderflower(Orderflower orderflower) {
        return orderflowerDao.insertOrderflower(orderflower);
    }

    public int updateOrderflower(Orderflower orderflower) {
        return orderflowerDao.updateOrderflower(orderflower);
    }

    public int deleteOrderflower(int orderflowerId) {
        return orderflowerDao.deleteOrderflower(orderflowerId);
    }

    public int deleteAll(List<Integer> items) {
        return orderflowerDao.deleteAll(items);
    }
}
