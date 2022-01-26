package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHoverAndClick {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement jobMenu = driver.findElement(By.id("menu_admin_Job"));
        WebElement jobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));

        Actions action = new Actions(driver);
        // It's best practice to use .build() as it'll build sequence of action into single
        action.moveToElement(adminMenu).moveToElement(jobMenu).click(jobTitle).build().perform();

    }
}
