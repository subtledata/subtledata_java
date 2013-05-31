package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.PreAuthCard;
import com.subtledata.api.models.Payment;
import com.subtledata.api.models.Item;
import com.subtledata.api.models.ConnectedUser;
import com.subtledata.api.models.ExternalPayment;
import com.subtledata.api.models.PreAuthPayment;
public class Ticket {
  /* Date Closed (UTC) */
  private String date_closed = null;
  /* Tax amount */
  private Float tax = null;
  /* Date Opened (UTC) */
  private String date_opened = null;
  /* Total amount */
  private Float total = null;
  /* Location ID */
  private Integer location_id = null;
  /* Employee ID */
  private Integer employee_id = null;
  /* Ticket open/closed status */
  private Boolean ticket_open = null;
  private List<PreAuthPayment> pre_auth_payments = new ArrayList<PreAuthPayment>();
  /* Ticket remaining balance */
  private Float remaining_balance = null;
  /* Ticket ID */
  private Integer ticket_id = null;
  /* Table Name */
  private String table_name = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  /* User ID */
  private Integer user_id = null;
  private List<PreAuthCard> pre_auth_cards = new ArrayList<PreAuthCard>();
  /* Discount amount */
  private Float discount = null;
  private List<ExternalPayment> external_payments = new ArrayList<ExternalPayment>();
  /* Cover Count */
  private Integer cover_count = null;
  /* Subtotal amount */
  private Float subtotal = null;
  /* Service charge */
  private Float service_charge = null;
  /* Date Modified (UTC) */
  private String date_modified = null;
  private List<Item> items = new ArrayList<Item>();
  /* POS System Ticket Identifier */
  private Integer pos_ticket_id = null;
  /* Table ID */
  private Integer table_id = null;
  private List<Payment> payments = new ArrayList<Payment>();
  private List<ConnectedUser> connected_users = new ArrayList<ConnectedUser>();
  public String getDate_closed() {
    return date_closed;
  }
  public void setDate_closed(String date_closed) {
    this.date_closed = date_closed;
  }

  public Float getTax() {
    return tax;
  }
  public void setTax(Float tax) {
    this.tax = tax;
  }

  public String getDate_opened() {
    return date_opened;
  }
  public void setDate_opened(String date_opened) {
    this.date_opened = date_opened;
  }

  public Float getTotal() {
    return total;
  }
  public void setTotal(Float total) {
    this.total = total;
  }

  public Integer getLocation_id() {
    return location_id;
  }
  public void setLocation_id(Integer location_id) {
    this.location_id = location_id;
  }

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

  public List<PreAuthPayment> getPre_auth_payments() {
    return pre_auth_payments;
  }
  public void setPre_auth_payments(List<PreAuthPayment> pre_auth_payments) {
    this.pre_auth_payments = pre_auth_payments;
  }

  public Float getRemaining_balance() {
    return remaining_balance;
  }
  public void setRemaining_balance(Float remaining_balance) {
    this.remaining_balance = remaining_balance;
  }

  public Integer getTicket_id() {
    return ticket_id;
  }
  public void setTicket_id(Integer ticket_id) {
    this.ticket_id = ticket_id;
  }

  public String getTable_name() {
    return table_name;
  }
  public void setTable_name(String table_name) {
    this.table_name = table_name;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
  }

  public Integer getUser_id() {
    return user_id;
  }
  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public List<PreAuthCard> getPre_auth_cards() {
    return pre_auth_cards;
  }
  public void setPre_auth_cards(List<PreAuthCard> pre_auth_cards) {
    this.pre_auth_cards = pre_auth_cards;
  }

  public Float getDiscount() {
    return discount;
  }
  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public List<ExternalPayment> getExternal_payments() {
    return external_payments;
  }
  public void setExternal_payments(List<ExternalPayment> external_payments) {
    this.external_payments = external_payments;
  }

  public Integer getCover_count() {
    return cover_count;
  }
  public void setCover_count(Integer cover_count) {
    this.cover_count = cover_count;
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

  public String getDate_modified() {
    return date_modified;
  }
  public void setDate_modified(String date_modified) {
    this.date_modified = date_modified;
  }

  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Integer getPos_ticket_id() {
    return pos_ticket_id;
  }
  public void setPos_ticket_id(Integer pos_ticket_id) {
    this.pos_ticket_id = pos_ticket_id;
  }

  public Integer getTable_id() {
    return table_id;
  }
  public void setTable_id(Integer table_id) {
    this.table_id = table_id;
  }

  public List<Payment> getPayments() {
    return payments;
  }
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public List<ConnectedUser> getConnected_users() {
    return connected_users;
  }
  public void setConnected_users(List<ConnectedUser> connected_users) {
    this.connected_users = connected_users;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    sb.append("  date_closed: ").append(date_closed).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  date_opened: ").append(date_opened).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  location_id: ").append(location_id).append("\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("  ticket_open: ").append(ticket_open).append("\n");
    sb.append("  pre_auth_payments: ").append(pre_auth_payments).append("\n");
    sb.append("  remaining_balance: ").append(remaining_balance).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  table_name: ").append(table_name).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  pre_auth_cards: ").append(pre_auth_cards).append("\n");
    sb.append("  discount: ").append(discount).append("\n");
    sb.append("  external_payments: ").append(external_payments).append("\n");
    sb.append("  cover_count: ").append(cover_count).append("\n");
    sb.append("  subtotal: ").append(subtotal).append("\n");
    sb.append("  service_charge: ").append(service_charge).append("\n");
    sb.append("  date_modified: ").append(date_modified).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  pos_ticket_id: ").append(pos_ticket_id).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  payments: ").append(payments).append("\n");
    sb.append("  connected_users: ").append(connected_users).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

