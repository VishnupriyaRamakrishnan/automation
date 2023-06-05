package com.selenium.A1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D7_2 {
	int a=5,b=2,c;
  @Test(priority=1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,7);
	  System.out.println(c);
	  
  }
  @Test(priority=2)
  public void subtract() {
	  c=a-b;
	  Assert.assertEquals(c,3);
	  System.out.println(c);
	  
  }
  @Test(priority=3)
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(c,10);
	  System.out.println(c);
	  
  }
  @Test(priority=4)
  public void division() {
	  c=a/b;
	  Assert.assertEquals(c,2);
	  System.out.println(c);
	  
  }
}
