package com.subtledata.api.models;

public class CategoryImage {
  /* Image URL */
  private String image_url = null;
  /* Image Type ID */
  private Integer image_type_id = null;
  public String getImage_url() {
    return image_url;
  }
  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public Integer getImage_type_id() {
    return image_type_id;
  }
  public void setImage_type_id(Integer image_type_id) {
    this.image_type_id = image_type_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryImage {\n");
    sb.append("  image_url: ").append(image_url).append("\n");
    sb.append("  image_type_id: ").append(image_type_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

