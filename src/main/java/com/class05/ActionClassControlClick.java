package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassControlClick {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement signInLink = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));

        Actions action = new Actions(driver);
        // It's best practice to use .build() as it'll build sequence of action into single
        action.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();

    }
}
