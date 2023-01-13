package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.KeyPressesPage;

public class KeyPresses {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    KeyPressesPage keyPressesPage;

    @Given("^User navigate to KeyPresses page$")
    public void user_navigate_to_keypresses_page(){
        homePage = new HomePage(driver);
        keyPressesPage = homePage.clickOnKeyPressesLink();
    }

    @When("User enters {string} in the input box")
    public void user_enters_tab_in_the_input_box(String inputTextOrInputKey){
        if (inputTextOrInputKey.contains("TAB")){
            keyPressesPage.enterInInputBox(Keys.TAB);
        }else if (inputTextOrInputKey.contains("ALT")){
            keyPressesPage.enterInInputBox(Keys.ALT);
        }else if (inputTextOrInputKey.contains("D")){
            keyPressesPage.enterInInputBox(inputTextOrInputKey);
        }
    }

    @Then("Result should contains {string} keyword")
    public void result_should_contains_tab_keyword(String expectedKeyword){
        Assert.assertTrue(keyPressesPage.isResultContainsExpectedText(expectedKeyword));
    }
}