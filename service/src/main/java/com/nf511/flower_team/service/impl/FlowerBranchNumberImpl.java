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
    FlowerBranchNumberDao flowerBranchNumberDao;
    public List<FlowerBranchNumber> selectAllFlowerBranchNumber() {
        return flowerBranchNumberDao.selectAllFlowerBranchNumber();
    }

    public FlowerBranchNumber selectAllFlowerBranchNumberId(String flowerBranchNumberId) {
        return flowerBranchNumberDao.selectAllFlowerBranchNumberId(flowerBranchNumberId);
    }

    public List<FlowerBranchNumber> selectAllFlowerBranchNumberByPage(int pagelimit, int size) {
        return flowerBranchNumberDao.selectAllFlowerBranchNumberByPage(pagelimit, size);
    }

    public int insertFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber) {
        return flowerBranchNumberDao.insertFlowerBranchNumber(flowerBranchNumber);
    }

    public int updateFlowerBranchNumber(FlowerBranchNumber flowerBranchNumber) {
        return flowerBranchNumberDao.updateFlowerBranchNumber(flowerBranchNumber);
    }

    public int deleteFlowerBranchNumber(int flowerBranchNumberId) {
        return flowerBranchNumberDao.deleteFlowerBranchNumber(flowerBranchNumberId);
    }

    public int deleteAll(List<Integer> items) {
        return flowerBranchNumberDao.deleteAll(items);
    }
}
