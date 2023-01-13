package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Example 1: Element on page that is hidden")
    private WebElement loadingLink1;

    @FindBy(linkText = "Example 2: Element rendered after the fact")
    private WebElement loadingLink2;

    public DynamicLoadingElementOnePage clickOnLink1(){
        loadingLink1.click();
        return new DynamicLoadingElementOnePage(driver);
    }

    public DynamicLoadingElementTwoPage clickOnLink2(){
        loadingLink2.click();
        return new DynamicLoadingElementTwoPage(driver);
    }
}