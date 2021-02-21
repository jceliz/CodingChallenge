package com.wonders.corporation.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,

        glue = {
                "com.wonders.corporation",
        },

        features = {
                "classpath:features"
        }
        ,
        tags = "@Regression"
)
public class TestRunner {
}
