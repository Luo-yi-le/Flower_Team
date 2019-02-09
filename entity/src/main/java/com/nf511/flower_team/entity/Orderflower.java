package com.nf511.flower_team.entity;

public class Orderflower {

  private long orderflowerId;
  private long flowerId;
  private long orderId;
  private long orderFlowerAmount;


  public long getOrderflowerId() {
    return orderflowerId;
  }

  public void setOrderflowerId(long orderflowerId) {
    this.orderflowerId = orderflowerId;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getOrderFlowerAmount() {
    return orderFlowerAmount;
  }

  public void setOrderFlowerAmount(long orderFlowerAmount) {
    this.orderFlowerAmount = orderFlowerAmount;
  }

  @Override
  public String toString() {
    return "Orderflower{" +
            "orderflowerId=" + orderflowerId +
            ", flowerId=" + flowerId +
            ", orderId=" + orderId +
            ", orderFlowerAmount=" + orderFlowerAmount +
            '}';
  }
}
