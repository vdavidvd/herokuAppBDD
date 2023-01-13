package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Context Menu")
    private WebElement contentMenuLink;

    @FindBy(linkText = "Disappearing Elements")
    private WebElement disappearingElementsLink;

    @FindBy(linkText = "Drag and Drop")
    private WebElement dragAndDropLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropDownLink;

    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoadingLink;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    @FindBy(linkText = "Horizontal Slider")
    private WebElement horizontalSliderLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversLink;

    @FindBy(linkText = "Key Presses")
    private WebElement keyPressesLink;

    public ContextMenuPage clickOnContextMenuLink(){
        contentMenuLink.click();
        return new ContextMenuPage(driver);
    }

    public DisappearingElementsPage clickOnDisappearingElementsLink(){
        disappearingElementsLink.click();
        return new DisappearingElementsPage(driver);
    }

    public DragAndDropPage clickOnDragAndDropLink(){
        dragAndDropLink.click();
        return new DragAndDropPage(driver);
    }

    public DropDownPage clickOnDropDown(){
        dropDownLink.click();
        return new DropDownPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        dynamicLoadingLink.click();
        return new DynamicLoadingPage(driver);
    }

    public FormAuthenticationPage clickOnFormAuthenticationLink(){
        formAuthenticationLink.click();
        return new FormAuthenticationPage(driver);
    }

    public HorizontalSliderPage clickOnHorizontalSliderLink(){
        horizontalSliderLink.click();
        return new HorizontalSliderPage(driver);
    }

    public HoversPage clickOnHoversLink(){
        hoversLink.click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickOnKeyPressesLink(){
        keyPressesLink.click();
        return new KeyPressesPage(driver);
    }
}