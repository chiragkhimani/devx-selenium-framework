package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDisabledElement {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://www.ebay.com/sch/ebayadvsearch");

        driver.manage().window().maximize();


        WebElement checkBx1 = driver.findElement(By.id("LH_TitleDesc"));
        WebElement checkBx2 = driver.findElement(By.id("LH_Complete"));
        WebElement checkBx3 = driver.findElement(By.id("LH_Sold"));

        checkBx1.click();

        // Check if element is displayed on webpage or not
        System.out.println(checkBx1.isDisplayed());
        System.out.println(checkBx2.isDisplayed());
        System.out.println(checkBx3.isDisplayed());

        // Check if element is enabled or not
        System.out.println(checkBx1.isEnabled());
        System.out.println(checkBx2.isEnabled());
        System.out.println(checkBx3.isEnabled());

        // Check if element is selected or not
        System.out.println(checkBx1.isSelected());
        System.out.println(checkBx2.isSelected());
        System.out.println(checkBx3.isSelected());
    }
}
