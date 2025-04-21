package com.learn.maven.maven_eclipse_project;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterClass;
public class BaseTest {
	

	
	    protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        // You can set system property here or use WebDriverManager
	        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver-win64\\chromedriver.exe");
	        driver.manage().window().maximize();
	    }
	    

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

