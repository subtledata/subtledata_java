package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.ItemImage;
public class Item {
  /* Item Description */
  private String description = null;
  /* Item Price */
  private Float price = null;
  /* Item Name */
  private String name = null;
  /* Revenue Center ID */
  private Integer revenue_center_id = null;
  /* Item ID */
  private Integer item_id = null;
  private List<ItemImage> item_images = new ArrayList<ItemImage>();
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

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

  public List<ItemImage> getItem_images() {
    return item_images;
  }
  public void setItem_images(List<ItemImage> item_images) {
    this.item_images = item_images;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  revenue_center_id: ").append(revenue_center_id).append("\n");
    sb.append("  item_id: ").append(item_id).append("\n");
    sb.append("  item_images: ").append(item_images).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

