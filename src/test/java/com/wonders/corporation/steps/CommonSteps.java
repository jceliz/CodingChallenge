package com.wonders.corporation.steps;

import io.cucumber.java.en.When;

public class CommonSteps extends BaseSteps{


    @When("The user open browser")
    public void openBrowser(){
        landingPage.openBrowser(artOfTesting);
    }


}
