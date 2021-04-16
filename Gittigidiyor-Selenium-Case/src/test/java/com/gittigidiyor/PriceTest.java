package com.gittigidiyor;

import com.gittigidiyor.methods.AddToBasket;
import com.gittigidiyor.methods.BasketPage;
import com.gittigidiyor.methods.LoginPage;
import com.gittigidiyor.methods.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceTest extends BaseTest{

    @Test
    public void checkProductPrice(){
        LoginPage loginPage = new LoginPage(webDriver);
        ProductPage productPage = loginPage.goToProductPage();
        productPage.goToSecondPage();

        AddToBasket addToBasket = productPage.clickOnProduct();
        String firstPrice = addToBasket.getFirstPrice();
        addToBasket.addBasket();

        BasketPage basketPage = addToBasket.goToBasket();
        String secondPrice = basketPage.getSecondPrice();
        Assert.assertEquals(firstPrice, secondPrice);
    }
}










