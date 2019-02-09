package com.nf511.flower_team.entity;

public class User {

  private long userId;
  private String userPassword;
  private String userSex;
  private String userName;
  private String userMailbox;
  private String userPhone;
  private String userAddress;
  private String userHeadPortrait;
  private java.sql.Date userBirthday;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserMailbox() {
    return userMailbox;
  }

  public void setUserMailbox(String userMailbox) {
    this.userMailbox = userMailbox;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public String getUserHeadPortrait() {
    return userHeadPortrait;
  }

  public void setUserHeadPortrait(String userHeadPortrait) {
    this.userHeadPortrait = userHeadPortrait;
  }


  public java.sql.Date getUserBirthday() {
    return userBirthday;
  }

  public void setUserBirthday(java.sql.Date userBirthday) {
    this.userBirthday = userBirthday;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userPassword='" + userPassword + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userName='" + userName + '\'' +
            ", userMailbox='" + userMailbox + '\'' +
            ", userPhone='" + userPhone + '\'' +
            ", userAddress='" + userAddress + '\'' +
            ", userHeadPortrait='" + userHeadPortrait + '\'' +
            ", userBirthday=" + userBirthday +
            '}';
  }
}
