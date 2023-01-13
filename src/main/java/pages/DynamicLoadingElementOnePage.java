package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingElementOnePage {

    WebDriver driver;

    public DynamicLoadingElementOnePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='start']/button")
    private WebElement startButton;

    @FindBy(xpath = "//div[@id='finish']/h4")
    private WebElement helloWorld;

    public void clickOnStartButton(){
        startButton.click();
    }
    
    public WebElement waitForHelloWorldElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(helloWorld));
    }

    public boolean isDisplayedHelloWorldText(){
        return waitForHelloWorldElement().isDisplayed();
    }
}