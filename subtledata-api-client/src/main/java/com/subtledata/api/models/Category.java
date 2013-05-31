package com.subtledata.api.models;

import java.util.*;
import com.subtledata.api.models.MenuItemDetail;
import com.subtledata.api.models.CategoryImage;
public class Category {
  private List<MenuItemDetail> items = new ArrayList<MenuItemDetail>();
  /* Category has items */
  private Boolean has_items = null;
  /* Instructional Text */
  private String instructional_text = null;
  private List<CategoryImage> category_images = new ArrayList<CategoryImage>();
  /* Category ID */
  private Integer category_id = null;
  /* Category has subcategories */
  private Boolean has_subcategories = null;
  /* Category Name */
  private String category_name = null;
  public List<MenuItemDetail> getItems() {
    return items;
  }
  public void setItems(List<MenuItemDetail> items) {
    this.items = items;
  }

  public Boolean getHas_items() {
    return has_items;
  }
  public void setHas_items(Boolean has_items) {
    this.has_items = has_items;
  }

  public String getInstructional_text() {
    return instructional_text;
  }
  public void setInstructional_text(String instructional_text) {
    this.instructional_text = instructional_text;
  }

  public List<CategoryImage> getCategory_images() {
    return category_images;
  }
  public void setCategory_images(List<CategoryImage> category_images) {
    this.category_images = category_images;
  }

  public Integer getCategory_id() {
    return category_id;
  }
  public void setCategory_id(Integer category_id) {
    this.category_id = category_id;
  }

  public Boolean getHas_subcategories() {
    return has_subcategories;
  }
  public void setHas_subcategories(Boolean has_subcategories) {
    this.has_subcategories = has_subcategories;
  }

  public String getCategory_name() {
    return category_name;
  }
  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  has_items: ").append(has_items).append("\n");
    sb.append("  instructional_text: ").append(instructional_text).append("\n");
    sb.append("  category_images: ").append(category_images).append("\n");
    sb.append("  category_id: ").append(category_id).append("\n");
    sb.append("  has_subcategories: ").append(has_subcategories).append("\n");
    sb.append("  category_name: ").append(category_name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

