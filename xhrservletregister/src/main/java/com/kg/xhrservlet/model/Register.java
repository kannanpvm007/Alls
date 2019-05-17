package com.kg.xhrservlet.model;

/**
 * Register
 */
public class Register {
    int id;
    String firstname;
    String lastname;
    String title;
    String organization;
    String email;
    String dob;
    String phone;
    String fax;
    String address1; 
     String address2;
    String city;
    String state;
    String zipcode;
      String showmycontact;
    String daysattending;
      String activityattending;
        String meals;
          String requirement;
          String lostconfattend;



    Register(){

    }
   Register(int id,String firstname,String lastname,String title,String organization,String email,String dob,String phone,String fax,String address1,String address2,String city,String state,String zipcode,String showmycontact,String daysattending, String activityattending, String meals,String requirement,String lostconfattend){
    this.id=id;
    this.firstname=firstname;
    this.lastname=lastname;
    this.title=title;
    this.organization=organization;
    this.email=email;
    this.dob=dob;
    this.phone=phone;
    this.fax=fax;
    this.address1=address1;
    this.address2=address2;
    this.city=city;
    this.state=state;
    this.zipcode=zipcode;
    this.showmycontact=showmycontact;
     this.daysattending=daysattending;
     this.activityattending=activityattending;
     this.meals=meals;
     this.requirement=requirement;
     this.lostconfattend=lostconfattend;

}
/**
 * @return the id
 */
public int getId() {
    return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
    this.id = id;
}
/**
 * @return the firstname
 */
public String getFirstname() {
    return firstname;
}
/**
 * @param firstname the firstname to set
 */
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
/**
 * @return the lastname
 */
public String getLastname() {
    return lastname;
}
/**
 * @param lastname the lastname to set
 */
public void setLastname(String lastname) {
    this.lastname = lastname;
}
/**
 * @return the title
 */
public String getTitle() {
    return title;
}
/**
 * @param title the title to set
 */
public void setTitle(String title) {
    this.title = title;
}
/**
 * @return the organization
 */
public String getOrganization() {
    return organization;
}
/**
 * @param organization the organization to set
 */
public void setOrganization(String organization) {
    this.organization = organization;
}
/**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}
/**
 * @return the dob
 */
public String getDob() {
    return dob;
}
/**
 * @param dob the dob to set
 */
public void setDob(String dob) {
    this.dob = dob;
}
/**
 * @return the phone
 */
public String getPhone() {
    return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
    this.phone = phone;
}
/**
 * @return the fax
 */
public String getFax() {
    return fax;
}
/**
 * @param fax the fax to set
 */
public void setFax(String fax) {
    this.fax = fax;
}
/**
 * @return the address1
 */
public String getAddress1() {
    return address1;
}
/**
 * @param address1 the address1 to set
 */
public void setAddress1(String address1) {
    this.address1 = address1;
}
/**
 * @return the address2
 */
public String getAddress2() {
    return address2;
}
/**
 * @param address2 the address2 to set
 */
public void setAddress2(String address2) {
    this.address2 = address2;
}
/**
 * @return the city
 */
public String getCity() {
    return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
    this.city = city;
}
/**
 * @return the state
 */
public String getState() {
    return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
    this.state = state;
}
/**
 * @return the zipcode
 */
public String getZipcode() {
    return zipcode;
}
/**
 * @param zipcode the zipcode to set
 */
public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
}
/**
 * @return the showmycontact
 */
public String getShowmycontact() {
    return showmycontact;
}
/**
 * @param showmycontact the showmycontact to set
 */
public void setShowmycontact(String showmycontact) {
    this.showmycontact = showmycontact;
}
/**
 * @return the daysattending
 */
public String getDaysattending() {
    return daysattending;
}
/**
 * @param daysattending the daysattending to set
 */
public void setDaysattending(String daysattending) {
    this.daysattending = daysattending;
}
/**
 * @return the activityattending
 */
public String getActivityattending() {
    return activityattending;
}
/**
 * @param activityattending the activityattending to set
 */
public void setActivityattending(String activityattending) {
    this.activityattending = activityattending;
}
/**
 * @return the meals
 */
public String getMeals() {
    return meals;
}
/**
 * @param meals the meals to set
 */
public void setMeals(String meals) {
    this.meals = meals;
}
/**
 * @return the requirement
 */
public String getRequirement() {
    return requirement;
}
/**
 * @param requirement the requirement to set
 */
public void setRequirement(String requirement) {
    this.requirement = requirement;
}
/**
 * @return the lostconfattend
 */
public String getLostconfattend() {
    return lostconfattend;
}
/**
 * @param lostconfattend the lostconfattend to set
 */
public void setLostconfattend(String lostconfattend) {
    this.lostconfattend = lostconfattend;
}
}