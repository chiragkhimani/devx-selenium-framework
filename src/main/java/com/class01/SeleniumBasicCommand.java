package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommand {
    public static void main(String[] args) {

        // Setting path to chromedriver.exe
        //System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");

        // Open the browser
        // WebDriver - Parent interface of all driver classes
        // We're using dynamic polymorphism to create driver object at run time

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://www.google.com");

        // Maximize
        driver.manage().window().maximize();

        // Delete all the cookies so it'll start the fresh browser
        driver.manage().deleteAllCookies();

        // Close the browser
        driver.close();
    }
}
