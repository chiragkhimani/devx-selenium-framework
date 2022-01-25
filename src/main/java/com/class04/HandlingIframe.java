package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingIframe {
    public static void main(String[] args) throws InterruptedException {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();

        // Switch to iFrame
        WebElement iFrameElement = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrameElement);

        // Entering text
        WebElement textArea = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        textArea.sendKeys("Chirag");

        // Switching to default webpage
        driver.switchTo().defaultContent();

        // Retrieving title of the page
        WebElement titleText = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println(titleText.getText());
    }
}
