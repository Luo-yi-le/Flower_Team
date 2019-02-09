package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Orderflower;
import com.nf511.flower_team.entity.State;
import com.nf511.flower_team.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/stateService")
public class StateController {
    @Autowired
    StateService stateService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllState",method = RequestMethod.POST)
    @ResponseBody
    public List<State> selectAllState(){
        return stateService.selectAllState();
    }
}
