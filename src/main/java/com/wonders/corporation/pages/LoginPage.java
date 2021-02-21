package com.wonders.corporation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.charset.Charset;
import java.util.Random;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//span[text()='Sign in']")
    private WebElement BTN_SIGN_IN;
    @FindBy(xpath = "//a[text()='Register']")
    private WebElement BTN_REGISTER;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement BTN_REGISTER_AND_SIGN_IN;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement TXTBOX_USERNAME;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement TXTBOX_PASSWORD;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement TXTBOX_REENTERPASS;

    public void navToGiordanoPage(String giordano) {
        webDriver.navigate().to(giordano);
    }

    public void clickSignIn() {
        clickElement(BTN_SIGN_IN);
    }

    public boolean verifyLoginPage() {
        return BTN_REGISTER.isEnabled();
    }

    public void clickRegister() {
        BTN_REGISTER.click();
    }

    public boolean verifyRegisterPage() {
        return BTN_REGISTER_AND_SIGN_IN.isEnabled();
    }

    public void clickRegisterAndSignIn() {
        BTN_REGISTER_AND_SIGN_IN.click();
    }

    public void enterUsername(String s) {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        sendKey(TXTBOX_USERNAME, generatedString + s);
    }

    public void enterPassword(String s) {
        sendKey(TXTBOX_PASSWORD, s);
    }

    public void reenterPassword(String s) {
        sendKey(TXTBOX_REENTERPASS, s);
    }

    @FindBy(xpath = "//span[@id='profileMenuTitle']")
    private WebElement element;

    public void verifyUserIsLogin() {
        element.isEnabled();
    }
}
