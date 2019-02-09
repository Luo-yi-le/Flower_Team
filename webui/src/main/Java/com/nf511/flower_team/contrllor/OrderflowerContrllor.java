package com.nf511.flower_team.contrllor;


import com.nf511.flower_team.entity.Orderflower;
import com.nf511.flower_team.service.OrderflowerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping(path = "/orderflowerService")
public class OrderflowerContrllor {
    @Autowired
    OrderflowerService orderflowerService;
}
