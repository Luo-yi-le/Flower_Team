package com.nf511.flower_team.service;


import com.nf511.flower_team.entity.Collect;
import com.nf511.flower_team.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectService {
    List<Collect> selectAllCollect();
    Collect selectAllCollectId(@Param("collectId") String collectId);
    List<Collect>selectAllCollectByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertCollect(Collect collect);
    int updateCollect(Collect collect);
    int deleteCollect(@Param("collectId") String collectId);
    int deleteAll(@Param("collectIds") List<Integer>items);
}
