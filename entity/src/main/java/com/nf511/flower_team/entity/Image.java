package com.nf511.flower_team.entity;


public class Image {

  private long imageId;
  private String imageName;
  private long flowerId;


  public long getImageId() {
    return imageId;
  }

  public void setImageId(long imageId) {
    this.imageId = imageId;
  }


  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }

  @Override
  public String toString() {
    return "Image{" +
            "imageId=" + imageId +
            ", imageName='" + imageName + '\'' +
            ", flowerId=" + flowerId +
            '}';
  }
}
