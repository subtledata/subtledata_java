package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Item;
public class OpenTicket {
  /* Employee ID */
  private Integer employee_id = null;
  /* User ID */
  private Integer user_id = null;
  /* Number of guests on ticket */
  private Integer number_of_guests = null;
  private List<Item> items = new ArrayList<Item>();
  /* Tax amount */
  private Float tax = null;
  /* Discount amount */
  private Float discount = null;
  /* POS System Ticket Identifier */
  private Integer pos_ticket_id = null;
  /* Ticket remaining balance */
  private Float remaining_balance = null;
  /* Table ID */
  private Integer table_id = null;
  /* Ticket ID */
  private Integer ticket_id = null;
  /* Date/Time Ticket Opened */
  private String date_opened = null;
  /* Table Name */
  private String table_name = null;
  /* Total amount */
  private Float total = null;
  /* Subtotal amount */
  private Float subtotal = null;
  /* Service charge */
  private Float service_charge = null;
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

  public Integer getNumber_of_guests() {
    return number_of_guests;
  }
  public void setNumber_of_guests(Integer number_of_guests) {
    this.number_of_guests = number_of_guests;
  }

  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Float getTax() {
    return tax;
  }
  public void setTax(Float tax) {
    this.tax = tax;
  }

  public Float getDiscount() {
    return discount;
  }
  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public Integer getPos_ticket_id() {
    return pos_ticket_id;
  }
  public void setPos_ticket_id(Integer pos_ticket_id) {
    this.pos_ticket_id = pos_ticket_id;
  }

  public Float getRemaining_balance() {
    return remaining_balance;
  }
  public void setRemaining_balance(Float remaining_balance) {
    this.remaining_balance = remaining_balance;
  }

  public Integer getTable_id() {
    return table_id;
  }
  public void setTable_id(Integer table_id) {
    this.table_id = table_id;
  }

  public Integer getTicket_id() {
    return ticket_id;
  }
  public void setTicket_id(Integer ticket_id) {
    this.ticket_id = ticket_id;
  }

  public String getDate_opened() {
    return date_opened;
  }
  public void setDate_opened(String date_opened) {
    this.date_opened = date_opened;
  }

  public String getTable_name() {
    return table_name;
  }
  public void setTable_name(String table_name) {
    this.table_name = table_name;
  }

  public Float getTotal() {
    return total;
  }
  public void setTotal(Float total) {
    this.total = total;
  }

  public Float getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Float subtotal) {
    this.subtotal = subtotal;
  }

  public Float getService_charge() {
    return service_charge;
  }
  public void setService_charge(Float service_charge) {
    this.service_charge = service_charge;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTicket {\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  number_of_guests: ").append(number_of_guests).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  pos_ticket_id: ").append(pos_ticket_id).append("\n");
    sb.append("  remaining_balance: ").append(remaining_balance).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  date_opened: ").append(date_opened).append("\n");
    sb.append("  table_name: ").append(table_name).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  subtotal: ").append(subtotal).append("\n");
    sb.append("  service_charge: ").append(service_charge).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

