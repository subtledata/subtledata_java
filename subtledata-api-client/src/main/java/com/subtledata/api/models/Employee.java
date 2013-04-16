package com.subtledata.api.models;

public class Employee {
  /* Social Security Number */
  private String ssn = null;
  /* Last Name */
  private String last_name = null;
  /* Middle Name */
  private String middle_name = null;
  /* Emergency Contact Number */
  private String emergency_contact_number = null;
  /* Date of Termination */
  private String date_terminated = null;
  /* Date of Birth */
  private String dob = null;
  /* Alcohol Commission Certification Number */
  private String alcohol_commission_number = null;
  /* Alcohol Commission Certification Expiration Date */
  private String alcohol_commission_expiration_date = null;
  /* First Name */
  private String first_name = null;
  /* Manager Flag */
  private Boolean is_manager = null;
  /* Board of Health Certification Number */
  private String health_cert_number = null;
  /* Mobile Phone Number */
  private String mobile_phone = null;
  /* Hire Date */
  private String date_hired = null;
  /* Home Phone Number */
  private String home_phone = null;
  /* Country of Nationality */
  private String country_of_nationality = null;
  /* Emergency Contact Name */
  private String emergency_contact_name = null;
  /* Board of Health Certification Expiration Date */
  private String health_cert_expiration_date = null;
  /* Last Review Date */
  private String date_last_review = null;
  /* Employee User Name */
  private String user_name = null;
  /* Email Address */
  private String email = null;
  /* Employee ID */
  private Integer employee_id = null;
  public String getSsn() {
    return ssn;
  }
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getLast_name() {
    return last_name;
  }
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getMiddle_name() {
    return middle_name;
  }
  public void setMiddle_name(String middle_name) {
    this.middle_name = middle_name;
  }

  public String getEmergency_contact_number() {
    return emergency_contact_number;
  }
  public void setEmergency_contact_number(String emergency_contact_number) {
    this.emergency_contact_number = emergency_contact_number;
  }

  public String getDate_terminated() {
    return date_terminated;
  }
  public void setDate_terminated(String date_terminated) {
    this.date_terminated = date_terminated;
  }

  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getAlcohol_commission_number() {
    return alcohol_commission_number;
  }
  public void setAlcohol_commission_number(String alcohol_commission_number) {
    this.alcohol_commission_number = alcohol_commission_number;
  }

  public String getAlcohol_commission_expiration_date() {
    return alcohol_commission_expiration_date;
  }
  public void setAlcohol_commission_expiration_date(String alcohol_commission_expiration_date) {
    this.alcohol_commission_expiration_date = alcohol_commission_expiration_date;
  }

  public String getFirst_name() {
    return first_name;
  }
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public Boolean getIs_manager() {
    return is_manager;
  }
  public void setIs_manager(Boolean is_manager) {
    this.is_manager = is_manager;
  }

  public String getHealth_cert_number() {
    return health_cert_number;
  }
  public void setHealth_cert_number(String health_cert_number) {
    this.health_cert_number = health_cert_number;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }
  public void setMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
  }

  public String getDate_hired() {
    return date_hired;
  }
  public void setDate_hired(String date_hired) {
    this.date_hired = date_hired;
  }

  public String getHome_phone() {
    return home_phone;
  }
  public void setHome_phone(String home_phone) {
    this.home_phone = home_phone;
  }

  public String getCountry_of_nationality() {
    return country_of_nationality;
  }
  public void setCountry_of_nationality(String country_of_nationality) {
    this.country_of_nationality = country_of_nationality;
  }

  public String getEmergency_contact_name() {
    return emergency_contact_name;
  }
  public void setEmergency_contact_name(String emergency_contact_name) {
    this.emergency_contact_name = emergency_contact_name;
  }

  public String getHealth_cert_expiration_date() {
    return health_cert_expiration_date;
  }
  public void setHealth_cert_expiration_date(String health_cert_expiration_date) {
    this.health_cert_expiration_date = health_cert_expiration_date;
  }

  public String getDate_last_review() {
    return date_last_review;
  }
  public void setDate_last_review(String date_last_review) {
    this.date_last_review = date_last_review;
  }

  public String getUser_name() {
    return user_name;
  }
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getEmployee_id() {
    return employee_id;
  }
  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("  ssn: ").append(ssn).append("\n");
    sb.append("  last_name: ").append(last_name).append("\n");
    sb.append("  middle_name: ").append(middle_name).append("\n");
    sb.append("  emergency_contact_number: ").append(emergency_contact_number).append("\n");
    sb.append("  date_terminated: ").append(date_terminated).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  alcohol_commission_number: ").append(alcohol_commission_number).append("\n");
    sb.append("  alcohol_commission_expiration_date: ").append(alcohol_commission_expiration_date).append("\n");
    sb.append("  first_name: ").append(first_name).append("\n");
    sb.append("  is_manager: ").append(is_manager).append("\n");
    sb.append("  health_cert_number: ").append(health_cert_number).append("\n");
    sb.append("  mobile_phone: ").append(mobile_phone).append("\n");
    sb.append("  date_hired: ").append(date_hired).append("\n");
    sb.append("  home_phone: ").append(home_phone).append("\n");
    sb.append("  country_of_nationality: ").append(country_of_nationality).append("\n");
    sb.append("  emergency_contact_name: ").append(emergency_contact_name).append("\n");
    sb.append("  health_cert_expiration_date: ").append(health_cert_expiration_date).append("\n");
    sb.append("  date_last_review: ").append(date_last_review).append("\n");
    sb.append("  user_name: ").append(user_name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  employee_id: ").append(employee_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

