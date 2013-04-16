package com.subtledata.api.models;

public class Country {
  /* Country Name */
  private String country_name = null;
  /* SubtleData Country ID */
  private Integer country_id = null;
  public String getCountry_name() {
    return country_name;
  }
  public void setCountry_name(String country_name) {
    this.country_name = country_name;
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
    sb.append("class Country {\n");
    sb.append("  country_name: ").append(country_name).append("\n");
    sb.append("  country_id: ").append(country_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

