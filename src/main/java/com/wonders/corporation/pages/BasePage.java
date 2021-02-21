package com.wonders.corporation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver webDriver;


    public void resetPageFactory(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }


    public void clickElement(WebElement element) {
        waitForElementToAppear(element);
        highlightElement(element);
        element.click();
    }

    public void sendKey(WebElement element, String value) {
        highlightElement(element);
        element.sendKeys(value);
    }

    public void waitForElementToAppear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.visibilityOf(element));
        highlightElement(element);
    }

    public void highlightElement(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].setAttribute('style','border: 2px solid yellow;');", element);
    }

    public String getPageTitle(){
       return webDriver.getTitle();
    }
}
