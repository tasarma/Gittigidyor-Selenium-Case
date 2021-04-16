package com.gittigidiyor.methods;

import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasket extends WebDriverHelper {

    By firstPriceOfProduct = By.id("sp-price-discountPrice");
    By addButtonBy = By.id("add-to-basket");
    By basketButtonBy = By.className("basket-title");
    By goToBasketBy = By.cssSelector("a.gg-ui-btn-default.padding-none");

    public AddToBasket(WebDriver webDriver) {
        super(webDriver);
    }

    public void addBasket(){
        webDriver.findElement(addButtonBy).click();
    }

    public BasketPage goToBasket(){
        moveToElement(basketButtonBy);
        clickOnElement(goToBasketBy);
        return new BasketPage(webDriver);
    }

    public String getFirstPrice(){
        return getText(firstPriceOfProduct);
    }




}
