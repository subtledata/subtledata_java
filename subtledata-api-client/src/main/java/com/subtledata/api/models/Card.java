package com.subtledata.api.models;

public class Card {
  /* Name on card */
  private String name_on_card = null;
  /* Card type */
  private String card_type = null;
  /* Year of card expiration date (4 digits) */
  private String expiration_year = null;
  /* SubtleData Card ID */
  private Integer card_id = null;
  /* Month of card expiration date (2 digits) */
  private String expiration_month = null;
  /* Card nickname */
  private String nickname = null;
  /* Last 4 digits on card */
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
    sb.append("class Card {\n");
    sb.append("  name_on_card: ").append(name_on_card).append("\n");
    sb.append("  card_type: ").append(card_type).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  last_4_digits: ").append(last_4_digits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

