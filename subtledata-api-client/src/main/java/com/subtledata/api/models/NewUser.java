package com.subtledata.api.models;

public class NewUser {
  /* Device Identifier */
  private String user_guid = null;
  /* User ID */
  private Integer user_id = null;
  /* Device Identifier */
  private Integer device_id = null;
  public String getUser_guid() {
    return user_guid;
  }
  public void setUser_guid(String user_guid) {
    this.user_guid = user_guid;
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
    sb.append("class NewUser {\n");
    sb.append("  user_guid: ").append(user_guid).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

