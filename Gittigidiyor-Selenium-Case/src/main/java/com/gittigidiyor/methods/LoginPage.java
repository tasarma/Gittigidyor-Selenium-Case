package com.gittigidiyor.methods;

import com.gittigidiyor.User;
import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends WebDriverHelper {

    By emailBy = By.id("L-UserNameField");
    By passwordBy = By.id("L-PasswordField");
    By submitBy = By.id("gg-login-enter");
    By accountBy = By.cssSelector("[data-cy='header-user-menu']");
    By searchFieldBy = By.className("itMXHg");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void loginToPage(){
        User user = new User();
        sendKeys(emailBy,user.getEmail());
        sendKeys(passwordBy,user.getPassword());
        webDriver.findElement(submitBy).click();
    }

    public String accountText(){
        String text = getText(accountBy);
        String[] texts = text.split("\\s",2);
        return texts[0];
    }

    public ProductPage goToProductPage(){
        webDriver.findElement(searchFieldBy).sendKeys("bilgisayar" + Keys.ENTER);
        return new ProductPage(webDriver);
    }
}
