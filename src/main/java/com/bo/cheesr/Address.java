package com.bo.cheesr;

/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class Address implements java.io.Serializable
{
  private Integer zipcode;
  private String name;
  private String street;
  private String city;

  public Integer getZipcode()
  {
    return zipcode;
  }

  public void setZipcode(Integer zipcode)
  {
    this.zipcode = zipcode;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

}
