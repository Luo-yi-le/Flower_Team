package com.nf511.flower_team.contrllor;

import com.nf511.flower_team.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/adderss")
public class AdderssContrllor {
    @Autowired
    AddressService addressService;
}
