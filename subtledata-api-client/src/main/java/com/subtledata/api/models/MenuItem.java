package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.ItemImage;
import com.subtledata.api.models.Modifiertype;
public class MenuItem {
  /* Item SKU */
  private String sku = null;
  /* Food Flag */
  private Boolean food_flag = null;
  /* Alcohol Flag */
  private Boolean alcohol_flag = null;
  /* Item Display Name */
  private String display_name = null;
  /* Item Name */
  private String name = null;
  /* Merchandise Flag */
  private Boolean merchandise_flag = null;
  /* Available For Order Flag */
  private Boolean available_for_order = null;
  /* Item Price */
  private Float price = null;
  /* Item Description */
  private String description = null;
  /* Item UPC */
  private String UPC = null;
  private List<Modifiertype> ModifierTypes = new ArrayList<Modifiertype>();
  private List<ItemImage> item_images = new ArrayList<ItemImage>();
  /* Item Cost Basis */
  private Float cost = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  /* Item ID */
  private Integer item_id = null;
  /* Item POS ID */
  private Integer local_pos_id = null;
  /* Out of Stock */
  private Boolean out_of_stock_flag = null;
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  public Boolean getFood_flag() {
    return food_flag;
  }
  public void setFood_flag(Boolean food_flag) {
    this.food_flag = food_flag;
  }

  public Boolean getAlcohol_flag() {
    return alcohol_flag;
  }
  public void setAlcohol_flag(Boolean alcohol_flag) {
    this.alcohol_flag = alcohol_flag;
  }

  public String getDisplay_name() {
    return display_name;
  }
  public void setDisplay_name(String display_name) {
    this.display_name = display_name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getMerchandise_flag() {
    return merchandise_flag;
  }
  public void setMerchandise_flag(Boolean merchandise_flag) {
    this.merchandise_flag = merchandise_flag;
  }

  public Boolean getAvailable_for_order() {
    return available_for_order;
  }
  public void setAvailable_for_order(Boolean available_for_order) {
    this.available_for_order = available_for_order;
  }

  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public String getUPC() {
    return UPC;
  }
  public void setUPC(String UPC) {
    this.UPC = UPC;
  }

  public List<Modifiertype> getModifierTypes() {
    return ModifierTypes;
  }
  public void setModifierTypes(List<Modifiertype> ModifierTypes) {
    this.ModifierTypes = ModifierTypes;
  }

  public List<ItemImage> getItem_images() {
    return item_images;
  }
  public void setItem_images(List<ItemImage> item_images) {
    this.item_images = item_images;
  }

  public Float getCost() {
    return cost;
  }
  public void setCost(Float cost) {
    this.cost = cost;
  }

  public Integer getRevenue_center_id() {
    return revenue_center_id;
  }
  public void setRevenue_center_id(Integer revenue_center_id) {
    this.revenue_center_id = revenue_center_id;
  }

  public Integer getItem_id() {
    return item_id;
  }
  public void setItem_id(Integer item_id) {
    this.item_id = item_id;
  }

  public Integer getLocal_pos_id() {
    return local_pos_id;
  }
  public void setLocal_pos_id(Integer local_pos_id) {
    this.local_pos_id = local_pos_id;
  }

  public Boolean getOut_of_stock_flag() {
    return out_of_stock_flag;
  }
  public void setOut_of_stock_flag(Boolean out_of_stock_flag) {
    this.out_of_stock_flag = out_of_stock_flag;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItem {\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  food_flag: ").append(food_flag).append("\n");
    sb.append("  alcohol_flag: ").append(alcohol_flag).append("\n");
    sb.append("  display_name: ").append(display_name).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  merchandise_flag: ").append(merchandise_flag).append("\n");
    sb.append("  available_for_order: ").append(available_for_order).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  UPC: ").append(UPC).append("\n");
    sb.append("  ModifierTypes: ").append(ModifierTypes).append("\n");
    sb.append("  item_images: ").append(item_images).append("\n");
    sb.append("  cost: ").append(cost).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  item_id: ").append(item_id).append("\n");
    sb.append("  local_pos_id: ").append(local_pos_id).append("\n");
    sb.append("  out_of_stock_flag: ").append(out_of_stock_flag).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

