package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.Modifier;
public class Item {
  /* Subtledata Item Identifier */
  private Integer item_id = null;
  /* Extra Instructions */
  private String instructions = null;
  private List<Modifier> modifiers = new ArrayList<Modifier>();
  /* Quantity of Item */
  private Integer quantity = null;
  public Integer getItem_id() {
    return item_id;
  }
  public void setItem_id(Integer item_id) {
    this.item_id = item_id;
  }

  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public List<Modifier> getModifiers() {
    return modifiers;
  }
  public void setModifiers(List<Modifier> modifiers) {
    this.modifiers = modifiers;
  }

  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("  item_id: ").append(item_id).append("\n");
    sb.append("  instructions: ").append(instructions).append("\n");
    sb.append("  modifiers: ").append(modifiers).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

