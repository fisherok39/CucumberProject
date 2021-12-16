package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import pages.LoginPage;
import utils.Setup;

public class MyStepdefs {

    private LoginPage loginPage;
    private Setup setup;


    public MyStepdefs() {
        this.setup = new Setup();
        this.loginPage = new LoginPage(setup.getDriver());
    }

    @Given("User go to login page")
    public void userGoToLoginPage() throws IOException {
        loginPage.goToLoginPage();
    }

    @And("User enter {string} in Email Adress field")
    public void userEnterInEmailAdressField(String emailUser) {
        loginPage.userEnterInEmailAdressField(emailUser);
    }

    @And("User enter {string} in Password field")
    public void userEnterInPasswordField(String pass) {
        loginPage.userEnterInPasswordField(pass);
    }

    @Then("User click on Login Button")
    public void userClickOnLoginButton() {
        loginPage.userClickOnLoginButton();

    }

    @And("Your username or password was incorrect alert is displayed")
    public void yourUsernameOrPasswordWasIncorrectAlertIsDisplayed() {
        Assert.assertTrue(loginPage.yourUsernameOrPasswordWasIncorrectAlertIsDisplayed());
    }

    @And("User click on Forgot Password Link")
    public void userClickOnForgotPasswordLink() {
        loginPage.userClickOnForgotPasswordLink();
    }


    @And("User enter {string} Forgot Password Email")
    public void userEnterForgotPasswordEmail(String forgotPswdEmail) {
        loginPage.userEnterForgotPasswordEmail(forgotPswdEmail);
    }

    @Then("User click on Reset Password Button")
    public void userClickOnResetPasswordButton() {
        loginPage.userClickOnResetPasswordButton();
    }


    @And("User received message password reset instructions sent to your email address")
    public void userReceivedMessagePasswordResetInstructionsSentToYourEmailAddress() {
        final String EXPECTED_TEXT = "Password reset instructions have been sent to your e-mail address. Please contact customer support if you require additional assistance.";
        Assert.assertEquals(loginPage.userIsResetPassword(),EXPECTED_TEXT);
    }


    @And("please enter a valid email alert is displayed")
    public void pleaseEnterAValidEmailAlertIsDisplayed() {
        Assert.assertTrue(loginPage.pleaseEnterAValidEmailAlertIsDisplayed());
    }

    @And("My Account link is displayed")
    public void myAccountLinkIsDisplayed() {
        Assert.assertTrue(loginPage.myAccountLinkIsDisplayed());
    }
}


