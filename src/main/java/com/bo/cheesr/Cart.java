package com.bo.cheesr;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class Cart implements java.io.Serializable
{

  private List<Cheese> cheeses = new ArrayList<Cheese>();

  private Address billingAddress = new Address();

  public List<Cheese> getCheeses()

  {
    return cheeses;
  }

  public void setCheeses(List<Cheese> other)
  {
    cheeses = other;
  }

  public Address getBillingAddress()
  {
    return billingAddress;
  }

  public void setBillingAddress(Address other)
  {
    this.billingAddress = other;
  }

  public double getTotal()
  {
    double total = 0;
    for (Cheese cheese : cheeses)
    {
      total += cheese.getPrice();

    }
    return total;
  }
}
