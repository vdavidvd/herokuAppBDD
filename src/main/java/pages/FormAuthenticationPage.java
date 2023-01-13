package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage {

    WebDriver driver;

    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@id='content']//button[contains(.,'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement loginWarningMessage;

    public void enterUsername(String uname){
        usernameField.sendKeys(uname);
    }

    public void enterPassword(String pass){
        passwordField.sendKeys(pass);
    }

    public FormAuthenticationSuccessPage clickOnLoginButton(){
        loginButton.click();
        return new FormAuthenticationSuccessPage(driver);
    }

    public String getLoginWarningMessage(){
        return loginWarningMessage.getText();
    }
}