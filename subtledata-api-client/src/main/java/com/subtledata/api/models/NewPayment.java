package com.subtledata.api.models;

public class NewPayment {
  /*  */
  private Float tip_amount = null;
  /*  */
  private Integer tip_type = null;
  /*  */
  private Boolean testing = null;
  /*  */
  private String card_cvv = null;
  /*  */
  private Integer card_id = null;
  /*  */
  private Float amount_before_tip = null;
  /*  */
  private Integer user_id = null;
  public Float getTip_amount() {
    return tip_amount;
  }
  public void setTip_amount(Float tip_amount) {
    this.tip_amount = tip_amount;
  }

  public Integer getTip_type() {
    return tip_type;
  }
  public void setTip_type(Integer tip_type) {
    this.tip_type = tip_type;
  }

  public Boolean getTesting() {
    return testing;
  }
  public void setTesting(Boolean testing) {
    this.testing = testing;
  }

  public String getCard_cvv() {
    return card_cvv;
  }
  public void setCard_cvv(String card_cvv) {
    this.card_cvv = card_cvv;
  }

  public Integer getCard_id() {
    return card_id;
  }
  public void setCard_id(Integer card_id) {
    this.card_id = card_id;
  }

  public Float getAmount_before_tip() {
    return amount_before_tip;
  }
  public void setAmount_before_tip(Float amount_before_tip) {
    this.amount_before_tip = amount_before_tip;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPayment {\n");
    sb.append("  tip_amount: ").append(tip_amount).append("\n");
    sb.append("  tip_type: ").append(tip_type).append("\n");
    sb.append("  testing: ").append(testing).append("\n");
    sb.append("  card_cvv: ").append(card_cvv).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  amount_before_tip: ").append(amount_before_tip).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

