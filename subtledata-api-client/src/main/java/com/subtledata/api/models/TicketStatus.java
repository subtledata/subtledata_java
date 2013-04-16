package com.subtledata.api.models;

public class TicketStatus {
  /* Error */
  private String error = null;
  /* New Ticket ID */
  private String ticket_id = null;
  /* Call was successful */
  private Boolean success = null;
  /* Result Status */
  private String result = null;
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  public String getTicket_id() {
    return ticket_id;
  }
  public void setTicket_id(String ticket_id) {
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
    sb.append("class TicketStatus {\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

