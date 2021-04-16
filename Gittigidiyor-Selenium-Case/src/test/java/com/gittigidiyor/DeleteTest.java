package com.gittigidiyor;

import com.gittigidiyor.methods.AddToBasket;
import com.gittigidiyor.methods.BasketPage;
import com.gittigidiyor.methods.LoginPage;
import com.gittigidiyor.methods.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteTest extends BaseTest{

    @Test
    public void delete() {
        LoginPage loginPage = new LoginPage(webDriver);
        ProductPage productPage = loginPage.goToProductPage();
        productPage.goToSecondPage();
        AddToBasket addToBasket = productPage.clickOnProduct();
        addToBasket.addBasket();
        BasketPage basketPage = addToBasket.goToBasket();
        basketPage.deleteAllProduct();
        Assert.assertEquals(basketPage.returnText(), true);
    }
}
