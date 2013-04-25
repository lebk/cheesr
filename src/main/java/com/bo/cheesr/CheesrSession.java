package com.bo.cheesr;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;


/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class CheesrSession extends WebSession
{

  private Cart cart = new Cart();

  public CheesrSession(Request request)
  {
    super(request);
  }

  public Cart getCart()
  {
    return cart;
  }

}
