package com.wonders.corporation.hooks;

import com.wonders.corporation.config.ConfigurationWonders;
import com.wonders.corporation.steps.BaseSteps;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
        classes = {ConfigurationWonders.class}
)
public class Hooks extends BaseSteps {

    @Before
    public void initPagesDriver() {
        basePage.resetPageFactory(webDriver);
        landingPage.resetPageFactory(webDriver);
        loginPage.resetPageFactory(webDriver);
    }

}
