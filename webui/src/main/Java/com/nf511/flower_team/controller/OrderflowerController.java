package com.nf511.flower_team.controller;


import com.nf511.flower_team.entity.Orderflower;
import com.nf511.flower_team.service.OrderflowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/orderflowerService")
public class OrderflowerController {
    @Autowired
    OrderflowerService orderflowerService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllOrderflower",method = RequestMethod.POST)
    @ResponseBody
    public List<Orderflower> selectAllOrderflower(){
        return orderflowerService.selectAllOrderflower();
    }
}
