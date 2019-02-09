package com.nf511.flower_team.service;

import com.nf511.flower_team.entity.State;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StateService {
    List<State> selectAllState();
    State selectAllStateId(@Param("stateId") String stateId);
    List<State>selectAlStateByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertState(State state);
    int updateState(State state);
    int deleteState(@Param("stateId") int stateId);
    int deleteAll(@Param("stateIds") List<Integer> items);
}
