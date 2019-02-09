package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Flowertype;
import com.nf511.flower_team.service.FlowertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/flowertypeService")
public class FlowertypeController {
    @Autowired
    FlowertypeService flowertypeService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllFlowertype",method = RequestMethod.POST)
    @ResponseBody
    public List<Flowertype> selectAllFlowertype(){
        return flowertypeService.selectAllFlowertype();
    }
}
