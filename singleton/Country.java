package com.kg.xmlhttprequest;

/**
 * Country
 */
public class Country {
    private int id;
    private String name;

    /**
     * @return the countryid
     */
  /**
   * @return the id
   */
  public int getId() {
      return id;
  }/**
   * @param id the id to set
   */
  public void setId(int id) {
      this.id = id;
  }/**
   * @return the name
   */
  public String getName() {
      return name;
  }/**
   * @param name the name to set
   */
  public void setName(String name) {
      this.name = name;
  }
    @Override
    public String toString() {
        return id+" ->"+name;
    }
}