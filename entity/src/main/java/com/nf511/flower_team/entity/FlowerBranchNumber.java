package com.nf511.flower_team.entity;

public class FlowerBranchNumber {

  private long flowerBranchNumberId;
  private String flowerBranchNumber;


  public long getFlowerBranchNumberId() {
    return flowerBranchNumberId;
  }

  public void setFlowerBranchNumberId(long flowerBranchNumberId) {
    this.flowerBranchNumberId = flowerBranchNumberId;
  }


  public String getFlowerBranchNumber() {
    return flowerBranchNumber;
  }

  public void setFlowerBranchNumber(String flowerBranchNumber) {
    this.flowerBranchNumber = flowerBranchNumber;
  }

  @Override
  public String toString() {
    return "FlowerBranchNumber{" +
            "flowerBranchNumberId=" + flowerBranchNumberId +
            ", flowerBranchNumber='" + flowerBranchNumber + '\'' +
            '}';
  }
}
