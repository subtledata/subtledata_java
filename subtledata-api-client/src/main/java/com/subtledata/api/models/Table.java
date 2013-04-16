package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.OpenTicket;
public class Table {
  /* Table Identifier */
  private Integer pos_table_id = null;
  private List<OpenTicket> open_tickets = new ArrayList<OpenTicket>();
  /* Table ID */
  private Integer subtledata_id = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  /* Table Name */
  private String name = null;
  public Integer getPos_table_id() {
    return pos_table_id;
  }
  public void setPos_table_id(Integer pos_table_id) {
    this.pos_table_id = pos_table_id;
  }

  public List<OpenTicket> getOpen_tickets() {
    return open_tickets;
  }
  public void setOpen_tickets(List<OpenTicket> open_tickets) {
    this.open_tickets = open_tickets;
  }

  public Integer getSubtledata_id() {
    return subtledata_id;
  }
  public void setSubtledata_id(Integer subtledata_id) {
    this.subtledata_id = subtledata_id;
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
    sb.append("class Table {\n");
    sb.append("  pos_table_id: ").append(pos_table_id).append("\n");
    sb.append("  open_tickets: ").append(open_tickets).append("\n");
    sb.append("  subtledata_id: ").append(subtledata_id).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

