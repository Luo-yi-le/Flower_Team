package com.nf511.flower_team.contrllor;

import com.nf511.flower_team.entity.Image;
import com.nf511.flower_team.service.ImageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping(path = "/imageService")
public class ImageContrllor {
    @Autowired
    ImageService imageService;
}
