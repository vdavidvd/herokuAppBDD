package stepDefinitions;

import hooks.MyHooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DragAndDropPage;
import pages.HomePage;

public class DragAndDrop {

    WebDriver driver = MyHooks.driver;
    HomePage homePage;
    DragAndDropPage dragAndDropPage;

    @Given("^User navigate to DragAndDrop page$")
    public void user_navigate_to_draganddrop_page(){
        homePage = new HomePage(driver);
        dragAndDropPage = homePage.clickOnDragAndDropLink();
    }

    @When("^User drag box A and drop on box B$")
    public void user_drag_box_a_and_drop_on_box_b(){
        dragAndDropPage.dragAtoB();
    }

    @Then("Heading of box A should be {string}")
    public void heading_of_box_a_should_be_something(String headingBoxA){
        Assert.assertEquals(headingBoxA, dragAndDropPage.getHeaderBoxA());
    }

    @And("Heading of box A is {string}")
    public void heading_of_box_a_is_something(String headingBoxA){
        Assert.assertEquals(headingBoxA, dragAndDropPage.getHeaderBoxA());
    }

    @And("Heading of box B is {string}")
    public void heading_of_box_b_is_something(String headingBoxB){
        Assert.assertEquals(headingBoxB, dragAndDropPage.getHeaderBoxB());
    }

    @And("Heading of box B should be {string}")
    public void heading_of_box_b_should_be_something(String headingBoxB){
        Assert.assertEquals(headingBoxB, dragAndDropPage.getHeaderBoxB());
    }
}