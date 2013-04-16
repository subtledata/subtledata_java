package com.subtledata.api.models;

public class TenderType {
  /* Tender type unique ID */
  private Integer tender_type_id = null;
  /* POS Tender Type ID */
  private Integer identifier = null;
  /* Tender type name */
  private String name = null;
  public Integer getTender_type_id() {
    return tender_type_id;
  }
  public void setTender_type_id(Integer tender_type_id) {
    this.tender_type_id = tender_type_id;
  }

  public Integer getIdentifier() {
    return identifier;
  }
  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
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
    sb.append("class TenderType {\n");
    sb.append("  tender_type_id: ").append(tender_type_id).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

