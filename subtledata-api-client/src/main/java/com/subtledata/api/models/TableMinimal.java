package com.subtledata.api.models;

public class TableMinimal {
  /* Table Identifier */
  private String pos_table_id = null;
  /* Table ID */
  private Integer subtledata_id = null;
  /* Revenue Center Name */
  private String revenue_center_name = null;
  /* Table Name */
  private String name = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  public String getPos_table_id() {
    return pos_table_id;
  }
  public void setPos_table_id(String pos_table_id) {
    this.pos_table_id = pos_table_id;
  }

  public Integer getSubtledata_id() {
    return subtledata_id;
  }
  public void setSubtledata_id(Integer subtledata_id) {
    this.subtledata_id = subtledata_id;
  }

  public String getRevenue_center_name() {
    return revenue_center_name;
  }
  public void setRevenue_center_name(String revenue_center_name) {
    this.revenue_center_name = revenue_center_name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMinimal {\n");
    sb.append("  pos_table_id: ").append(pos_table_id).append("\n");
    sb.append("  subtledata_id: ").append(subtledata_id).append("\n");
    sb.append("  revenue_center_name: ").append(revenue_center_name).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

