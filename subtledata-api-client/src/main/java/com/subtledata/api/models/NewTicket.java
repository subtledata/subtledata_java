package com.subtledata.api.models;

public class NewTicket {
  /*  */
  private Integer employee_id = null;
  /* SubtleData User ID */
  private Integer user_id = null;
  /* Number of people in party */
  private Integer number_of_people_in_party = null;
  /* Custom Ticket Name to be Displayed */
  private String custom_ticket_name = null;
  /* Table ID for the new ticket */
  private Integer table_id = null;
  /* Subtledata Revenue Center ID */
  private Integer revenue_center_id = null;
  /* Associated Device ID for user */
  private Integer device_id = null;
  public Integer getEmployee_id() {
    return employee_id;
  }
  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public Integer getNumber_of_people_in_party() {
    return number_of_people_in_party;
  }
  public void setNumber_of_people_in_party(Integer number_of_people_in_party) {
    this.number_of_people_in_party = number_of_people_in_party;
  }

  public String getCustom_ticket_name() {
    return custom_ticket_name;
  }
  public void setCustom_ticket_name(String custom_ticket_name) {
    this.custom_ticket_name = custom_ticket_name;
  }

  public Integer getTable_id() {
    return table_id;
  }
  public void setTable_id(Integer table_id) {
    this.table_id = table_id;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
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
    sb.append("class NewTicket {\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  number_of_people_in_party: ").append(number_of_people_in_party).append("\n");
    sb.append("  custom_ticket_name: ").append(custom_ticket_name).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

