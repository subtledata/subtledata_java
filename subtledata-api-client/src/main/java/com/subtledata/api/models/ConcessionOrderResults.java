package com.subtledata.api.models;

public class ConcessionOrderResults {
  /* Payment Success Flag */
  private Boolean payment_success = null;
  /* Error */
  private String error = null;
  /* New Ticket ID */
  private Integer ticket_id = null;
  /* Call success status */
  private Boolean success = null;
  /* Result Status */
  private String result = null;
  public Boolean getPayment_success() {
    return payment_success;
  }
  public void setPayment_success(Boolean payment_success) {
    this.payment_success = payment_success;
  }

  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  public Integer getTicket_id() {
    return ticket_id;
  }
  public void setTicket_id(Integer ticket_id) {
    this.ticket_id = ticket_id;
  }

  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcessionOrderResults {\n");
    sb.append("  payment_success: ").append(payment_success).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

