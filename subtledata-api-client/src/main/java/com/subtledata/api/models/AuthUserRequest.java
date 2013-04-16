package com.subtledata.api.models;

public class AuthUserRequest {
  /*  */
  private String username = null;
  /*  */
  private Integer user_id = null;
  /*  */
  private String device_uuid = null;
  /*  */
  private Float longitude = null;
  /*  */
  private Float latitude = null;
  /*  */
  private String password = null;
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public String getDevice_uuid() {
    return device_uuid;
  }
  public void setDevice_uuid(String device_uuid) {
    this.device_uuid = device_uuid;
  }

  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserRequest {\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  device_uuid: ").append(device_uuid).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

