package com.nf511.flower_team.entity;


public class Flowerbranchnumber {

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
    return "Flowerbranchnumber{" +
            "flowerBranchNumberId=" + flowerBranchNumberId +
            ", flowerBranchNumber='" + flowerBranchNumber + '\'' +
            '}';
  }
}
