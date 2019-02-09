package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.FlowerDao;
import com.nf511.flower_team.entity.Flower;
import com.nf511.flower_team.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerImpl implements FlowerService {
    @Autowired
    FlowerDao flowerDao;

    public List<Flower> selectAllFlower() {
        return flowerDao.selectAllFlower();
    }

    public Flower selectAllFlowerId(String flowerId) {
        return flowerDao.selectAllFlowerId(flowerId);
    }

    public List<Flower> selectAllFlowerByPage(int pagelimit, int size) {
        return flowerDao.selectAllFlowerByPage(pagelimit, size);
    }

    public int inserFlower(Flower flower) {
        return flowerDao.inserFlower(flower);
    }

    public int updateFlower(Flower flower) {
        return flowerDao.updateFlower(flower);
    }

    public int deleteFlower(int flowerId) {
        return flowerDao.deleteFlower(flowerId);
    }

    public int deleteAll(List<Integer> items) {
        return flowerDao.deleteAll(items);
    }
}
