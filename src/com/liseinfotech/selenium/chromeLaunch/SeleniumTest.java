package com.liseinfotech.selenium.chromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/aaa/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver(); //Launching the chrome browser

        driver.get("http://yahoo.com"); //enter url
        String title=driver.getTitle(); //get title

        System.out.println(title);

        //Validation point in terms of title (Actual Vs. Expected one...)
        if(title.equals("Yahoo Search - Web Search")){
            System.out.println("Here is Correct title.....");
        }else{
            System.out.println("Here is Incorrect title.....");
        }

        //        driver.quit();  //quit the browser...

    }
}
