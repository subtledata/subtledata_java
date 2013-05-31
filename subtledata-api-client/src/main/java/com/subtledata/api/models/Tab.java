package com.subtledata.api.models;

public class Tab {
  /* SubtleData Payment ID */
  private Integer payment_id = null;
  /* Name on Credit Card */
  private String name_on_card = null;
  /* Credit Card Type */
  private String card_type = null;
  /* Expiration Year */
  private String expiration_year = null;
  /* Credit Card Nickname */
  private String card_nickname = null;
  /* SubtleData Credit Card ID */
  private Integer card_id = null;
  /* Expiration Month */
  private String expiration_month = null;
  /* POS System Ticket Identifier */
  private Integer pos_ticket_id = null;
  /* Table ID */
  private Integer table_id = null;
  /* Ticket ID */
  private Integer ticket_id = null;
  /* Table Name */
  private String table_name = null;
  /* Pre Auth Amount */
  private Float pre_auth_amount = null;
  /* Last 4 Digits on Card */
  private String last_4_digits = null;
  public Integer getPayment_id() {
    return payment_id;
  }
  public void setPayment_id(Integer payment_id) {
    this.payment_id = payment_id;
  }

  public String getName_on_card() {
    return name_on_card;
  }
  public void setName_on_card(String name_on_card) {
    this.name_on_card = name_on_card;
  }

  public String getCard_type() {
    return card_type;
  }
  public void setCard_type(String card_type) {
    this.card_type = card_type;
  }

  public String getExpiration_year() {
    return expiration_year;
  }
  public void setExpiration_year(String expiration_year) {
    this.expiration_year = expiration_year;
  }

  public String getCard_nickname() {
    return card_nickname;
  }
  public void setCard_nickname(String card_nickname) {
    this.card_nickname = card_nickname;
  }

  public Integer getCard_id() {
    return card_id;
  }
  public void setCard_id(Integer card_id) {
    this.card_id = card_id;
  }

  public String getExpiration_month() {
    return expiration_month;
  }
  public void setExpiration_month(String expiration_month) {
    this.expiration_month = expiration_month;
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

  public Float getPre_auth_amount() {
    return pre_auth_amount;
  }
  public void setPre_auth_amount(Float pre_auth_amount) {
    this.pre_auth_amount = pre_auth_amount;
  }

  public String getLast_4_digits() {
    return last_4_digits;
  }
  public void setLast_4_digits(String last_4_digits) {
    this.last_4_digits = last_4_digits;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tab {\n");
    sb.append("  payment_id: ").append(payment_id).append("\n");
    sb.append("  name_on_card: ").append(name_on_card).append("\n");
    sb.append("  card_type: ").append(card_type).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  card_nickname: ").append(card_nickname).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  pos_ticket_id: ").append(pos_ticket_id).append("\n");
    sb.append("  table_id: ").append(table_id).append("\n");
    sb.append("  ticket_id: ").append(ticket_id).append("\n");
    sb.append("  table_name: ").append(table_name).append("\n");
    sb.append("  pre_auth_amount: ").append(pre_auth_amount).append("\n");
    sb.append("  last_4_digits: ").append(last_4_digits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

