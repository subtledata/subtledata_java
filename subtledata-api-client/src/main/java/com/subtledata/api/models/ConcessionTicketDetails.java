package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Item;
import com.subtledata.api.models.CardPayment;
public class ConcessionTicketDetails {
  /*  */
  private Integer employee_id = null;
  /* SubtleData User ID */
  private Integer user_id = null;
  /* Number of people in party */
  private Integer number_of_people_in_party = null;
  /* Custom ticket notes */
  private String ticket_notes = null;
  private List<Item> items = new ArrayList<Item>();
  /* Subtledata Terminal ID */
  private Integer terminal_id = null;
  /* Table ID for the new ticket */
  private Integer table_id = null;
  /* Subtledata Revenue Center ID */
  private Integer revenue_center_id = null;
  private List<CardPayment> card_payments = new ArrayList<CardPayment>();
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

  public String getTicket_notes() {
    return ticket_notes;
  }
  public void setTicket_notes(String ticket_notes) {
    this.ticket_notes = ticket_notes;
  }

  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Integer getTerminal_id() {
    return terminal_id;
  }
  public void setTerminal_id(Integer terminal_id) {
    this.terminal_id = terminal_id;
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

  public List<CardPayment> getCard_payments() {
    return card_payments;
  }
  public void setCard_payments(List<CardPayment> card_payments) {
    this.card_payments = card_payments;
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
    sb.append("class ConcessionTicketDetails {\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  number_of_people_in_party: ").append(number_of_people_in_party).append("\n");
    sb.append("  ticket_notes: ").append(ticket_notes).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  terminal_id: ").append(terminal_id).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  card_payments: ").append(card_payments).append("\n");
    sb.append("  device_id: ").append(device_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

