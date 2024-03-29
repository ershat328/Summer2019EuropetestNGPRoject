package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WEBDRIVERFACTORY {

    public static WebDriver getDriver(String browersType) {
        WebDriver driver = null;

            switch(browersType.toLowerCase ( )) {
                case "chrome":
                WebDriverManager.chromedriver ( ).setup ( );
                driver = new ChromeDriver ( );
                break;

                case "firefox":
                    WebDriverManager.firefoxdriver ().setup ();
                    driver= new FirefoxDriver ();

        }
        return driver;

    }
}



