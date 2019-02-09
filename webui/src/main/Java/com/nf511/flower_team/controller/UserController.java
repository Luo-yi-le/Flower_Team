package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.User;
import com.nf511.flower_team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 查询全部用户
     * */
    @RequestMapping(path = "/selectAllUser",method = RequestMethod.POST)
    @ResponseBody
    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }

    /**
     *  用户登陆
     * */
    @RequestMapping(path = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public User userLogin(String userName ,String userPassword){
        return userService.userLogin(userName,userPassword);
    }
}
