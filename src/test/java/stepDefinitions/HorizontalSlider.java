package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HorizontalSliderPage;

public class HorizontalSlider {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    HorizontalSliderPage horizontalSliderPage;
    private static final double SLIDER_VALUE = 4.5;

    @Given("^User navigate to HorizontalSlider page$")
    public void user_navigate_to_horizontalslider_page(){
        homePage = new HomePage(driver);
        horizontalSliderPage = homePage.clickOnHorizontalSliderLink();
    }

    @When("^User move slider 9 times$")
    public void user_move_slider_6_times() throws InterruptedException {
        horizontalSliderPage.moveSlider(SLIDER_VALUE);
    }

    @Then("^Slider value should be 4.5$")
    public void slider_value_should_be_3(){
        Assert.assertEquals(SLIDER_VALUE,horizontalSliderPage.getSliderValue(),0);
    }
}