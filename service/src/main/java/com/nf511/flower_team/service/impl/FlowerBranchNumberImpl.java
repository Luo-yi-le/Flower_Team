package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.FlowerBranchNumberDao;
import com.nf511.flower_team.entity.FlowerBranchNumber;
import com.nf511.flower_team.service.FlowerBranchNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerBranchNumberImpl implements FlowerBranchNumberService {
    @Autowired
    FlowerBranchNumberDao f;
    public List<FlowerBranchNumber> selectAllFlowerBranchNumber() {
        return f.selectAllFlowerBranchNumber();
    }

    public FlowerBranchNumber selectAllFlowerBranchNumberId(String flowerBranchNumberId) {
        return f.selectAllFlowerBranchNumberId(flowerBranchNumberId);
    }

    public List<FlowerBranchNumber> selectAllFlowerBranchNumberByPage(int pagelimit, int size) {
        return f.selectAllFlowerBranchNumberByPage(pagelimit, size);
    }

    public int insertFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber) {
        return f.insertFlowerBranchNumber(flowerBranchNumber);
    }

    public int updateFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber) {
        return f.updateFlowerBranchNumber(flowerBranchNumber);
    }

    public int deleteFlowerBranchNumber(int flowerBranchNumberId) {
        return f.deleteFlowerBranchNumber(flowerBranchNumberId);
    }

    public int deleteAll(List<Integer> items) {
        return f.deleteAll(items);
    }
}
