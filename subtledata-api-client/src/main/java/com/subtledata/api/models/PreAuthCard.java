package com.subtledata.api.models;

public class PreAuthCard {
  /* Name on Credit Card */
  private String name_on_card = null;
  /* Credit Card Type */
  private String card_type = null;
  /* Card Billing Address */
  private String billing_address = null;
  /* Expiration Year */
  private String expiration_year = null;
  /* SubtleData Credit Card ID */
  private Integer card_id = null;
  /* Expiration Month */
  private String expiration_month = null;
  /* Card Billing Zip */
  private String billing_zip = null;
  /* Credit Card Nickname */
  private String nickname = null;
  /* Last 4 Digits on Card */
  private String last_4_digits = null;
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

  public String getBilling_address() {
    return billing_address;
  }
  public void setBilling_address(String billing_address) {
    this.billing_address = billing_address;
  }

  public String getExpiration_year() {
    return expiration_year;
  }
  public void setExpiration_year(String expiration_year) {
    this.expiration_year = expiration_year;
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

  public String getBilling_zip() {
    return billing_zip;
  }
  public void setBilling_zip(String billing_zip) {
    this.billing_zip = billing_zip;
  }

  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
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
    sb.append("class PreAuthCard {\n");
    sb.append("  name_on_card: ").append(name_on_card).append("\n");
    sb.append("  card_type: ").append(card_type).append("\n");
    sb.append("  billing_address: ").append(billing_address).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  billing_zip: ").append(billing_zip).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  last_4_digits: ").append(last_4_digits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

