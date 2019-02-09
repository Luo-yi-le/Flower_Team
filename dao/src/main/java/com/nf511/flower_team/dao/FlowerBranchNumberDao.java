package com.nf511.flower_team.dao;

import com.nf511.flower_team.entity.FlowerBranchNumber;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowerBranchNumberDao {
    List<FlowerBranchNumber> selectAllFlowerBranchNumber();
    FlowerBranchNumber selectAllFlowerBranchNumberId(@Param("flowerBranchNumberId") String flowerBranchNumberId);
    List<FlowerBranchNumber>selectAllFlowerBranchNumberByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber);
    int updateFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber);
    int deleteFlowerBranchNumber(@Param("flowerBranchNumberId") int flowerBranchNumberId);
    int deleteAll(@Param("flowerBranchNumberIds") List<Integer>items);
}
