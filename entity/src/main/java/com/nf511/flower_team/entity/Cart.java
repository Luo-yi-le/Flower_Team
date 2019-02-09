package com.nf511.flower_team.entity;


public class Cart {

  private long cartId;
  private long flowerId;
  private long userId;
  private long cartAmount;


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public long getFlowerId() {
    return flowerId;
  }

  public void setFlowerId(long flowerId) {
    this.flowerId = flowerId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCartAmount() {
    return cartAmount;
  }

  public void setCartAmount(long cartAmount) {
    this.cartAmount = cartAmount;
  }

  @Override
  public String toString() {
    return "Cart{" +
            "cartId=" + cartId +
            ", flowerId=" + flowerId +
            ", userId=" + userId +
            ", cartAmount=" + cartAmount +
            '}';
  }
}
