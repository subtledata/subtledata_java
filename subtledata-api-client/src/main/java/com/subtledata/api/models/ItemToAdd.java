package com.subtledata.api.models;

public class ItemToAdd {
  /* Item ID to order */
  private Integer item_id = null;
  /* Additional Order Instructions */
  private String instructions = null;
  /* Item Quantity */
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

  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemToAdd {\n");
    sb.append("  item_id: ").append(item_id).append("\n");
    sb.append("  instructions: ").append(instructions).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

