package com.subtledata.api.models;

public class NewConnection {
  /*  */
  private Integer cover_number = null;
  /*  */
  private Integer user_id = null;
  /*  */
  private String additional_user_name = null;
  /*  */
  private Float longitude = null;
  /*  */
  private Float latitude = null;
  /*  */
  private Integer device_id = null;
  public Integer getCover_number() {
    return cover_number;
  }
  public void setCover_number(Integer cover_number) {
    this.cover_number = cover_number;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public String getAdditional_user_name() {
    return additional_user_name;
  }
  public void setAdditional_user_name(String additional_user_name) {
    this.additional_user_name = additional_user_name;
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

  public Integer getDevice_id() {
    return device_id;
  }
  public void setDevice_id(Integer device_id) {
    this.device_id = device_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConnection {\n");
    sb.append("  cover_number: ").append(cover_number).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  additional_user_name: ").append(additional_user_name).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

