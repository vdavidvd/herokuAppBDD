package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.FormAuthenticationPage;
import pages.FormAuthenticationSuccessPage;
import pages.HomePage;
import utils.Utilities;

public class FormAuthentication {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    FormAuthenticationPage formAuthenticationPage;
    FormAuthenticationSuccessPage formAuthenticationSuccessPage;

    @Given("^User navigate to Login page$")
    public void user_navigate_to_login_page(){
        homePage = new HomePage(driver);
        formAuthenticationPage = homePage.clickOnFormAuthenticationLink();
    }

    @When("User enters valid username as {string}")
    public void user_enters_valid_username_as_something(String validUsername){
        formAuthenticationPage.enterUsername(validUsername);
    }

    @When("User enters invalid username as {string}")
    public void user_enters_invalid_username_as_something(String invalidUsername){
        formAuthenticationPage.enterUsername(invalidUsername);
    }

    @When("^User don't enters any credentials$")
    public void user_dont_enters_any_credentials(){
        formAuthenticationPage.enterUsername("");
        formAuthenticationPage.enterPassword("");
    }

    @Then("^User should be logged in$")
    public void user_should_be_logged_in(){
        Assert.assertTrue(formAuthenticationSuccessPage.isDisplayedLogoutButton());
    }

    @Then("^Warning message about wrong password should be displayed$")
    public void warning_message_about_wrong_password_should_be_displayed(){
        Assert.assertTrue(formAuthenticationPage.getLoginWarningMessage().contains(
                Utilities.getPropertyData(Utilities.EXPECTED_VALUES_PROPERTY_FILE_PATH,
                        "passwordWarningMessage")
                ));
    }

    @Then("^Warning message about wrong username should be displayed$")
    public void warning_message_about_wrong_username_should_be_displayed(){
        Assert.assertTrue(formAuthenticationPage.getLoginWarningMessage().contains(
                        Utilities.getPropertyData(Utilities.EXPECTED_VALUES_PROPERTY_FILE_PATH,
                                "usernameWarningMessage")
                ));
    }

    @And("User enters valid password as {string}")
    public void user_enters_valid_password_as_something(String validPassword){
        formAuthenticationPage.enterPassword(validPassword);
    }

    @And("User enters invalid password as {string}")
    public void user_enters_invalid_password_as_something(String invalidPassword){
        formAuthenticationPage.enterPassword(invalidPassword);
    }

    @And("^User clicks on the login button$")
    public void user_clicks_on_the_login_button(){
        formAuthenticationSuccessPage = formAuthenticationPage.clickOnLoginButton();
    }

    @And("^Success login message should be displayed$")
    public void success_login_message_should_be_displayed(){
        Assert.assertTrue(formAuthenticationSuccessPage.isDisplayedLoginSuccessMessage());
    }
}