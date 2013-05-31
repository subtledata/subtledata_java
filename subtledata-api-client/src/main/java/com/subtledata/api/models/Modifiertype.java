package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Mapped;
import com.subtledata.api.models.Local;
public class Modifiertype {
  private List<Local> local = new ArrayList<Local>();
  private List<Mapped> mapped = new ArrayList<Mapped>();
  public List<Local> getLocal() {
    return local;
  }
  public void setLocal(List<Local> local) {
    this.local = local;
  }

  public List<Mapped> getMapped() {
    return mapped;
  }
  public void setMapped(List<Mapped> mapped) {
    this.mapped = mapped;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Modifiertype {\n");
    sb.append("  local: ").append(local).append("\n");
    sb.append("  mapped: ").append(mapped).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

