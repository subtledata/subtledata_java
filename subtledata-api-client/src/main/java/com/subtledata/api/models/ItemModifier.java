package com.subtledata.api.models;

public class ItemModifier {
  /* Item Name */
  private String name = null;
  /* Modifier ID */
  private Integer modifier_id = null;
  /* Special Instructions */
  private String instructions = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getModifier_id() {
    return modifier_id;
  }
  public void setModifier_id(Integer modifier_id) {
    this.modifier_id = modifier_id;
  }

  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemModifier {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  modifier_id: ").append(modifier_id).append("\n");
    sb.append("  instructions: ").append(instructions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

