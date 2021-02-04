package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject{
//    Variables are not required anymore since they are in extended class
//    private WebDriver driver;
//    private Logger log;
private String pageUrl = "http://the-internet.herokuapp.com/secure";

    private By logOutButton = By.xpath("//a[@class='button secondary radius']");
    private By message = By.id("flash-messages");


    public SecureAreaPage(WebDriver driver, Logger log) {
//        this.driver = driver;
//        this.log = log;
//        since those are declared in extended class we use SUPER to declare them further
        super(driver, log);
    }

    /** Get URL variable from PageObject */
    public String getPageUrl() {
        return pageUrl;
    }

    /** Verification if logOutButton is visible on the page */
    public boolean isLogOutButtonVisible() {
        return find(logOutButton).isDisplayed();
    }

    /** Return text from success message */
    public String getSuccessMessageText() {
        return find(message).getText();
    }

}