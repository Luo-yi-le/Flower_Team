package com.nf511.flower_team.entity;


public class State {

  private long stateId;
  private String stateName;


  public long getStateId() {
    return stateId;
  }

  public void setStateId(long stateId) {
    this.stateId = stateId;
  }


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  @Override
  public String toString() {
    return "State{" +
            "stateId=" + stateId +
            ", stateName='" + stateName + '\'' +
            '}';
  }
}
