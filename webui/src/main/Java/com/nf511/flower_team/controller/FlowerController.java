package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Flower;
import com.nf511.flower_team.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/flowerService")
public class FlowerController {
    @Autowired
    FlowerService flowerService;

    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllCart",method = RequestMethod.POST)
    @ResponseBody
    public List<Flower> selectAllCart(){
        return flowerService.selectAllFlower();
    }
}
