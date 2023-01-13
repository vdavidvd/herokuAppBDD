package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {

    WebDriver driver;

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "target")
    private WebElement inputBox;

    @FindBy(id = "result")
    private WebElement resultFromInputBox;

    public void enterInInputBox(Object text){
        inputBox.sendKeys((CharSequence) text);
    }

    public boolean isResultContainsExpectedText(String expectedText){
        return resultFromInputBox.getText().contains(expectedText);
    }
}