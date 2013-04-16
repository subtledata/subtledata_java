package com.subtledata.api.models;

public class DiscountType {
  /* Is the standard discount type */
  private Boolean default_discount = null;
  /* SubtleData Discount Type ID */
  private Integer discount_type_id = null;
  /* Name */
  private String name = null;
  public Boolean getDefault_discount() {
    return default_discount;
  }
  public void setDefault_discount(Boolean default_discount) {
    this.default_discount = default_discount;
  }

  public Integer getDiscount_type_id() {
    return discount_type_id;
  }
  public void setDiscount_type_id(Integer discount_type_id) {
    this.discount_type_id = discount_type_id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountType {\n");
    sb.append("  default_discount: ").append(default_discount).append("\n");
    sb.append("  discount_type_id: ").append(discount_type_id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

