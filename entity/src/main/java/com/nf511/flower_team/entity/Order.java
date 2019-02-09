package com.nf511.flower_team.entity;


public class Order {

  private long orderId;
  private double orderPrice;
  private long orderState;
  private java.sql.Timestamp orderDate;
  private String orderConsigneeName;
  private String orderConsigneePhone;
  private String orderAddress;
  private String orderDetailedAddress;
  private java.sql.Date orderDeliveryTime;
  private String orderBuyerName;
  private String orderBuyerPhone;
  private String orderGreetingMessage;
  private long userId;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }


  public long getOrderState() {
    return orderState;
  }

  public void setOrderState(long orderState) {
    this.orderState = orderState;
  }


  public java.sql.Timestamp getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Timestamp orderDate) {
    this.orderDate = orderDate;
  }


  public String getOrderConsigneeName() {
    return orderConsigneeName;
  }

  public void setOrderConsigneeName(String orderConsigneeName) {
    this.orderConsigneeName = orderConsigneeName;
  }


  public String getOrderConsigneePhone() {
    return orderConsigneePhone;
  }

  public void setOrderConsigneePhone(String orderConsigneePhone) {
    this.orderConsigneePhone = orderConsigneePhone;
  }


  public String getOrderAddress() {
    return orderAddress;
  }

  public void setOrderAddress(String orderAddress) {
    this.orderAddress = orderAddress;
  }


  public String getOrderDetailedAddress() {
    return orderDetailedAddress;
  }

  public void setOrderDetailedAddress(String orderDetailedAddress) {
    this.orderDetailedAddress = orderDetailedAddress;
  }


  public java.sql.Date getOrderDeliveryTime() {
    return orderDeliveryTime;
  }

  public void setOrderDeliveryTime(java.sql.Date orderDeliveryTime) {
    this.orderDeliveryTime = orderDeliveryTime;
  }


  public String getOrderBuyerName() {
    return orderBuyerName;
  }

  public void setOrderBuyerName(String orderBuyerName) {
    this.orderBuyerName = orderBuyerName;
  }


  public String getOrderBuyerPhone() {
    return orderBuyerPhone;
  }

  public void setOrderBuyerPhone(String orderBuyerPhone) {
    this.orderBuyerPhone = orderBuyerPhone;
  }


  public String getOrderGreetingMessage() {
    return orderGreetingMessage;
  }

  public void setOrderGreetingMessage(String orderGreetingMessage) {
    this.orderGreetingMessage = orderGreetingMessage;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", orderPrice=" + orderPrice +
            ", orderState=" + orderState +
            ", orderDate=" + orderDate +
            ", orderConsigneeName='" + orderConsigneeName + '\'' +
            ", orderConsigneePhone='" + orderConsigneePhone + '\'' +
            ", orderAddress='" + orderAddress + '\'' +
            ", orderDetailedAddress='" + orderDetailedAddress + '\'' +
            ", orderDeliveryTime=" + orderDeliveryTime +
            ", orderBuyerName='" + orderBuyerName + '\'' +
            ", orderBuyerPhone='" + orderBuyerPhone + '\'' +
            ", orderGreetingMessage='" + orderGreetingMessage + '\'' +
            ", userId=" + userId +
            '}';
  }
}
