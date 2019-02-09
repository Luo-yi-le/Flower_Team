package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.StateDao;
import com.nf511.flower_team.entity.State;
import com.nf511.flower_team.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateImpl implements StateService {
    @Autowired
    StateDao stateDao;
    public List<State> selectAllState() {
        return stateDao.selectAllState();
    }

    public State selectAllStateId(String stateId) {
        return stateDao.selectAllStateId(stateId);
    }

    public List<State> selectAlStateByPage(int pagelimit, int size) {
        return stateDao.selectAlStateByPage(pagelimit, size);
    }

    public int insertState(State state) {
        return stateDao.insertState(state);
    }

    public int updateState(State state) {
        return stateDao.updateState(state);
    }

    public int deleteState(int stateId) {
        return stateDao.deleteState(stateId);
    }

    public int deleteAll(List<Integer> items) {
        return stateDao.deleteAll(items);
    }
}
