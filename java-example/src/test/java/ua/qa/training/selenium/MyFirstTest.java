package ua.qa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertFalse;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by osoboleva on 12/2/2016.
 */
public class MyFirstTest extends TestBase{

    @Test
    public void myTest1() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        assertFalse(isElementPresent(By.xpath("//div[")));
        //driver.findElement(By.name("btnG")).click();
        //wait.until(titleIs("webdriver - Google Search"));
    }

    @Test
    public void myTest2() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver - Google Search"));
    }

    @Test
    public void myTest3() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver - Google Search"));
    }

}
