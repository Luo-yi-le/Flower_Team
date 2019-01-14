package com.nf511.flower_team.entity;


public class Flower {

  private long flowerId;
  private long flowerTypeId;
  private long flowerUseId;
  private long flowerBranchNumberId;
  private double marketPrice;
  private double price;
  private long inventory;
  private String imageName;
  private String flowerName;
  private java.sql.Timestamp insertDateTime;


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }


  public long getFlowerTypeId() {
    return flowerTypeId;
  }

  public void setFlowerTypeId(long flowerTypeId) {
    this.flowerTypeId = flowerTypeId;
  }


  public long getFlowerUseId() {
    return flowerUseId;
  }

  public void setFlowerUseId(long flowerUseId) {
    this.flowerUseId = flowerUseId;
  }


  public long getFlowerBranchNumberId() {
    return flowerBranchNumberId;
  }

  public void setFlowerBranchNumberId(long flowerBranchNumberId) {
    this.flowerBranchNumberId = flowerBranchNumberId;
  }


  public double getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getInventory() {
    return inventory;
  }

  public void setInventory(long inventory) {
    this.inventory = inventory;
  }


  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public String getFlowerName() {
    return flowerName;
  }

  public void setFlowerName(String flowerName) {
    this.flowerName = flowerName;
  }


  public java.sql.Timestamp getInsertDateTime() {
    return insertDateTime;
  }

  public void setInsertDateTime(java.sql.Timestamp insertDateTime) {
    this.insertDateTime = insertDateTime;
  }

  @Override
  public String toString() {
    return "Flower{" +
            "flowerId=" + flowerId +
            ", flowerTypeId=" + flowerTypeId +
            ", flowerUseId=" + flowerUseId +
            ", flowerBranchNumberId=" + flowerBranchNumberId +
            ", marketPrice=" + marketPrice +
            ", price=" + price +
            ", inventory=" + inventory +
            ", imageName='" + imageName + '\'' +
            ", flowerName='" + flowerName + '\'' +
            ", insertDateTime=" + insertDateTime +
            '}';
  }
}
