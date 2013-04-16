package com.subtledata.api.models;

public class OrderResults {
  /* Seconds to Wait before checking for new ticket totals */
  private Integer seconds_to_wait = null;
  /* Subtledata Ad Engine URL */
  private String ad_url = null;
  /* Result Status */
  private String result = null;
  /* Call was successful */
  private Boolean success = null;
  public Integer getSeconds_to_wait() {
    return seconds_to_wait;
  }
  public void setSeconds_to_wait(Integer seconds_to_wait) {
    this.seconds_to_wait = seconds_to_wait;
  }

  public String getAd_url() {
    return ad_url;
  }
  public void setAd_url(String ad_url) {
    this.ad_url = ad_url;
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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResults {\n");
    sb.append("  seconds_to_wait: ").append(seconds_to_wait).append("\n");
    sb.append("  ad_url: ").append(ad_url).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

