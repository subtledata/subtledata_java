package com.subtledata.api.models;

public class DeleteUserStatus {
  /* Result Status */
  private String result = null;
  /* Call success status */
  private Boolean success = null;
  /* Error */
  private String error = null;
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
    sb.append("class DeleteUserStatus {\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

