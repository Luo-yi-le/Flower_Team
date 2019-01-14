package com.nf511.flower_team.entity;


public class User {

  private long userId;
  private String userAccount;
  private String userPassword;
  private String userName;
  private String userMailbox;
  private String userPhone;
  private String leaveAMessage;
  private String userHeadPortrait;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
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


  public String getLeaveAMessage() {
    return leaveAMessage;
  }

  public void setLeaveAMessage(String leaveAMessage) {
    this.leaveAMessage = leaveAMessage;
  }


  public String getUserHeadPortrait() {
    return userHeadPortrait;
  }

  public void setUserHeadPortrait(String userHeadPortrait) {
    this.userHeadPortrait = userHeadPortrait;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userAccount='" + userAccount + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", userName='" + userName + '\'' +
            ", userMailbox='" + userMailbox + '\'' +
            ", userPhone='" + userPhone + '\'' +
            ", leaveAMessage='" + leaveAMessage + '\'' +
            ", userHeadPortrait='" + userHeadPortrait + '\'' +
            '}';
  }
}
