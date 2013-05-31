package com.subtledata.api.models;

public class User {
  /* First Name */
  private String first_name = null;
  /* Last Name */
  private String last_name = null;
  /* User ID */
  private Integer user_id = null;
  /* Last Known Longitude */
  private Float last_known_lon = null;
  /* Email Address */
  private String email_address = null;
  /* Date of Birth */
  private String dob = null;
  /* Last Known Latitude */
  private Float last_known_lat = null;
  /* Middle Name */
  private String middle_name = null;
  /* Cell Phone */
  private String cell_phone = null;
  /* User Name */
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

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Float getLast_known_lon() {
    return last_known_lon;
  }
  public void setLast_known_lon(Float last_known_lon) {
    this.last_known_lon = last_known_lon;
  }

  public String getEmail_address() {
    return email_address;
  }
  public void setEmail_address(String email_address) {
    this.email_address = email_address;
  }

  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  public Float getLast_known_lat() {
    return last_known_lat;
  }
  public void setLast_known_lat(Float last_known_lat) {
    this.last_known_lat = last_known_lat;
  }

  public String getMiddle_name() {
    return middle_name;
  }
  public void setMiddle_name(String middle_name) {
    this.middle_name = middle_name;
  }

  public String getCell_phone() {
    return cell_phone;
  }
  public void setCell_phone(String cell_phone) {
    this.cell_phone = cell_phone;
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
    sb.append("class User {\n");
    sb.append("  first_name: ").append(first_name).append("\n");
    sb.append("  last_name: ").append(last_name).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  last_known_lon: ").append(last_known_lon).append("\n");
    sb.append("  email_address: ").append(email_address).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  last_known_lat: ").append(last_known_lat).append("\n");
    sb.append("  middle_name: ").append(middle_name).append("\n");
    sb.append("  cell_phone: ").append(cell_phone).append("\n");
    sb.append("  user_name: ").append(user_name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

