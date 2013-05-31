package com.subtledata.api.models;

public class AuthResponse {
  /* SubtleData Device ID */
  private Integer device_id = null;
  /* SubtleData User ID */
  private Integer user_id = null;
  /* Result Status */
  private String result = null;
  /* Call success status */
  private Boolean success = null;
  /* Error */
  private String error = null;
  public Integer getDevice_id() {
    return device_id;
  }
  public void setDevice_id(Integer device_id) {
    this.device_id = device_id;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
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
    sb.append("class AuthResponse {\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

