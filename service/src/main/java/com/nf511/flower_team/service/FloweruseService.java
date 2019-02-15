package com.nf511.flower_team.service;

import com.nf511.flower_team.entity.Floweruse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FloweruseService {
    List<Floweruse> selectAllFloweruse();
    Floweruse selectAllFloweruseId(@Param("flowerUseId") String flowerUseId);
    List<Floweruse>selectAllFloweruseByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertFloweruse(Floweruse floweruse);
    int updateFloweruse(Floweruse floweruse);
    int deleteFloweruse(@Param("flowerUseId") int flowerUseId);
    int deleteAll(@Param("flowerUseIds") List<Integer> items);
}
