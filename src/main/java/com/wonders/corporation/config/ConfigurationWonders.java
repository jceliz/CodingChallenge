package com.wonders.corporation.config;

import com.wonders.corporation.pages.BasePage;
import com.wonders.corporation.pages.LandingPage;
import com.wonders.corporation.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import sun.rmi.runtime.Log;

public class ConfigurationWonders {

    @Autowired
    Environment environment;


    @Autowired
    String browser;

    @Autowired
    protected static WebDriver webDriver;

    @Autowired
    private ChromeOptions chromeOptions;

    @Autowired
    private String giordano;

    @Bean
    public String giordano() {
        giordano = environment.getProperty("url.giordano");
        return giordano;
    }

    @Bean
    public String browser() {
        browser = environment.getProperty("browser");
        return browser;
    }

    @Autowired
    private String artOfTesting;

    @Bean
    public String artOfTesting(){
        artOfTesting = environment.getProperty("url.artOfTesting");
        return artOfTesting;
    }

    @Bean
    @DependsOn("browser")
    public ChromeOptions chromeOptions() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifactions");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        String chromeDriverPath = "";
        chromeDriverPath = environment.getProperty("webdriver.chrome");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        chromeOptions = options;
        return chromeOptions;
    }

    @Bean
    @DependsOn("chromeOptions")
    public WebDriver webDriver() throws Exception {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(chromeOptions);
        }
        return webDriver;
    }

    @Bean
    @DependsOn("webDriver")
    public BasePage basePage() {
        return new BasePage();
    }

    @Bean
    @DependsOn("webDriver")
    public LandingPage landingPage() {
        return new LandingPage();
    }


    @Bean
    @DependsOn("webDriver")
    public LoginPage loginPage() {
        return new LoginPage();
    }

}
