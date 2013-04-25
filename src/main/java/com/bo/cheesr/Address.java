package com.bo.cheesr;

/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class Address implements java.io.Serializable
{
  private String zipCode;
  private String address;

  public String getZipCode()
  {
    return zipCode;
  }

  public void setZipCode(String zipCode)
  {
    this.zipCode = zipCode;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

}
