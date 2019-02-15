package com.nf511.flower_team.dao;

import com.nf511.flower_team.entity.Flowertype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowertypeDao {
    List<Flowertype> selectAllFlowertype();
    Flowertype selectAllFlowertypeId(@Param("flowerTypeId") String flowerTypeId);
    List<Flowertype>selectAllFlowertypeByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertFlowertype(Flowertype flowertype);
    int updateFlowertype(Flowertype flowertype);
    int deleteFlowertype(@Param("flowerTypeId") int flowerTypeId);
    int deleteAll(@Param("flowerTypeIds") List<Integer>items);
}
