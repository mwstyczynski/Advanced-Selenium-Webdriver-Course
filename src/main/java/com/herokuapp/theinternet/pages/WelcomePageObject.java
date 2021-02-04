package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.herokuapp.theinternet.pages.BasePageObject.*;

public class WelcomePageObject extends BasePageObject {
    //create private variables
    //not needed once declared in extended class

    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

    // constructors in page objects will receive variables: WebDriver and Logger
    // since those are declared in extended class we use SUPER to declare them further
    public WelcomePageObject(WebDriver driver, Logger log) {
        // assign variables we receive to class level variables
        super(driver, log);
    }


    //method that opens the main page
    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    //method that clicks on authentication button and returns new page class
    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication link on Welcome Page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

}
