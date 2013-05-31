package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.ModifierList;
public class Local {
  /* Category Description */
  private String description = null;
  /* Category ID */
  private Integer category_id = null;
  /* Category Name */
  private String name = null;
  private List<ModifierList> modifier_list = new ArrayList<ModifierList>();
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getCategory_id() {
    return category_id;
  }
  public void setCategory_id(Integer category_id) {
    this.category_id = category_id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<ModifierList> getModifier_list() {
    return modifier_list;
  }
  public void setModifier_list(List<ModifierList> modifier_list) {
    this.modifier_list = modifier_list;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Local {\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  category_id: ").append(category_id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  modifier_list: ").append(modifier_list).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

