package com.nf511.flower_team.controller;


import com.nf511.flower_team.entity.Order;
import com.nf511.flower_team.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/orderService")
public class OrderController {
    @Autowired
    OrderService orderService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllOrder",method = RequestMethod.POST)
    @ResponseBody
    public List<Order> selectAllOrder(){
        return orderService.selectAllOrder();
    }
}
