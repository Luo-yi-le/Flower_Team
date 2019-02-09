package com.nf511.flower_team.entity;

public class Collect {

  private long collectId;
  private long flowerId;


  public long getCollectId() {
    return collectId;
  }

  public void setCollectId(long collectId) {
    this.collectId = collectId;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }

  @Override
  public String toString() {
    return "Collect{" +
            "collectId=" + collectId +
            ", flowerId=" + flowerId +
            '}';
  }
}
