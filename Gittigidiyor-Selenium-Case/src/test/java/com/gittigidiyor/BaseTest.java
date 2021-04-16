package com.gittigidiyor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    By cookieBoxBy = By.className("tyj39b-3");

    WebDriver webDriver;

    @BeforeMethod
    public void startUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.gittigidiyor.com/");
        webDriver.findElement(cookieBoxBy).click();

    }

    /*@AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5);
        webDriver.quit();
    }*/
}
