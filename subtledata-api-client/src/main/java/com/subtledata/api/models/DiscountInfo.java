package com.subtledata.api.models;

public class DiscountInfo {
  /* Local POS discount type */
  private Integer discount_type = null;
  /*  */
  private Integer user_id = null;
  /* Discount ($) to apply to ticket */
  private Float discount_amount = null;
  public Integer getDiscount_type() {
    return discount_type;
  }
  public void setDiscount_type(Integer discount_type) {
    this.discount_type = discount_type;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Float getDiscount_amount() {
    return discount_amount;
  }
  public void setDiscount_amount(Float discount_amount) {
    this.discount_amount = discount_amount;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInfo {\n");
    sb.append("  discount_type: ").append(discount_type).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  discount_amount: ").append(discount_amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

