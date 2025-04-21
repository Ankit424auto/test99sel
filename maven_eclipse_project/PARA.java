package com.learn.maven.maven_eclipse_project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PARA {
  @Test
  @Parameters({"username", "password"})
  public void testLogin( String password) {
     
      System.out.println("Password: " + password);
  
  }
}
