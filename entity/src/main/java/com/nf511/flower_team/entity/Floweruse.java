package com.nf511.flower_team.entity;


public class Floweruse {

  private long flowerUseId;
  private String flowerUseName;


  public long getFlowerUseId() {
    return flowerUseId;
  }

  public void setFlowerUseId(long flowerUseId) {
    this.flowerUseId = flowerUseId;
  }


  public String getFlowerUseName() {
    return flowerUseName;
  }

  public void setFlowerUseName(String flowerUseName) {
    this.flowerUseName = flowerUseName;
  }

  @Override
  public String toString() {
    return "Floweruse{" +
            "flowerUseId=" + flowerUseId +
            ", flowerUseName='" + flowerUseName + '\'' +
            '}';
  }
}
