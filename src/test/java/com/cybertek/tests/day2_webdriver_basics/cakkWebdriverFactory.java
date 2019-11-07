package com.cybertek.tests.day2_webdriver_basics;

import org.openqa.selenium.WebDriver;

public class cakkWebdriverFactory {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=WEBDRIVERFACTORY.getDriver ("Chrome");
        driver.get("https://amazon.com/");

    Thread.sleep (3000);
    driver.quit ();
    }
}
