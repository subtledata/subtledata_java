package com.subtledata.api.models;

public class NewUserDetails {
  /*  */
  private String first_name = null;
  /*  */
  private String last_name = null;
  /*  */
  private String middle_name = null;
  /*  */
  private String device_uuid = null;
  /*  */
  private String dob = null;
  /*  */
  private String email_address = null;
  /*  */
  private Float longitude = null;
  /*  */
  private String cell_phone = null;
  /*  */
  private Float latitude = null;
  /*  */
  private String password = null;
  /*  */
  private String user_name = null;
  public String getFirst_name() {
    return first_name;
  }
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getMiddle_name() {
    return middle_name;
  }
  public void setMiddle_name(String middle_name) {
    this.middle_name = middle_name;
  }

  public String getDevice_uuid() {
    return device_uuid;
  }
  public void setDevice_uuid(String device_uuid) {
    this.device_uuid = device_uuid;
  }

  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getEmail_address() {
    return email_address;
  }
  public void setEmail_address(String email_address) {
    this.email_address = email_address;
  }

  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public String getCell_phone() {
    return cell_phone;
  }
  public void setCell_phone(String cell_phone) {
    this.cell_phone = cell_phone;
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

  public String getUser_name() {
    return user_name;
  }
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserDetails {\n");
    sb.append("  first_name: ").append(first_name).append("\n");
    sb.append("  last_name: ").append(last_name).append("\n");
    sb.append("  middle_name: ").append(middle_name).append("\n");
    sb.append("  device_uuid: ").append(device_uuid).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  email_address: ").append(email_address).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  cell_phone: ").append(cell_phone).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  user_name: ").append(user_name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

