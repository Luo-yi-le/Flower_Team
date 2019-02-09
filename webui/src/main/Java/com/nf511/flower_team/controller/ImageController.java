package com.nf511.flower_team.controller;

import com.nf511.flower_team.entity.Image;
import com.nf511.flower_team.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/imageService")
public class ImageController {
    @Autowired
    ImageService imageService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllImage",method = RequestMethod.POST)
    @ResponseBody
    public List<Image> selectAllImage(){
        return imageService.selectAllImage();
    }
}
