package com.subtledata.api.models;

public class NewExternalPayment {
  /*  */
  private String payment_source_name = null;
  /*  */
  private Float tip_amount = null;
  /*  */
  private String payment_response_tracking_2 = null;
  /*  */
  private String payment_response_tracking_3 = null;
  /*  */
  private String payment_response_tracking_1 = null;
  /*  */
  private String payment_response_tracking_4 = null;
  /*  */
  private Float amount_before_tip = null;
  /*  */
  private Integer tender_type_id = null;
  /*  */
  private Integer user_id = null;
  /*  */
  private Integer device_id = null;
  public String getPayment_source_name() {
    return payment_source_name;
  }
  public void setPayment_source_name(String payment_source_name) {
    this.payment_source_name = payment_source_name;
  }

  public Float getTip_amount() {
    return tip_amount;
  }
  public void setTip_amount(Float tip_amount) {
    this.tip_amount = tip_amount;
  }

  public String getPayment_response_tracking_2() {
    return payment_response_tracking_2;
  }
  public void setPayment_response_tracking_2(String payment_response_tracking_2) {
    this.payment_response_tracking_2 = payment_response_tracking_2;
  }

  public String getPayment_response_tracking_3() {
    return payment_response_tracking_3;
  }
  public void setPayment_response_tracking_3(String payment_response_tracking_3) {
    this.payment_response_tracking_3 = payment_response_tracking_3;
  }

  public String getPayment_response_tracking_1() {
    return payment_response_tracking_1;
  }
  public void setPayment_response_tracking_1(String payment_response_tracking_1) {
    this.payment_response_tracking_1 = payment_response_tracking_1;
  }

  public String getPayment_response_tracking_4() {
    return payment_response_tracking_4;
  }
  public void setPayment_response_tracking_4(String payment_response_tracking_4) {
    this.payment_response_tracking_4 = payment_response_tracking_4;
  }

  public Float getAmount_before_tip() {
    return amount_before_tip;
  }
  public void setAmount_before_tip(Float amount_before_tip) {
    this.amount_before_tip = amount_before_tip;
  }

  public Integer getTender_type_id() {
    return tender_type_id;
  }
  public void setTender_type_id(Integer tender_type_id) {
    this.tender_type_id = tender_type_id;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Integer getDevice_id() {
    return device_id;
  }
  public void setDevice_id(Integer device_id) {
    this.device_id = device_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewExternalPayment {\n");
    sb.append("  payment_source_name: ").append(payment_source_name).append("\n");
    sb.append("  tip_amount: ").append(tip_amount).append("\n");
    sb.append("  payment_response_tracking_2: ").append(payment_response_tracking_2).append("\n");
    sb.append("  payment_response_tracking_3: ").append(payment_response_tracking_3).append("\n");
    sb.append("  payment_response_tracking_1: ").append(payment_response_tracking_1).append("\n");
    sb.append("  payment_response_tracking_4: ").append(payment_response_tracking_4).append("\n");
    sb.append("  amount_before_tip: ").append(amount_before_tip).append("\n");
    sb.append("  tender_type_id: ").append(tender_type_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

