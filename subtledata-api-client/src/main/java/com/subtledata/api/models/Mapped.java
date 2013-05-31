package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Availablemodifier;
public class Mapped {
  /* Minimum Number of Modifiers to Order */
  private Integer minimum_order = null;
  /* Category Name */
  private String name = null;
  private List<Availablemodifier> AvailableModifiers = new ArrayList<Availablemodifier>();
  /* Maximum Number of Modifiers to Order */
  private Integer maximum_order = null;
  /* Category ID */
  private Integer category_id = null;
  /* Category Description */
  private String description = null;
  public Integer getMinimum_order() {
    return minimum_order;
  }
  public void setMinimum_order(Integer minimum_order) {
    this.minimum_order = minimum_order;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<Availablemodifier> getAvailableModifiers() {
    return AvailableModifiers;
  }
  public void setAvailableModifiers(List<Availablemodifier> AvailableModifiers) {
    this.AvailableModifiers = AvailableModifiers;
  }

  public Integer getMaximum_order() {
    return maximum_order;
  }
  public void setMaximum_order(Integer maximum_order) {
    this.maximum_order = maximum_order;
  }

  public Integer getCategory_id() {
    return category_id;
  }
  public void setCategory_id(Integer category_id) {
    this.category_id = category_id;
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
    sb.append("class Mapped {\n");
    sb.append("  minimum_order: ").append(minimum_order).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  AvailableModifiers: ").append(AvailableModifiers).append("\n");
    sb.append("  maximum_order: ").append(maximum_order).append("\n");
    sb.append("  category_id: ").append(category_id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

