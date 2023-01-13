package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationSuccessPage {

    WebDriver driver;

    public FormAuthenticationSuccessPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement loginSuccessMessage;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logoutButton;

    public boolean isDisplayedLoginSuccessMessage(){
        return loginSuccessMessage.isDisplayed();
    }

    public boolean isDisplayedLogoutButton(){
        return logoutButton.isDisplayed();
    }
}