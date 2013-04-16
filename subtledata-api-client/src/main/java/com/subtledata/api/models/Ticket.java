package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Payment;
import com.subtledata.api.models.Item;
import com.subtledata.api.models.ConnectedUser;
public class Ticket {
  /* Employee ID */
  private Integer employee_id = null;
  /* Ticket open/closed status */
  private Boolean ticket_open = null;
  private List<Item> items = new ArrayList<Item>();
  /* Tax amount */
  private Float tax = null;
  /* Table ID */
  private Integer table_id = null;
  /* Discount amount */
  private Float discount = null;
  /* POS System Ticket Identifier */
  private Integer pos_ticket_id = null;
  /* Ticket remaining balance */
  private Float remaining_balance = null;
  /* Table Name */
  private String table_name = null;
  /* Ticket ID */
  private Integer ticket_id = null;
  private List<ConnectedUser> connected_users = new ArrayList<ConnectedUser>();
  /* User ID */
  private Integer user_id = null;
  /* Total amount */
  private Float total = null;
  /* Subtotal amount */
  private Float subtotal = null;
  /* Service charge */
  private Float service_charge = null;
  private List<Payment> payments = new ArrayList<Payment>();
  public Integer getEmployee_id() {
    return employee_id;
  }
  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public Boolean getTicket_open() {
    return ticket_open;
  }
  public void setTicket_open(Boolean ticket_open) {
    this.ticket_open = ticket_open;
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

  public Integer getTable_id() {
    return table_id;
  }
  public void setTable_id(Integer table_id) {
    this.table_id = table_id;
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

  public String getTable_name() {
    return table_name;
  }
  public void setTable_name(String table_name) {
    this.table_name = table_name;
  }

  public Integer getTicket_id() {
    return ticket_id;
  }
  public void setTicket_id(Integer ticket_id) {
    this.ticket_id = ticket_id;
  }

  public List<ConnectedUser> getConnected_users() {
    return connected_users;
  }
  public void setConnected_users(List<ConnectedUser> connected_users) {
    this.connected_users = connected_users;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
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

  public List<Payment> getPayments() {
    return payments;
  }
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("  ticket_open: ").append(ticket_open).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  pos_ticket_id: ").append(pos_ticket_id).append("\n");
    sb.append("  remaining_balance: ").append(remaining_balance).append("\n");
    sb.append("  table_name: ").append(table_name).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  connected_users: ").append(connected_users).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  subtotal: ").append(subtotal).append("\n");
    sb.append("  service_charge: ").append(service_charge).append("\n");
    sb.append("  payments: ").append(payments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

