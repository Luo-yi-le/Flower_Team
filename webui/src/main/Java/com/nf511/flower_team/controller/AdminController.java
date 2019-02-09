package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Address;
import com.nf511.flower_team.entity.Admin;
import com.nf511.flower_team.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    AdminService adminService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllAdmin",method = RequestMethod.POST)
    @ResponseBody
    public List<Admin> selectAllAdmin(){
        return adminService.selectAllAdmin();
    }
}
