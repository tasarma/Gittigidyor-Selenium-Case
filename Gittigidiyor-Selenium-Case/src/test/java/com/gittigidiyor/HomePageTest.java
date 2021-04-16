package com.gittigidiyor;

import com.gittigidiyor.methods.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    By webPageName = By.className("dCMDfb");


    @Test
    public void checkIfPageIsRight(){
    HomePage homePage = new HomePage(webDriver);
    String title = homePage.getText(webPageName,"title");
    Assert.assertEquals(title, "GittiGidiyor");
    }
}
