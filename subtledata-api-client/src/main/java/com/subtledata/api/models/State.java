package com.subtledata.api.models;

public class State {
  /* State Abbreviation */
  private String abbreviation = null;
  /* Subtledata State ID */
  private Integer state_id = null;
  /* Subtledata Country ID */
  private Integer country_id = null;
  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Integer getState_id() {
    return state_id;
  }
  public void setState_id(Integer state_id) {
    this.state_id = state_id;
  }

  public Integer getCountry_id() {
    return country_id;
  }
  public void setCountry_id(Integer country_id) {
    this.country_id = country_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    sb.append("  abbreviation: ").append(abbreviation).append("\n");
    sb.append("  state_id: ").append(state_id).append("\n");
    sb.append("  country_id: ").append(country_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

