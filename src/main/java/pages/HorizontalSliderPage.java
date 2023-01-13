package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

    WebDriver driver;

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='range']")
    private WebElement slider;

    @FindBy(xpath = "//span[@id='range']")
    private WebElement sliderValue;

    public void moveSlider(double expectedSliderValue){
        for (int i = 0; i < expectedSliderValue*2; i++){
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public double getSliderValue(){
        return Double.parseDouble(sliderValue.getText());
    }
}