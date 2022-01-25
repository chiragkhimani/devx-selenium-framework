package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleWindow {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        // Retrieve current window id
        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);

        // Click on footer link - OrangeHRM
        WebElement linkToOrangeHrm = driver.findElement(By.xpath("//div[@id='footer']/div/a[text()='OrangeHRM, Inc']"));
        linkToOrangeHrm.click();

        // Retrieve list of open window id
        Set<String> listOfWindow = driver.getWindowHandles();

        // Switching to new window
        for (String eachWindow   : listOfWindow ) {
            if(!eachWindow.equals(originalWindow)){
                driver.switchTo().window(eachWindow);
            }
        }

        // Entering text
        WebElement emailInputBox = driver.findElement(By.id("myText"));
        emailInputBox.sendKeys("test@gmail.com");

        WebElement tryForFreeBtn = driver.findElement(By.id("linkadd"));
        tryForFreeBtn.click();

        // Close the current tab (Close 2nd window as we're on 2nd window)
        driver.close();

        driver.switchTo().window(originalWindow);

        // Close the original window
        driver.close();
    }
}
