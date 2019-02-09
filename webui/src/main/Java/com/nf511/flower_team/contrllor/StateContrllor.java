package com.nf511.flower_team.contrllor;

import com.nf511.flower_team.entity.State;
import com.nf511.flower_team.service.StateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping(path = "/stateService")
public class StateContrllor {
    @Autowired
    StateService stateService;
}
