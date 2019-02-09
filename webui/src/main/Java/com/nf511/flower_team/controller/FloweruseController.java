package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Floweruse;
import com.nf511.flower_team.service.FloweruseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/floweruseService")
public class FloweruseController {
    @Autowired
    FloweruseService floweruseService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllFloweruse",method = RequestMethod.POST)
    @ResponseBody
    public List<Floweruse> selectAllFloweruse(){
        return floweruseService.selectAllFloweruse();
    }
}
