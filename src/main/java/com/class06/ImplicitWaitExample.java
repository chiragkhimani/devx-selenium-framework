package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // Implicit wait,  Selenium Version < 4 - Syntax is
        // It applies to command so if element is not present in the DOM then implicit wait will work
        // If element is present in DOM but not visible then we've to use explicit wait because
        // Selenium will be able to find out element & it'll not wait for element to be visible
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Implicit wait,  Selenium Version >= 4 - Syntax is
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.manage().window().maximize();

        WebElement startBtn = driver.findElement(By.xpath("//div[@id='start']/button"));
        startBtn.click();

        // Option 1 - Static wait - Not recommended
        // Thread.sleep(5000);

        // "Hello World" - element is not present in the DOM so selenium will wait maximum
        // 60 seconds till element is present in the DOM after that it'll throw exception
        WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());

    }
}
