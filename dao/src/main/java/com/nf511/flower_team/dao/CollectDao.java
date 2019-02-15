package com.nf511.flower_team.dao;

import com.nf511.flower_team.entity.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectDao {
    List<Collect> selectAllCollect();
    Collect selectAllCollectId(@Param("collectId") String collectId);
    List<Collect>selectAllCollectByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertCollect(Collect collect);
    int updateCollect(Collect collect);
    int deleteCollect(@Param("collectId") String collectId);
    int deleteAll(@Param("collectIds") List<Integer>items);
}
