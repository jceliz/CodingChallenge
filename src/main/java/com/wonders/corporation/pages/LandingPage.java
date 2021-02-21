package com.wonders.corporation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends BasePage {

    @FindBy(xpath = "//img[@alt='ArtOfTesting']")
    private WebElement IMG_ART_OF_TESTING;
    @FindBy(xpath = "//span[@id='Sample_Page']")
    private WebElement LBL_SAMPLE_PAGE;
    @FindBy(xpath = "//input[@id='fname']")
    private WebElement TXTBOX_FNAME;
    @FindBy(xpath = "//input[@id=\"male\"]")
    private WebElement RB_MALE;
    @FindBy(xpath = "//img[@id='sourceImage']")
    private WebElement IMG_ART_OF_TESTING_DND;
    @FindBy(xpath = "//div[@id='targetDiv']")
    private WebElement TXTBOX_FIELD_DND;

    public void openBrowser(String url) {
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    public boolean labelSamplePage() {
        return LBL_SAMPLE_PAGE.isEnabled();
    }

    public boolean verifyTextbox(String value) {
        return TXTBOX_FNAME.getAttribute("value").equals(value);
    }

    public void sendKeyFName(String value) {
        sendKey(TXTBOX_FNAME, value);
    }

    public void verifyRadioButton() {
        RB_MALE.isEnabled();
    }

    public void verifyDragAndDrop() {
        Actions act = new Actions(webDriver);
        act.dragAndDropBy(IMG_ART_OF_TESTING_DND, 458, 734);

    }

}
