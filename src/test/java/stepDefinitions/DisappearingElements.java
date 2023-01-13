//package stepDefinitions;
//
//import hooks.MyHooks;
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import pages.DisappearingElementsPage;
//import pages.HomePage;
//
//public class DisappearingElements {
//
//    WebDriver driver = MyHooks.driver;
//    HomePage homePage;
//    DisappearingElementsPage disappearingElementsPage;
//
//    @Given("^User navigate to DisappearingElements page$")
//    public void user_navigate_to_disappearingelements_page(){
//        homePage = new HomePage(driver);
//        disappearingElementsPage = homePage.clickOnDisappearingElementsLink();
//    }
//
//    @When("^User refresh current page$")
//    public void user_refresh_current_page(){
//        disappearingElementsPage.refreshCurrentPage();
//    }
//
//    @Then("^Gallery element should be displayed on the page$")
//    public void gallery_element_should_be_displayed_on_the_page() throws InterruptedException {
//        Thread.sleep(5000);
//        //Assert.assertTrue(disappearingElementsPage.isGalleryElementDisplayed());
//    }
//
//    @And("^Gallery element is not displayed on the page initial$")
//    public void gallery_element_is_not_displayed_on_the_page_initial(){
//        Assert.assertFalse(disappearingElementsPage.isGalleryElementDisplayed());
//    }
//}