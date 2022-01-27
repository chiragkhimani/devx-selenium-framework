package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StaleElementReferenceException {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
        // Open the browser
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTest1(){
        WebElement homeMenu = driver.findElement(By.xpath("//a[text()='Home']"));
        WebElement aboutMenu = driver.findElement(By.xpath("//a[text()='About']"));
        WebElement contactUsMenu = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        WebElement portfolioMenu = driver.findElement(By.xpath("//a[text()='Portfolio']"));

        portfolioMenu.click();

        driver.get("http://the-internet.herokuapp.com/disappearing_elements");

        contactUsMenu = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUsMenu.click();

    }



}
