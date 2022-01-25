package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GetListOfWebElementText {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        // Login into website


        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

        // Hover mouse on job menu
        WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement jobMenuEle = driver.findElement(By.id("menu_admin_Job"));

        Actions action = new Actions(driver);
        action.moveToElement(adminMenu).moveToElement(jobMenuEle).build().perform();

        List<WebElement> listOfJobMenu = driver.findElements(By.xpath("//a[@id='menu_admin_Job']/following-sibling::ul/li/a"));

        for (WebElement jobMenu : listOfJobMenu) {
            System.out.println(jobMenu.getText());
        }

    }
}
