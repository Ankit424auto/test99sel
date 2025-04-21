package com.learn.maven.maven_eclipse_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import org.testng.annotations.Test;
import com.learn.maven.maven_eclipse_project.BaseTest;
public class fourtest {
	public class InteractionsTest extends BaseTest{
		public static final String URL = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
@Test
public void testSendKeys() {
    driver.get(URL);
    WebElement inputText = driver.findElement(By.name("my-text"));
    String textValue = "Hello World!";
    inputText.sendKeys(textValue);
    Assert.assertEquals(textValue, inputText.getDomProperty("value"));

    inputText.clear();
    Assert.assertTrue(inputText.getDomProperty("value").isEmpty());
	}
@Test
public void testcheckradiobutton() {
	driver.get(URL);
	WebElement radiobtn1 =driver.findElement(By.xpath("//input[@type='radio' and @checked]"));
	Assert.assertEquals("my-radio-1", radiobtn1.getDomAttribute("id"));
	 Assert.assertTrue(radiobtn1.isSelected());
	WebElement radiobtn2 =driver.findElement(By.xpath("//input[@type='radio' and not(@checked)]"));
	Assert.assertEquals("my-radio-2", radiobtn2.getDomAttribute("id"));
    Assert.assertFalse(radiobtn2.isSelected());
    radiobtn2.click();
    Assert.assertFalse(radiobtn1.isSelected());
    Assert.assertTrue(radiobtn2.isSelected());
}
@Test
public void testClickCheckBoxes() {
    driver.get(URL);

    WebElement checkbox1 = driver.findElement(By.cssSelector("[type=checkbox]:checked"));
    Assert.assertEquals("my-check-1", checkbox1.getDomAttribute("id"));
    Assert.assertTrue(checkbox1.isSelected());

    WebElement checkbox2 = driver.findElement(By.cssSelector("[type=checkbox]:not(:checked)"));
    Assert.assertEquals("my-check-2", checkbox2.getDomAttribute("id"));
    Assert.assertFalse(checkbox2.isSelected());

    checkbox1.click();
    Assert.assertFalse(checkbox1.isSelected());

    checkbox2.click();
    Assert.assertTrue(checkbox2.isSelected());
	}
@Test
public void testdropdown() {
	driver.get(URL);
	WebElement dropdown1= driver.findElement(By.xpath("//input[@list='my-options']"));
	dropdown1.click();
	WebElement optionvalue=driver.findElement(By.xpath("//datalist/option[4]"));//los angles
	String optionvalue1 =optionvalue.getDomAttribute("value");
	dropdown1.sendKeys(optionvalue1);
	Assert.assertEquals(optionvalue1, "Los Angeles");

	
	
}
@Test
public void upload() {
	driver.get(URL);
	WebElement upload=driver.findElement(By.xpath("//input[@name='my-file']"));
	
	 String filePath2 = "C:\\Users\\HP\\Desktop\\testfile.txt";  // Change this path
     upload.sendKeys(filePath2);
}
	}

	
	}
