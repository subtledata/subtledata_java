package com.subtledata.api.models;

public class NewCard {
  /*  */
  private String name_on_card = null;
  /*  */
  private String expiration_year = null;
  /*  */
  private String card_nickname = null;
  /*  */
  private String billing_zip = null;
  /*  */
  private String expiration_month = null;
  /*  */
  private String mag_track_2 = null;
  /*  */
  private String mag_track_1 = null;
  /*  */
  private String signature_image = null;
  /*  */
  private String card_number = null;
  public String getName_on_card() {
    return name_on_card;
  }
  public void setName_on_card(String name_on_card) {
    this.name_on_card = name_on_card;
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

  public String getBilling_zip() {
    return billing_zip;
  }
  public void setBilling_zip(String billing_zip) {
    this.billing_zip = billing_zip;
  }

  public String getExpiration_month() {
    return expiration_month;
  }
  public void setExpiration_month(String expiration_month) {
    this.expiration_month = expiration_month;
  }

  public String getMag_track_2() {
    return mag_track_2;
  }
  public void setMag_track_2(String mag_track_2) {
    this.mag_track_2 = mag_track_2;
  }

  public String getMag_track_1() {
    return mag_track_1;
  }
  public void setMag_track_1(String mag_track_1) {
    this.mag_track_1 = mag_track_1;
  }

  public String getSignature_image() {
    return signature_image;
  }
  public void setSignature_image(String signature_image) {
    this.signature_image = signature_image;
  }

  public String getCard_number() {
    return card_number;
  }
  public void setCard_number(String card_number) {
    this.card_number = card_number;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCard {\n");
    sb.append("  name_on_card: ").append(name_on_card).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  card_nickname: ").append(card_nickname).append("\n");
    sb.append("  billing_zip: ").append(billing_zip).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  mag_track_2: ").append(mag_track_2).append("\n");
    sb.append("  mag_track_1: ").append(mag_track_1).append("\n");
    sb.append("  signature_image: ").append(signature_image).append("\n");
    sb.append("  card_number: ").append(card_number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

