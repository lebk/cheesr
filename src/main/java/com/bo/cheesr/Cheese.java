package com.bo.cheesr;

/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class Cheese implements java.io.Serializable
{
  private String name;
  private double price;
  private String description;

  public Cheese(String name, String description, double price)
  {
    this.name = name;
    this.price = price;
    this.description = description;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

}
