package com.nf511.flower_team.entity;


public class Flowertype {

  private long flowerTypeId;
  private String flowerTypeName;


  public long getFlowerTypeId() {
    return flowerTypeId;
  }

  public void setFlowerTypeId(long flowerTypeId) {
    this.flowerTypeId = flowerTypeId;
  }


  public String getFlowerTypeName() {
    return flowerTypeName;
  }

  public void setFlowerTypeName(String flowerTypeName) {
    this.flowerTypeName = flowerTypeName;
  }

  @Override
  public String toString() {
    return "Flowertype{" +
            "flowerTypeId=" + flowerTypeId +
            ", flowerTypeName='" + flowerTypeName + '\'' +
            '}';
  }
}
