package com.subtledata.api.models;

public class ExternalPayment {
  /* Payment Status */
  private Integer status = null;
  /* Payment tip amount */
  private Float tip_amount = null;
  /* Payment Total Amount */
  private Float total_amount = null;
  /* Payment amount before tip */
  private Float amount_before_tip = null;
  /* Payment Source */
  private String payment_source = null;
  /* SubtleData External Payment ID */
  private Integer external_payment_id = null;
  /* External Data 1 */
  private String external_response_field_1 = null;
  /* Tender Type */
  private String tender_type_name = null;
  /* External Data 2 */
  private String external_response_field_2 = null;
  /* External Data 3 */
  private String external_response_field_3 = null;
  /* External Data 4 */
  private String external_response_field_4 = null;
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  public Float getTip_amount() {
    return tip_amount;
  }
  public void setTip_amount(Float tip_amount) {
    this.tip_amount = tip_amount;
  }

  public Float getTotal_amount() {
    return total_amount;
  }
  public void setTotal_amount(Float total_amount) {
    this.total_amount = total_amount;
  }

  public Float getAmount_before_tip() {
    return amount_before_tip;
  }
  public void setAmount_before_tip(Float amount_before_tip) {
    this.amount_before_tip = amount_before_tip;
  }

  public String getPayment_source() {
    return payment_source;
  }
  public void setPayment_source(String payment_source) {
    this.payment_source = payment_source;
  }

  public Integer getExternal_payment_id() {
    return external_payment_id;
  }
  public void setExternal_payment_id(Integer external_payment_id) {
    this.external_payment_id = external_payment_id;
  }

  public String getExternal_response_field_1() {
    return external_response_field_1;
  }
  public void setExternal_response_field_1(String external_response_field_1) {
    this.external_response_field_1 = external_response_field_1;
  }

  public String getTender_type_name() {
    return tender_type_name;
  }
  public void setTender_type_name(String tender_type_name) {
    this.tender_type_name = tender_type_name;
  }

  public String getExternal_response_field_2() {
    return external_response_field_2;
  }
  public void setExternal_response_field_2(String external_response_field_2) {
    this.external_response_field_2 = external_response_field_2;
  }

  public String getExternal_response_field_3() {
    return external_response_field_3;
  }
  public void setExternal_response_field_3(String external_response_field_3) {
    this.external_response_field_3 = external_response_field_3;
  }

  public String getExternal_response_field_4() {
    return external_response_field_4;
  }
  public void setExternal_response_field_4(String external_response_field_4) {
    this.external_response_field_4 = external_response_field_4;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPayment {\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tip_amount: ").append(tip_amount).append("\n");
    sb.append("  total_amount: ").append(total_amount).append("\n");
    sb.append("  amount_before_tip: ").append(amount_before_tip).append("\n");
    sb.append("  payment_source: ").append(payment_source).append("\n");
    sb.append("  external_payment_id: ").append(external_payment_id).append("\n");
    sb.append("  external_response_field_1: ").append(external_response_field_1).append("\n");
    sb.append("  tender_type_name: ").append(tender_type_name).append("\n");
    sb.append("  external_response_field_2: ").append(external_response_field_2).append("\n");
    sb.append("  external_response_field_3: ").append(external_response_field_3).append("\n");
    sb.append("  external_response_field_4: ").append(external_response_field_4).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

