package com.subtledata.api.models;

public class CardPayment {
  /* Name on card */
  private String name_on_card = null;
  /* Payment Tip Amount */
  private Float tip_amount = null;
  /* Expration Year */
  private String expiration_year = null;
  /* Payment Amount Before Tip */
  private Float amount_before_tip = null;
  /* Pass tip ID or use 0 to specify tip */
  private Integer tip_type = null;
  /* SubtleData Credit or Gift Card ID */
  private Integer card_id = null;
  /* Expration Month */
  private String expiration_month = null;
  /* Mag Track 2 Data */
  private String mag_track_2 = null;
  /* Mag Track 1 Data */
  private String mag_track_1 = null;
  /* Signature Image in Base64 */
  private String signature_image = null;
  /* tender_type_id */
  private Integer tender_type_id = null;
  /* Billing Zip Code */
  private String billing_zip = null;
  /* CC Number */
  private String card_number = null;
  public String getName_on_card() {
    return name_on_card;
  }
  public void setName_on_card(String name_on_card) {
    this.name_on_card = name_on_card;
  }

  public Float getTip_amount() {
    return tip_amount;
  }
  public void setTip_amount(Float tip_amount) {
    this.tip_amount = tip_amount;
  }

  public String getExpiration_year() {
    return expiration_year;
  }
  public void setExpiration_year(String expiration_year) {
    this.expiration_year = expiration_year;
  }

  public Float getAmount_before_tip() {
    return amount_before_tip;
  }
  public void setAmount_before_tip(Float amount_before_tip) {
    this.amount_before_tip = amount_before_tip;
  }

  public Integer getTip_type() {
    return tip_type;
  }
  public void setTip_type(Integer tip_type) {
    this.tip_type = tip_type;
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

  public Integer getTender_type_id() {
    return tender_type_id;
  }
  public void setTender_type_id(Integer tender_type_id) {
    this.tender_type_id = tender_type_id;
  }

  public String getBilling_zip() {
    return billing_zip;
  }
  public void setBilling_zip(String billing_zip) {
    this.billing_zip = billing_zip;
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
    sb.append("class CardPayment {\n");
    sb.append("  name_on_card: ").append(name_on_card).append("\n");
    sb.append("  tip_amount: ").append(tip_amount).append("\n");
    sb.append("  expiration_year: ").append(expiration_year).append("\n");
    sb.append("  amount_before_tip: ").append(amount_before_tip).append("\n");
    sb.append("  tip_type: ").append(tip_type).append("\n");
    sb.append("  card_id: ").append(card_id).append("\n");
    sb.append("  expiration_month: ").append(expiration_month).append("\n");
    sb.append("  mag_track_2: ").append(mag_track_2).append("\n");
    sb.append("  mag_track_1: ").append(mag_track_1).append("\n");
    sb.append("  signature_image: ").append(signature_image).append("\n");
    sb.append("  tender_type_id: ").append(tender_type_id).append("\n");
    sb.append("  billing_zip: ").append(billing_zip).append("\n");
    sb.append("  card_number: ").append(card_number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

