package com.subtledata.api.models;

public class Terminal {
  /* Terminal Revenue Center name */
  private String revenue_center_name = null;
  /* Is the standard terminal */
  private Boolean default_device = null;
  /* Terminal ID Number */
  private Integer terminal_id = null;
  /* Terminal Revenue Center ID */
  private Integer revenue_center_id = null;
  /* IP Address */
  private String ip_address = null;
  /* Terminal Name */
  private String name = null;
  public String getRevenue_center_name() {
    return revenue_center_name;
  }
  public void setRevenue_center_name(String revenue_center_name) {
    this.revenue_center_name = revenue_center_name;
  }

  public Boolean getDefault_device() {
    return default_device;
  }
  public void setDefault_device(Boolean default_device) {
    this.default_device = default_device;
  }

  public Integer getTerminal_id() {
    return terminal_id;
  }
  public void setTerminal_id(Integer terminal_id) {
    this.terminal_id = terminal_id;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
  }

  public String getIp_address() {
    return ip_address;
  }
  public void setIp_address(String ip_address) {
    this.ip_address = ip_address;
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
    sb.append("class Terminal {\n");
    sb.append("  revenue_center_name: ").append(revenue_center_name).append("\n");
    sb.append("  default_device: ").append(default_device).append("\n");
    sb.append("  terminal_id: ").append(terminal_id).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  ip_address: ").append(ip_address).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

