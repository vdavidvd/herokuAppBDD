package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HoversPage;

public class Hovers {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    HoversPage hoversPage;
    public static String scenarioName;

    @Given("^User navigate to Hovers page$")
    public void user_navigate_to_hovers_page(){
        homePage = new HomePage(driver);
        hoversPage = homePage.clickOnHoversLink();
    }

    @When("^User hover over image$")
    public void user_hover_over_first_image(){
        hoversPage.hoverOverImage(scenarioName);
    }

    @Then("User name {string} should be displayed")
    public void user_name_something_should_be_displayed(String userName){
        Assert.assertEquals(userName, hoversPage.getUserNameText(scenarioName));
    }
}