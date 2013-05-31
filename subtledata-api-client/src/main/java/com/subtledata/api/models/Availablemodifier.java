package com.subtledata.api.models;

public class Availablemodifier {
  /* Modifier Name */
  private String name = null;
  /* Date Last Updated */
  private String date_updated = null;
  /* Modifier Price */
  private Float price = null;
  /* Available To Order */
  private Boolean available_to_order = null;
  /* Modifier ID */
  private Integer modifier_id = null;
  /* Modifier Description */
  private String description = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDate_updated() {
    return date_updated;
  }
  public void setDate_updated(String date_updated) {
    this.date_updated = date_updated;
  }

  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

  public Boolean getAvailable_to_order() {
    return available_to_order;
  }
  public void setAvailable_to_order(Boolean available_to_order) {
    this.available_to_order = available_to_order;
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
    sb.append("class Availablemodifier {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  date_updated: ").append(date_updated).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  available_to_order: ").append(available_to_order).append("\n");
    sb.append("  modifier_id: ").append(modifier_id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

