package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.OpenTicket;
public class TableDetails {
  private List<OpenTicket> open_tickets = new ArrayList<OpenTicket>();
  public List<OpenTicket> getOpen_tickets() {
    return open_tickets;
  }
  public void setOpen_tickets(List<OpenTicket> open_tickets) {
    this.open_tickets = open_tickets;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDetails {\n");
    sb.append("  open_tickets: ").append(open_tickets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

