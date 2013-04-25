package com.bo.cheesr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Author: lebk.lei@gmail.com Date: 2013-4-25
 */
public class CheesrApplicationTest
{
  CheesrApplication ca;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception
  {
  }

  @Before
  public void setUp() throws Exception
  {
    ca = new CheesrApplication();
    ca.init();

  }

  @After
  public void tearDown() throws Exception
  {
    ca = null;
  }

  @Test
  public void testGetCheeses()
  {
    List<Cheese> cl = ca.getCheeses();
    for (Cheese c : cl)
    {
      System.out.println("==============================================");
      System.out.println(c.getName());
      System.out.println(c.getPrice());
      System.out.println(c.getDescription());

    }
  }
}
