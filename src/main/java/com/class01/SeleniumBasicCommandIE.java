package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class SeleniumBasicCommandIE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser");

        String browser = sc.nextLine();
        WebDriver driver;

        switch (browser){
            case "chrome":
                // Setting path to chromedriver.exe
                System.setProperty("webdriver.chrome.driver","src//main//resources//driver//chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver","src//main//resources//driver//geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "ie":
                System.setProperty("webdriver.ie.driver","src//main//resources//driver//IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;

            default:
               throw new RuntimeException("Browser is not valid it can be chrome,ff or ie");

        }

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
