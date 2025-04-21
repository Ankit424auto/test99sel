package com.learn.maven.maven_eclipse_project;
import com.learn.maven.maven_eclipse_project.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.List;
public class webtables extends BaseTest {
	@Test
	public void testmain()throws InterruptedException {
		driver.get("C:\\Users\\HP\\Desktop\\webtable.html");
		Thread.sleep(5000);
		WebElement table =driver.findElement(By.id("employeeTable"));
		Thread.sleep(2000);
		List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
		for(WebElement row :rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell : cells) 
			{
		
			System.out.print(cell.getText() + " ");
			
			}
			System.out.println();
		}
	}
		@Test
		public void rowcolmn()throws InterruptedException {
			driver.get("C:\\Users\\HP\\Desktop\\webtable.html");
			Thread.sleep(5000);
			WebElement table =driver.findElement(By.id("employeeTable"));
			Thread.sleep(2000);
			// Count Rows
			int rowCount = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr")).size();
			System.out.println("Total Rows: " + rowCount);

			// Count Columns
			int columnCount = driver.findElements(By.xpath("//table[@id='employeeTable']/thead/tr/th")).size();
			System.out.println("Total Columns: " + columnCount);
			// Get data from row 2, column 3
			String cellData = driver.findElement(By.xpath("//table[@id='employeeTable']/tbody/tr[6]/td[2]")).getText();
			System.out.println("Cell Data: " + cellData);
			// Locate the row containing the specific employee ID
	        WebElement row1 = driver.findElement(By.xpath("//tbody//tr[td[text()='105']]"));
	        String userName = row1.findElement(By.xpath("td[2]")).getText();
	        System.out.println("User name: " + userName); // Cassy
	}
		
	

}
