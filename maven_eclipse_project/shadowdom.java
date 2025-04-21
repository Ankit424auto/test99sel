package com.learn.maven.maven_eclipse_project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.learn.maven.maven_eclipse_project.BaseTest;

public class shadowdom extends BaseTest{
	@Test
    public void testShadowDOM() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");
        WebElement content = driver.findElement(By.id("content"));

        SearchContext shadowRoot = content.getShadowRoot();
        WebElement textElement = shadowRoot.findElement(By.cssSelector("p"));
        Assert.assertEquals(textElement.getText(), "Hello Shadow DOM", "Text does not match!");
    }

    @Test
    public void testShadowDOMWithJSE() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");
        WebElement content = driver.findElement(By.id("content"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        SearchContext shadowRoot = (SearchContext) jse.executeScript("return arguments[0].shadowRoot", content);
        WebElement textElement = shadowRoot.findElement(By.cssSelector("p"));
        Assert.assertEquals(textElement.getText(), "Hello Shadow DOM", "Text does not match!");
    }

}
