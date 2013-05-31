package com.subtledata.api.models;

public class Modifier {
  /* Subtledata Modifier Identifier */
  private Integer modifier_id = null;
  public Integer getModifier_id() {
    return modifier_id;
  }
  public void setModifier_id(Integer modifier_id) {
    this.modifier_id = modifier_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Modifier {\n");
    sb.append("  modifier_id: ").append(modifier_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

