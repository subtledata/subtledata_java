package com.subtledata.api.models;

public class Payment {
  /* SubtleData Payment ID */
  private Integer payment_id = null;
  /* Credit Card Type */
  private String card_type = null;
  /* Payment tip amount */
  private Float tip_amount = null;
  /* Payment Total Amount */
  private Float total_amount = null;
  /* Card Expiration Year */
  private String expiration_year = null;
  /* Credit Card Nickname */
  private String card_nickname = null;
  /* Name on the tender */
  private String name_on_tender = null;
  /* Card Expiration Month */
  private String expiration_month = null;
  /* Payment amount before tip */
  private Float amount_before_tip = null;
  /* SubtleData Credit Card ID */
  private Integer credit_card_id = null;
  /* Last 4 card digits */
  private String last_4_digits = null;
  public Integer getPayment_id() {
    return payment_id;
  }
  public void setPayment_id(Integer payment_id) {
    this.payment_id = payment_id;
  }

  public String getCard_type() {
    return card_type;
  }
  public void setCard_type(String card_type) {
    this.card_type = card_type;
  }

  public Float getTip_amount() {
    return tip_amount;
  }
  public void setTip_amount(Float tip_amount) {
    this.tip_amount = tip_amount;
  }

  public Float getTotal_amount() {
    return total_amount;
  }
  public void setTotal_amount(Float total_amount) {
    this.total_amount = total_amount;
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

  public String getName_on_tender() {
    return name_on_tender;
  }
  public void setName_on_tender(String name_on_tender) {
    this.name_on_tender = name_on_tender;
  }

  public String getExpiration_month() {
    return expiration_month;
  }
  public void setExpiration_month(String expiration_month) {
    this.expiration_month = expiration_month;
  }

  public Float getAmount_before_tip() {
    return amount_before_tip;
  }
  public void setAmount_before_tip(Float amount_before_tip) {
    this.amount_before_tip = amount_before_tip;
  }

  public Integer getCredit_card_id() {
    return credit_card_id;
  }
  public void setCredit_card_id(Integer credit_card_id) {
    this.credit_card_id = credit_card_id;
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
    sb.append("class Payment {\n");
    sb.append("  payment_id: ").append(payment_id).append("\n");
    sb.append("  card_type: ").append(card_type).append("\n");
    sb.append("  tip_amount: ").append(tip_amount).append("\n");
    sb.append("  total_amount: ").append(total_amount).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  card_nickname: ").append(card_nickname).append("\n");
    sb.append("  name_on_tender: ").append(name_on_tender).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  amount_before_tip: ").append(amount_before_tip).append("\n");
    sb.append("  credit_card_id: ").append(credit_card_id).append("\n");
    sb.append("  last_4_digits: ").append(last_4_digits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

