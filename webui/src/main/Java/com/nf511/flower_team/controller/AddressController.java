package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Address;
import com.nf511.flower_team.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/adderss")
public class AddressController {
    @Autowired
    AddressService addressService;

    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllAddress",method = RequestMethod.POST)
    @ResponseBody
    public List<Address> selectAllAddress(){
        return addressService.selectAllAddress();
    }
}
