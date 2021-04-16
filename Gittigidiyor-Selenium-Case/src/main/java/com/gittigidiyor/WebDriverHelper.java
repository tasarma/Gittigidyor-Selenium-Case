package com.gittigidiyor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    protected WebDriver webDriver;
    Actions actions;

    public WebDriverHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actions = new Actions(this.webDriver);
    }

    public void moveToElement(By hover){
        WebElement hoverOverFirstElement = webDriver.findElement(hover);
        actions.moveToElement(hoverOverFirstElement).perform();
    }

    public void clickOnElement(By click){
        WebDriverWait wait = new WebDriverWait(webDriver,1);
        wait.until(ExpectedConditions.elementToBeClickable(click)).click();
    }

    public void sendKeys(By byElement, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
    }

    public String getText(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
    }

    public void switchPage(By element){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement webElement = webDriver.findElement(element);
        js.executeScript("arguments[0].scrollIntoView();",webElement);
        webElement.click();
    }

    public void scrollOnPage(By element){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement webElement = webDriver.findElement(element);
        js.executeScript("arguments[0].scrollIntoView();",webElement);
    }
}
