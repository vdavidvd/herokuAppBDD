package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ContextMenuPage;
import pages.HomePage;
import utils.Utilities;

public class ContextMenu {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    ContextMenuPage contextMenuPage;

    @Given("^User navigate to ContextMenu Page$")
    public void user_navigate_to_contextmenu_page(){
        homePage = new HomePage(driver);
        contextMenuPage = homePage.clickOnContextMenuLink();
    }

    @When("^User right clicks on the box$")
    public void user_right_clicks_on_the_box(){
        contextMenuPage.rightClickOnHotSpot();
    }

    @Then("^JavaScript alert should be displayed$")
    public void javascript_alert_should_be_displayed(){
        Assert.assertTrue(contextMenuPage.isAlertPreset());
    }

    @And("^Text from alert should be displayed says that user selected context menu$")
    public void text_from_alert_should_be_displayed_says_that_user_selected_context_menu(){
        Assert.assertEquals(Utilities.getPropertyData(Utilities.EXPECTED_VALUES_PROPERTY_FILE_PATH,
                        "contextMenuExpected"),
                contextMenuPage.getTextFromAlert());
    }
}