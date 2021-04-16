package com.gittigidiyor.methods;

import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends WebDriverHelper {

    By secondPageButtonBy = By.cssSelector("li.next-link");
    By bos = By.cssSelector("a.current");
    By productBy = By.id("item-info-block-647430319");

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToSecondPage(){
        switchPage(secondPageButtonBy);
    }

    public String checkPageNumber(){
        scrollOnPage(bos);
        return getText(bos);
    }

    public AddToBasket clickOnProduct(){
        webDriver.findElement(productBy).click();
        return new AddToBasket(webDriver);
    }
}
