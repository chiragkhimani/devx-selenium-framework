package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHoverAndClickEbay {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement appleLink = driver.findElement(By.xpath("//li/a[text()='Apple']"));

        Actions action = new Actions(driver);
        // It's best practice to use .build() as it'll build sequence of action into single
        action.moveToElement(electronicsLink).pause(1000).click(appleLink).build().perform();

    }
}
