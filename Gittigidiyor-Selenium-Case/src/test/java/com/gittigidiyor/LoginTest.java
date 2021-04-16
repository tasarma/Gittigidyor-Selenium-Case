package com.gittigidiyor;

import com.gittigidiyor.methods.HomePage;
import com.gittigidiyor.methods.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.loginToPage();
        Assert.assertEquals(loginPage.accountText(), "Hesabım");
    }
}
