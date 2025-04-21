package com.learn.maven.maven_eclipse_project;
import com.learn.maven.maven_eclipse_project.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;
public class ScreenShotsinSelenium extends BaseTest {
	@Test
	public void testscreenshottpng() throws IOException, InterruptedException{
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		TakesScreenshot takesscreenshot= (TakesScreenshot) driver;
		File screenshot = takesscreenshot.getScreenshotAs(OutputType.FILE);
		Path destination = Paths.get("screenshot2.png");
        Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);

        // Assert that the screenshot file exists
        assertThat(destination).exists();
		
				
		
	}
	
	@Test
	public void testWebElementScreenshot() throws IOException {
	    driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	    WebElement element = driver.findElement(By.tagName("form"));
	    File screenshot = element.getScreenshotAs(OutputType.FILE);

	    Path destination = Paths.get("element-screenshot.png");
	    Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);

	    assertThat(destination).exists();
	}
	@Test
	public void test2elessgeeksforgeeksfunc()throws IOException {
		driver.get("https://www.geeksforgeeks.org/software-testing-functional-testing/?");
		WebElement func=driver.findElement(By.xpath("//*[@id='post-301363']/div[4]"));
		File screenshot = func.getScreenshotAs(OutputType.FILE);

	    Path destination = Paths.get("funcationaltest-screenshot.png");
	    Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);

	    assertThat(destination).exists();
	}
@Test
public void test3elessgeeksforgeeksfunc()throws IOException{
	driver.get("https://www.geeksforgeeks.org/software-testing-functional-testing/?");
	WebElement func4=driver.findElement(By.xpath("//*[@id='post-301363']/div[4]/div[2]"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	File screenshot = func4.getScreenshotAs(OutputType.FILE);

    Path destination = Paths.get("funcationaltest2-screenshot.png");
    Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);

    assertThat(destination).exists();
}
@Test
public void testScreenshotBase64() {
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    driver.manage().window().maximize();

    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    String screenshot = takesScreenshot.getScreenshotAs(OutputType.BASE64);

    System.out.println("Screenshot in BASE64 format: data:image/png;base64," + screenshot);
    
    // Replacing assertThat with assertEquals
    assertEquals(false, screenshot.isEmpty());
}
}
