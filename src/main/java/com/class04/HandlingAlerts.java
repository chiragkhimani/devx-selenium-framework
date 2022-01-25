package com.class04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        // Click on button to get java script alert
        WebElement jsAlertBtn3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsAlertBtn3.click();

       Alert alert = driver.switchTo().alert();

       alert.getText();
       alert.sendKeys("Test Input");
       Thread.sleep(5000);
       alert.accept();
       //alert.dismiss();

    }
}
