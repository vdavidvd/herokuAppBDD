package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Utilities;

import java.time.Duration;

public class MyDriverFactory {

    static WebDriver driver;

    public static WebDriver initializeBrowser(String browserName){
        if (browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        return driver;
    }
}