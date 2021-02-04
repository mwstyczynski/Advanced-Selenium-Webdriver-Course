package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestUtilities {

    @Parameters({"username", "password", "expectedMessage"})
    @Test(priority = 1)
    public void negativeTest(String username, String password, String expectedErrorMessage) {
        log.info("Starting negativeTest");

        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();
        LoginPage loginPage = welcomePageObject.clickFormAuthenticationLink();

        loginPage.negativeLogIn(username, password);
        loginPage.waitForErrorMessage();
        String message = loginPage.getErrorMessageText();

        Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");

    }

}
