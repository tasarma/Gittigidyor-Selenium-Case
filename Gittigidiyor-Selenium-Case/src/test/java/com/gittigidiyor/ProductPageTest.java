package com.gittigidiyor;

import com.gittigidiyor.methods.LoginPage;
import com.gittigidiyor.methods.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest{

    @Test
    public void pageT(){
        LoginPage loginPage = new LoginPage(webDriver);
        ProductPage productPage = loginPage.goToProductPage();
        productPage.goToSecondPage();
        Assert.assertEquals(productPage.checkPageNumber(),"2");
    }
}
