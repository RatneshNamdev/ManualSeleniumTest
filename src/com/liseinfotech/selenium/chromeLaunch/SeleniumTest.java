package com.liseinfotech.selenium.chromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/aaa/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("http://yahoo.com");

        System.out.println(driver.getTitle());

        driver.quit();

        System.out.println("Here is RATNESH NAMDVE.....");


    }
}
