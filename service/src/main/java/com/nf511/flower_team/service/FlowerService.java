package com.nf511.flower_team.service;


import com.nf511.flower_team.entity.Flower;
import com.nf511.flower_team.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowerService {

    List<Flower> selectAllFlower();
    Flower selectAllFlowerId(@Param("flowerId") String flowerId);
    List<Flower>selectAllFlowerByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertFlower(Flower flower);
    int updateFlower(Flower flower);
    int deleteFlower(@Param("flowerId") int flowerId);
    int deleteAll(@Param("flowerIds") List<Integer>items);
}
