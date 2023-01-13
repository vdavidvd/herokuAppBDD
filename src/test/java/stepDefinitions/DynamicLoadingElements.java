package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DynamicLoadingElementOnePage;
import pages.DynamicLoadingElementTwoPage;
import pages.DynamicLoadingPage;
import pages.HomePage;

public class DynamicLoadingElements {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    DynamicLoadingPage dynamicLoadingPage;
    DynamicLoadingElementOnePage dynamicLoadingElementOnePage;
    DynamicLoadingElementTwoPage dynamicLoadingElementTwoPage;
    public static String scenarioName;

    @Given("^User navigate to Dynamic Loading page$")
    public void user_navigate_to_dynamic_loading_page(){
        homePage = new HomePage(driver);
        dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
    }

    @When("^User clicks on the start button$")
    public void user_clicks_on_the_start_button(){
        System.out.println("Name of the scenario "+scenarioName);
        if (scenarioName.contains("first")){
            dynamicLoadingElementOnePage.clickOnStartButton();
        }else if (scenarioName.contains("second")){
            dynamicLoadingElementTwoPage.clickOnStartButton();
        }
    }

    @Then("^Hello World text should be displayed$")
    public void hello_world_text_should_be_displayed(){
        if (scenarioName.contains("first")){
            Assert.assertTrue(dynamicLoadingElementOnePage.isDisplayedHelloWorldText());
        }else if (scenarioName.contains("second")){
            Assert.assertTrue(dynamicLoadingElementTwoPage.isDisplayedHelloWorldText());
        }
    }

    @And("^User navigate to Dynamic Loading Element One page$")
    public void user_navigate_to_dynamic_loading_element_one_page(){
        dynamicLoadingElementOnePage = dynamicLoadingPage.clickOnLink1();
    }

    @And("^User waits for the element$")
    public void user_waits_for_the_element(){
        if (scenarioName.contains("first")){
            dynamicLoadingElementOnePage.waitForHelloWorldElement();
        }else if (scenarioName.contains("second")){
            dynamicLoadingElementTwoPage.waitForHelloWorldElement();
        }
    }

    @And("^User navigate to Dynamic Loading Element Two page$")
    public void user_navigate_to_dynamic_loading_element_two_page(){
        dynamicLoadingElementTwoPage = dynamicLoadingPage.clickOnLink2();
    }
}