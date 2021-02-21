package com.wonders.corporation.steps.artoftesting;

import com.wonders.corporation.steps.BaseSteps;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class LandingStepDef extends BaseSteps {


    @And("The user verifies page title {string}")
    public void theUserVerifiesPageTitle(String title) {
        Assert.assertEquals(title, basePage.getPageTitle());
    }

    @And("The user verifies page Label")
    public void theUserVerifiesPageLabel() {
        Assert.assertTrue(landingPage.labelSamplePage());
    }

    @And("The user verifies page textbox {string}")
    public void theUserVerifiesPageTextbox(String value) {
        landingPage.sendKeyFName(value);
        Assert.assertTrue(landingPage.verifyTextbox(value));
    }


    @And("The user verifies page radio button")
    public void theUserVerifiesPageRadioButton() {
        landingPage.verifyRadioButton();
    }

    @And("The user verifies page drag and drop")
    public void theUserVerifiesPageDragAndDrop() {
        landingPage.verifyDragAndDrop();
    }
}
