package com.wonders.corporation.steps.giordano;

import com.wonders.corporation.steps.BaseSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginStepDef extends BaseSteps {

    @When("The user navigate to Giordano page")
    public void navToGiordanoPage() {
        loginPage.navToGiordanoPage(giordano);
    }

    @And("The user click Sign in")
    public void theUserClickSignIn() {
        loginPage.clickSignIn();
    }

    @Then("The Login Page is displayed")
    public void theLoginPageIsDisplayed() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Given("The user click Register")
    public void theUserClickRegister() {
        loginPage.clickRegister();
    }

    @Then("Register page is displayed")
    public void thenRegisterPageIsDisplayed() {
        Assert.assertTrue(loginPage.verifyRegisterPage());
    }


    @And("The user enter the following details")
    public void theUserEnterTheFollowingDetails(DataTable dataTable) {
        keyval = dataTable.asMap(String.class, String.class);
        listOfDt = dataTable.asLists();

        for (List<String> item : listOfDt) {
            List<String> list = getListOfString(item.toString().replace("[", ""));
            switch (list.get(0)) {
                case "username":
                    loginPage.enterUsername(keyval.get(list.get(0)));
                    break;
                case "password":
                    loginPage.enterPassword(keyval.get(list.get(0)));
                    break;
                case "re-enter password":
                    loginPage.reenterPassword(keyval.get(list.get(0)));
                    break;
                default:
                    System.out.println("ERROR: Case not found in Switch Case! " + "\n" + "Please check this case --> " + keyval.get(list.get(0)));
            }
        }
    }

    @Then("Then user is login")
    public void thenUserIsLogin() {
        loginPage.verifyUserIsLogin();
    }

    @And("The user click Register and Sign in")
    public void theUserClickRegisterAndSignIn() {
        loginPage.clickRegisterAndSignIn();
    }
}
