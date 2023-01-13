package hooks;

import driverFactory.MyDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import stepDefinitions.DynamicLoadingElements;
import stepDefinitions.Hovers;
import utils.Utilities;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyHooks {

    public static WebDriver driver;
    String scenarioName;


    @Before
    public void setup(Scenario scenario){
        driver = MyDriverFactory.initializeBrowser(Utilities.getPropertyData(
                Utilities.CONFIG_PROPERTY_FILE_PATH,"browser"));
        driver.get(Utilities.getPropertyData(
                Utilities.CONFIG_PROPERTY_FILE_PATH,"url"));
        DynamicLoadingElements.scenarioName = scenario.getName();
        Hovers.scenarioName = scenario.getName();
    }

    @After
    public void tearDown(Scenario scenario){
        scenarioName = scenario.getName().replace("", "-");
        if (scenario.isFailed()){
            byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png",scenarioName);
        }
        driver.quit();
    }

    @AfterAll
    public static void before_or_after_all(){
        try {
            Desktop.getDesktop().browse(
                    new File("target/CucumberReports/CucumberReport.html").toURI()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}