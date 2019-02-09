package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.FlowerBranchNumber;
import com.nf511.flower_team.service.FlowerBranchNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/flowerBranchNumberService")
public class FlowerBranchNumberController {
    @Autowired
    FlowerBranchNumberService flowerBranchNumberService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllFlowerBranchNumber",method = RequestMethod.POST)
    @ResponseBody
    public List<FlowerBranchNumber> selectAllFlowerBranchNumber(){
        return flowerBranchNumberService.selectAllFlowerBranchNumber();
    }
}
