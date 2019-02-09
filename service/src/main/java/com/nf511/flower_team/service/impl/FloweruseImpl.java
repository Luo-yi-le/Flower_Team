package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.FloweruseDao;
import com.nf511.flower_team.entity.Floweruse;
import com.nf511.flower_team.service.FloweruseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloweruseImpl implements FloweruseService {
    @Autowired
    FloweruseDao floweruseDao;

    public List<Floweruse> selectAllFloweruse() {
        return floweruseDao.selectAllFloweruse();
    }

    public Floweruse selectAllFloweruseId(String flowerUseId) {
        return floweruseDao.selectAllFloweruseId(flowerUseId);
    }

    public List<Floweruse> selectAllFloweruseByPage(int pagelimit, int size) {
        return floweruseDao.selectAllFloweruseByPage(pagelimit, size);
    }

    public int inserFloweruse(Floweruse floweruse) {
        return floweruseDao.inserFloweruse(floweruse);
    }

    public int updateFloweruse(Floweruse floweruse) {
        return floweruseDao.updateFloweruse(floweruse);
    }

    public int deleteFloweruse(int flowerUseId) {
        return floweruseDao.deleteFloweruse(flowerUseId);
    }

    public int deleteAll(List<Integer> items) {
        return floweruseDao.deleteAll(items);
    }
}
