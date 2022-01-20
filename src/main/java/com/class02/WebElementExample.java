package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");

        // Open the browser
        ChromeDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("TV");

        String text =  searchBox.getAttribute("placeholder");
        System.out.println(text);

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        WebElement footerWarning = driver.findElement(By.xpath("//td[@class='gf-legal']"));
        String text1 = footerWarning.getText();
        System.out.println(text1);

        // To use submit method the element should have type="submit" attribute
        // searchBtn.submit();

    }
}
