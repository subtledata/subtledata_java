package com.subtledata.api.models;

public class ModifierList {
  /* Modifier Price */
  private Float price = null;
  /* Modifier Name */
  private String name = null;
  /* Modifier ID */
  private Integer modifier_id = null;
  /* Modifier Description */
  private String description = null;
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

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

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifierList {\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  modifier_id: ").append(modifier_id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

