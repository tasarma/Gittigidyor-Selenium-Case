package com.gittigidiyor.methods;

import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends WebDriverHelper {

    By secondPriceOfProductBy = By.className("real-discounted-price");
    By increaseProductNumberBy = By.cssSelector("select.amount");
    By addAnotherProductBy = By.cssSelector("[value='2']");
    By deleteButtonBy = By.cssSelector("i.gg-icon.gg-icon-bin-medium");
    By noProductTextBy = By.cssSelector("a[title='Anasayfa']");

    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getSecondPrice(){
        return getText(secondPriceOfProductBy);
    }

    public void setIncreaseProductNumber(){
        webDriver.findElement(increaseProductNumberBy).click();
        webDriver.findElement(addAnotherProductBy).click();
    }

    public String getProductNumber(){
        return webDriver.findElement(increaseProductNumberBy).getAttribute("value");
    }

    public void deleteAllProduct(){
        webDriver.findElement(deleteButtonBy).click();
    }

    public boolean returnText(){
        return webDriver.findElement(noProductTextBy).isEnabled();
    }
}
