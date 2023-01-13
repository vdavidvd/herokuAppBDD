package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HoversPage {

    WebDriver driver;

    public HoversPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='figure']/img")
    private List<WebElement> userPictures;

    @FindBy(xpath = "//div[@class='figcaption']/h5")
    private List<WebElement> userNames;

    public List<WebElement> getUserPictures(){
        return userPictures;
    }

    public List<WebElement> getUserNames(){
        return userNames;
    }

    public String getUserNameText(String scenarioName){
        if (scenarioName.contains("1")){
            return getUserNames().get(0).getText();
        }else if (scenarioName.contains("2")){
            return getUserNames().get(1).getText();
        }else if (scenarioName.contains("3")){
            return getUserNames().get(2).getText();
        }else{
            return "error";
        }
    }

    public void hoverOverImage(String scenarioName){
        Actions actions = new Actions(driver);

        if (scenarioName.contains("1")){
            actions.moveToElement(getUserPictures().get(0)).perform();
        }else if (scenarioName.contains("2")){
            actions.moveToElement(getUserPictures().get(1)).perform();
        }else if (scenarioName.contains("3")){
            actions.moveToElement(getUserPictures().get(2)).perform();
        }
    }
}