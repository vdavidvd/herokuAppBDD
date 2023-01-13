package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;

    public DropDownPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    private WebElement selectDropDown;

    public String getSelectedOptionFromDropDown(){
        Select select = new Select(selectDropDown);
        return select.getAllSelectedOptions().get(0).getText();
    }

    public void selectOptionFromDropDown(String visualText){
        Select select = new Select(selectDropDown);
        select.selectByVisibleText(visualText);
    }
}