package com.learn.maven.maven_eclipse_project;
import com.learn.maven.maven_eclipse_project.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.List;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Datepicker extends BaseTest {
	@Test
	public void testdatepicker() {
		  driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		  LocalDate today = LocalDate.now();
	        int currentYear = today.getYear();
	        int currentDay = today.getDayOfMonth();

	        WebElement datePicker = driver.findElement(By.name("my-date"));
	        datePicker.click();

	        String yearLocator = String.format("//th[contains(text(), '%d')]", currentYear);
	        WebElement monthElement = driver.findElement(By.xpath(yearLocator));
	        monthElement.click();

	        WebElement leftArrow = driver.findElement(By.cssSelector("div.datepicker-months th.prev"));
	        leftArrow.click();

	        WebElement monthPastYear = driver.findElement(By.xpath("//span[@class='month focused']"));
	        monthPastYear.click();

	        String dayElementLocator = String.format("//td[@class='day' and text()='%d']", currentDay);
	        WebElement dayElement = driver.findElement(By.xpath(dayElementLocator));
	        dayElement.click();

	        String oneYearBackDate = datePicker.getDomProperty("value");
	        System.out.println("Actual date selected from calendar: " + oneYearBackDate);

	        LocalDate previousYear = today.minusYears(1);
	        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String expectedDate = previousYear.format(dateFormat);
	        System.out.println("Expected date: " + expectedDate);

	        assertEquals(oneYearBackDate, expectedDate, "Selected date does not match the expected date!");
		
	}
	

}
