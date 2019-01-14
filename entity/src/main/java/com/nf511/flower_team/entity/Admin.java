package com.nf511.flower_team.entity;


public class Admin {

  private long adminId;
  private String adminAccount;
  private String adminPassword;


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }


  public String getAdminAccount() {
    return adminAccount;
  }

  public void setAdminAccount(String adminAccount) {
    this.adminAccount = adminAccount;
  }


  public String getAdminPassword() {
    return adminPassword;
  }

  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }

  @Override
  public String toString() {
    return "Admin{" +
            "adminId=" + adminId +
            ", adminAccount='" + adminAccount + '\'' +
            ", adminPassword='" + adminPassword + '\'' +
            '}';
  }
}
