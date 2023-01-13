package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DisappearingElementsPage {

    WebDriver driver;

    public DisappearingElementsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Gallery']")
    private WebElement galleryElement;

    public void refreshCurrentPage(){
        driver.navigate().refresh();
    }

    public boolean isGalleryElementDisplayed(){
        try {
            return galleryElement.isDisplayed();
        }catch (Exception ex){
            return false;
        }
    }
}