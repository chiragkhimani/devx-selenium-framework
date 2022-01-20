package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioBtn {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkBx1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        if(!checkBx1.isSelected()) {
            checkBx1.click();
        }

        WebElement checkBx2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if(!checkBx1.isSelected()) {
            checkBx2.click();
        }
    }
}
