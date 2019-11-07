package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class navigationDemo {


    public static void main(String[] args) throws InterruptedException {

        // we have to setup webdriver based on the browser that we gonna use

        WebDriverManager.chromedriver().setup();

        //selenuim object

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
// another way of opening Website
        driver.navigate().to("https://www.facebook.com");

        //goes back to prevuise website
        driver.navigate().back();


       // stopps the coode for 4 sec =4000
        Thread.sleep(4000);


        // goes back to after goes back
        driver.navigate().forward();

        //refresh  the page.

        driver.navigate().refresh();

        driver.quit();



    }



}
