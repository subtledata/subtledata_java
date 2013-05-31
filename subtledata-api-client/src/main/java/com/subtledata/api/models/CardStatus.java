package com.subtledata.api.models;

public class CardStatus {
  /* New Card ID */
  private String card_id = null;
  /* Result Status */
  private String result = null;
  /* Call success status */
  private Boolean success = null;
  /* Error */
  private String error = null;
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

  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardStatus {\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

