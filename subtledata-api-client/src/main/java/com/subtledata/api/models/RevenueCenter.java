package com.subtledata.api.models;

public class RevenueCenter {
  /* Is the default center */
  private Boolean default_center = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  /* Revenue Center Name */
  private String name = null;
  public Boolean getDefault_center() {
    return default_center;
  }
  public void setDefault_center(Boolean default_center) {
    this.default_center = default_center;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueCenter {\n");
    sb.append("  default_center: ").append(default_center).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

