package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.CollectDao;
import com.nf511.flower_team.entity.Cart;
import com.nf511.flower_team.entity.Collect;
import com.nf511.flower_team.entity.User;
import com.nf511.flower_team.service.CartService;
import com.nf511.flower_team.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectImpl implements CollectService {
    @Autowired
    CollectDao collectDao;

    public List<Collect> selectAllCollect() {
        return collectDao.selectAllCollect();
    }

    public Collect selectAllCollectId(String collectId) {
        return collectDao.selectAllCollectId(collectId);
    }

    public List<Collect> selectAllCollectByPage(int pagelimit, int size) {
        return collectDao.selectAllCollectByPage(pagelimit, size);
    }

    public int insertCollect(Collect collect) {
        return collectDao.insertCollect(collect);
    }

    public int updateCollect(Collect collect) {
        return collectDao.updateCollect(collect);
    }

    public int deleteCollect(String  collectId) {
        return collectDao.deleteCollect(collectId);
    }

    public int deleteAll(List<Integer> items) {
        return collectDao.deleteAll(items);
    }
}
