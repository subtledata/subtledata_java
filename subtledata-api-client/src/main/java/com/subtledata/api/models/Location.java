package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.TenderType;
import com.subtledata.api.models.RevenueCenter;
import com.subtledata.api.models.DiscountType;
import com.subtledata.api.models.Terminal;
public class Location {
  /* Cross Streets */
  private String cross_streets = null;
  /* Receipt number instructions */
  private String receipt_number_instructions = null;
  /* Request for help throguh the app */
  private Boolean employee_request_through_app = null;
  /* Menu Available */
  private Boolean menu_ordering_available = null;
  /* Payment via credit card available message */
  private String payment_via_credit_card_available_message = null;
  /* Address Postal Code */
  private String postal_code = null;
  /* Location ID */
  private Integer location_id = null;
  /* Specials available through app */
  private Boolean app_specials = null;
  /* User Rating */
  private String user_rating = null;
  /* Location Name */
  private String location_name = null;
  private List<TenderType> tender_types = new ArrayList<TenderType>();
  /* Process New Credit Cards */
  private Boolean process_new_credit_cards = null;
  /* Table number instructions */
  private String table_number_instructions = null;
  /* Address State */
  private String state = null;
  /* Color Theme */
  private Integer color_theme = null;
  /* Location Latitude */
  private Float latitude = null;
  /* Logo URL */
  private String logo_url = null;
  /* Website URL */
  private String website_url = null;
  private List<RevenueCenter> revenue_centers = new ArrayList<RevenueCenter>();
  /* Address City */
  private String city = null;
  /* Ordering available message */
  private String ordering_available_message = null;
  /* Phone Number */
  private String phone = null;
  private List<Terminal> terminals = new ArrayList<Terminal>();
  /* Location Picture URL */
  private String location_picture_url = null;
  /* Favorites available for ordering */
  private Boolean favorites_ordering_available = null;
  /* Neighborhood Name */
  private String neighborhood_name = null;
  private List<DiscountType> discount_types = new ArrayList<DiscountType>();
  /* Location Longitude */
  private Float longitude = null;
  /* Price Rating */
  private Integer price_rating = null;
  /* Process Pre Authed Credit Cards */
  private Boolean process_pre_authed_cards = null;
  /* Address Line 2 */
  private String address_line_2 = null;
  /* Address Line 1 */
  private String address_line_1 = null;
  public String getCross_streets() {
    return cross_streets;
  }
  public void setCross_streets(String cross_streets) {
    this.cross_streets = cross_streets;
  }

  public String getReceipt_number_instructions() {
    return receipt_number_instructions;
  }
  public void setReceipt_number_instructions(String receipt_number_instructions) {
    this.receipt_number_instructions = receipt_number_instructions;
  }

  public Boolean getEmployee_request_through_app() {
    return employee_request_through_app;
  }
  public void setEmployee_request_through_app(Boolean employee_request_through_app) {
    this.employee_request_through_app = employee_request_through_app;
  }

  public Boolean getMenu_ordering_available() {
    return menu_ordering_available;
  }
  public void setMenu_ordering_available(Boolean menu_ordering_available) {
    this.menu_ordering_available = menu_ordering_available;
  }

  public String getPayment_via_credit_card_available_message() {
    return payment_via_credit_card_available_message;
  }
  public void setPayment_via_credit_card_available_message(String payment_via_credit_card_available_message) {
    this.payment_via_credit_card_available_message = payment_via_credit_card_available_message;
  }

  public String getPostal_code() {
    return postal_code;
  }
  public void setPostal_code(String postal_code) {
    this.postal_code = postal_code;
  }

  public Integer getLocation_id() {
    return location_id;
  }
  public void setLocation_id(Integer location_id) {
    this.location_id = location_id;
  }

  public Boolean getApp_specials() {
    return app_specials;
  }
  public void setApp_specials(Boolean app_specials) {
    this.app_specials = app_specials;
  }

  public String getUser_rating() {
    return user_rating;
  }
  public void setUser_rating(String user_rating) {
    this.user_rating = user_rating;
  }

  public String getLocation_name() {
    return location_name;
  }
  public void setLocation_name(String location_name) {
    this.location_name = location_name;
  }

  public List<TenderType> getTender_types() {
    return tender_types;
  }
  public void setTender_types(List<TenderType> tender_types) {
    this.tender_types = tender_types;
  }

  public Boolean getProcess_new_credit_cards() {
    return process_new_credit_cards;
  }
  public void setProcess_new_credit_cards(Boolean process_new_credit_cards) {
    this.process_new_credit_cards = process_new_credit_cards;
  }

  public String getTable_number_instructions() {
    return table_number_instructions;
  }
  public void setTable_number_instructions(String table_number_instructions) {
    this.table_number_instructions = table_number_instructions;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public Integer getColor_theme() {
    return color_theme;
  }
  public void setColor_theme(Integer color_theme) {
    this.color_theme = color_theme;
  }

  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public String getLogo_url() {
    return logo_url;
  }
  public void setLogo_url(String logo_url) {
    this.logo_url = logo_url;
  }

  public String getWebsite_url() {
    return website_url;
  }
  public void setWebsite_url(String website_url) {
    this.website_url = website_url;
  }

  public List<RevenueCenter> getRevenue_centers() {
    return revenue_centers;
  }
  public void setRevenue_centers(List<RevenueCenter> revenue_centers) {
    this.revenue_centers = revenue_centers;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getOrdering_available_message() {
    return ordering_available_message;
  }
  public void setOrdering_available_message(String ordering_available_message) {
    this.ordering_available_message = ordering_available_message;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public List<Terminal> getTerminals() {
    return terminals;
  }
  public void setTerminals(List<Terminal> terminals) {
    this.terminals = terminals;
  }

  public String getLocation_picture_url() {
    return location_picture_url;
  }
  public void setLocation_picture_url(String location_picture_url) {
    this.location_picture_url = location_picture_url;
  }

  public Boolean getFavorites_ordering_available() {
    return favorites_ordering_available;
  }
  public void setFavorites_ordering_available(Boolean favorites_ordering_available) {
    this.favorites_ordering_available = favorites_ordering_available;
  }

  public String getNeighborhood_name() {
    return neighborhood_name;
  }
  public void setNeighborhood_name(String neighborhood_name) {
    this.neighborhood_name = neighborhood_name;
  }

  public List<DiscountType> getDiscount_types() {
    return discount_types;
  }
  public void setDiscount_types(List<DiscountType> discount_types) {
    this.discount_types = discount_types;
  }

  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Integer getPrice_rating() {
    return price_rating;
  }
  public void setPrice_rating(Integer price_rating) {
    this.price_rating = price_rating;
  }

  public Boolean getProcess_pre_authed_cards() {
    return process_pre_authed_cards;
  }
  public void setProcess_pre_authed_cards(Boolean process_pre_authed_cards) {
    this.process_pre_authed_cards = process_pre_authed_cards;
  }

  public String getAddress_line_2() {
    return address_line_2;
  }
  public void setAddress_line_2(String address_line_2) {
    this.address_line_2 = address_line_2;
  }

  public String getAddress_line_1() {
    return address_line_1;
  }
  public void setAddress_line_1(String address_line_1) {
    this.address_line_1 = address_line_1;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("  cross_streets: ").append(cross_streets).append("\n");
    sb.append("  receipt_number_instructions: ").append(receipt_number_instructions).append("\n");
    sb.append("  employee_request_through_app: ").append(employee_request_through_app).append("\n");
    sb.append("  menu_ordering_available: ").append(menu_ordering_available).append("\n");
    sb.append("  payment_via_credit_card_available_message: ").append(payment_via_credit_card_available_message).append("\n");
    sb.append("  postal_code: ").append(postal_code).append("\n");
    sb.append("  location_id: ").append(location_id).append("\n");
    sb.append("  app_specials: ").append(app_specials).append("\n");
    sb.append("  user_rating: ").append(user_rating).append("\n");
    sb.append("  location_name: ").append(location_name).append("\n");
    sb.append("  tender_types: ").append(tender_types).append("\n");
    sb.append("  process_new_credit_cards: ").append(process_new_credit_cards).append("\n");
    sb.append("  table_number_instructions: ").append(table_number_instructions).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  color_theme: ").append(color_theme).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  logo_url: ").append(logo_url).append("\n");
    sb.append("  website_url: ").append(website_url).append("\n");
    sb.append("  revenue_centers: ").append(revenue_centers).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  ordering_available_message: ").append(ordering_available_message).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  terminals: ").append(terminals).append("\n");
    sb.append("  location_picture_url: ").append(location_picture_url).append("\n");
    sb.append("  favorites_ordering_available: ").append(favorites_ordering_available).append("\n");
    sb.append("  neighborhood_name: ").append(neighborhood_name).append("\n");
    sb.append("  discount_types: ").append(discount_types).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  price_rating: ").append(price_rating).append("\n");
    sb.append("  process_pre_authed_cards: ").append(process_pre_authed_cards).append("\n");
    sb.append("  address_line_2: ").append(address_line_2).append("\n");
    sb.append("  address_line_1: ").append(address_line_1).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

