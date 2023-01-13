package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {

    WebDriver driver;

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hot-spot")
    private WebElement hotSpot;

    public void rightClickOnHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
    }

    public boolean isAlertPreset(){
        try {
            Alert alert = getAlert();
            return true;
        }catch (NoAlertPresentException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Alert getAlert(){
        return driver.switchTo().alert();
    }

    public String getTextFromAlert(){
        return getAlert().getText();
    }
}