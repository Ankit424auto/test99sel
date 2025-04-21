package com.learn.maven.maven_eclipse_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import com.learn.maven.maven_eclipse_project.BaseTest;
public class actionclassprovider {
	
	public class InteractionsTest extends BaseTest{
		@Test
		public void testcontectclick() {
			driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
			Actions actions= new Actions(driver);
			WebElement right=driver.findElement(By.id("my-dropdown-2"));
			actions.contextClick(right).build().perform();
			WebElement rightmenu2=driver.findElement(By.id("context-menu-2"));
			
			WebElement rightleft=driver.findElement(By.id("my-dropdown-3"));
			actions.doubleClick(rightleft).build().perform();
			WebElement rightmenu3=driver.findElement(By.id("context-menu-3"));
			
		}
		@Test
		public void testmousehover() {
			driver.get("https://bonigarcia.dev/selenium-webdriver-java/mouse-over.html");
			Actions actions= new Actions(driver);
			WebElement compass=driver.findElement(By.xpath("//img[@src='img/compass.png']"));
			 actions.moveToElement(compass).perform();

		        WebElement caption = driver.findElement(By.xpath("//p[text()='Compass']"));
		        assert caption.getText().equals("Compass");
		}
		@Test
		public void movedrag() throws InterruptedException {
			driver.get("https://bonigarcia.dev/selenium-webdriver-java/drag-and-drop.html");
			Actions actions = new Actions(driver);
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("target"));
	        
	        actions.dragAndDrop(source, target).perform();
	        Thread.sleep(5000);
	        // Verifying the drop
	        assert source.getLocation().equals(target.getLocation());
		}
		@Test
		public void clickandhold()throws InterruptedException {
			  driver.get("https://bonigarcia.dev/selenium-webdriver-java/draw-in-canvas.html");
		        driver.manage().window().maximize();
		        Actions actions = new Actions(driver);

		        WebElement canvas = driver.findElement(By.id("my-canvas"));
		        actions.moveToElement(canvas).clickAndHold();

		        int numPoints = 10;
		        int radius = 8;

		        for (int i = 0; i <= numPoints; i++) {
		            double angle = Math.toRadians((double) (360 * i) / numPoints);
		            double x = Math.sin(angle) * radius;
		            double y = Math.cos(angle) * radius;

		            actions.moveByOffset((int) x, (int) y).perform();
		            Thread.sleep(500); // Pause for visibility
		        }

		        actions.release(canvas).build().perform();
			
		}
		@Test
		public void copypaste()throws InterruptedException {
			driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
			driver.manage().window().maximize();
			Actions actions =new Actions(driver);
			
			 WebElement textInput = driver.findElement(By.id("my-text-id"));
		        WebElement textArea = driver.findElement(By.name("my-textarea"));
		        
		        
		        actions.sendKeys(textInput, "Hello Gamer").keyDown(Keys.CONTROL)
                .sendKeys(textInput, "a").sendKeys(textInput, "x")
                .sendKeys(textArea, "v").keyUp(Keys.CONTROL).build().perform();
		        // Select all + copy
		        Thread.sleep(5000);
		        
			
			
		}
		
		
		
	}
	
}
