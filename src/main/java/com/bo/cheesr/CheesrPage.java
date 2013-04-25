package com.bo.cheesr;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class CheesrPage extends WebPage
{

  public CheesrSession getCheesrSession()
  {
    return (CheesrSession) getSession();
  }

  public Cart getCart()
  {
    return this.getCheesrSession().getCart();
  }

  public List<Cheese> getCheeses()
  {
    return ((CheesrApplication)CheesrApplication.get()).getCheeses();
  }
}
