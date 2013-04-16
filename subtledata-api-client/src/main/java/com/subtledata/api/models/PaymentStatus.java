package com.subtledata.api.models;

public class PaymentStatus {
  /* SubtleData User ID */
  private Integer user_id = null;
  /* Call was successful */
  private Boolean success = null;
  /* New Card ID */
  private String card_id = null;
  /* Result Status */
  private String result = null;
  /* Error */
  private String error = null;
  /* SubtleData Device ID */
  private Integer device_id = null;
  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getCard_id() {
    return card_id;
  }
  public void setCard_id(String card_id) {
    this.card_id = card_id;
  }

  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
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
    sb.append("class PaymentStatus {\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

