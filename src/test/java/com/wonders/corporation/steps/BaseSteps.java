package com.wonders.corporation.steps;

import com.wonders.corporation.pages.BasePage;
import com.wonders.corporation.pages.LandingPage;
import com.wonders.corporation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseSteps {

    protected List<List<String>> listOfDt;
    protected Map<String, String> keyval;
    @Autowired
    protected Environment environment;
    @Autowired
    protected WebDriver webDriver;
    @Autowired
    protected BasePage basePage;
    @Autowired
    protected String artOfTesting;
    @Autowired
    protected String giordano;
    @Autowired
    protected LandingPage landingPage;
    @Autowired
    protected LoginPage loginPage;

    public List<String> getListOfString(String text) {
        List<String> newListOfString = new ArrayList<>();

        for (String item : text.split(",")) {
            newListOfString.add(item.trim());
        }
        return newListOfString;
    }

}
