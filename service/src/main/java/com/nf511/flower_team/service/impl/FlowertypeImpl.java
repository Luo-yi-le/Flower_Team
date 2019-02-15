package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.FlowertypeDao;
import com.nf511.flower_team.entity.Flowertype;
import com.nf511.flower_team.service.FlowertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowertypeImpl implements FlowertypeService {
    @Autowired
    FlowertypeDao flowertypeDao;

    public List<Flowertype> selectAllFlowertype() {
        return flowertypeDao.selectAllFlowertype();
    }

    public Flowertype selectAllFlowertypeId(String flowerTypeId) {
        return flowertypeDao.selectAllFlowertypeId(flowerTypeId);
    }

    public List<Flowertype> selectAllFlowertypeByPage(int pagelimit, int size) {
        return flowertypeDao.selectAllFlowertypeByPage(pagelimit,size);
    }

    public int insertFlowertype(Flowertype flowertype) {
        return flowertypeDao.insertFlowertype(flowertype);
    }

    public int updateFlowertype(Flowertype flowertype) {
        return flowertypeDao.updateFlowertype(flowertype);
    }

    public int deleteFlowertype(int flowerTypeId) {
        return flowertypeDao.deleteFlowertype(flowerTypeId);
    }

    public int deleteAll(List<Integer> items) {
        return flowertypeDao.deleteAll(items);
    }
}
