package com.learn.maven.maven_eclipse_project;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	 @Test(dataProvider = "getData")
	    public void testLogin(String userName, String password) {
	        System.out.println("==========START===============");
	        System.out.println("Username is: " + userName);
	        System.out.println("Password is: " + password);
	        System.out.println("===========END==============");
	    }

	    @DataProvider
	    public Object[][] getData() {
	        return new Object[][] {
	                {"user1", "password1"},
	                {"user2", "password2"},
	                {"user3", "password3"},
	                {"user4", "password4"},
	                {"user5", "password5"}
	        };
	    }
	}

