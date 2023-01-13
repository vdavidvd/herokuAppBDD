package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DropDownPage;
import pages.HomePage;

public class DropDown {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    DropDownPage dropDownPage;
    private static final String OPTION_FOR_DROP_DOWN= "Option 2";
    private static final String INITIAL_SELECTED_OPTION= "Please select an option";

    @Given("^User navigate to DropDown page$")
    public void user_navigate_to_dropdown_page(){
        homePage = new HomePage(driver);
        dropDownPage = homePage.clickOnDropDown();
    }

    @When("^User select one option from drop down$")
    public void user_select_one_option_from_drop_down(){
        dropDownPage.selectOptionFromDropDown(OPTION_FOR_DROP_DOWN);
    }

    @Then("^That option should be selected$")
    public void that_option_should_be_selected(){
        Assert.assertEquals(OPTION_FOR_DROP_DOWN,dropDownPage.getSelectedOptionFromDropDown());
    }

    @And("^Please select an option is selected initial$")
    public void please_select_an_option_is_selected_initial(){
        Assert.assertEquals(INITIAL_SELECTED_OPTION,dropDownPage.getSelectedOptionFromDropDown());
    }
}