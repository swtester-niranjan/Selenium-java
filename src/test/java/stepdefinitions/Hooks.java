package stepdefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        takeScreenshot(scenario, "BeforeStep");
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        takeScreenshot(scenario, "AfterStep");
    }

    public void takeScreenshot(Scenario scenario, String stepTiming) {
        if (driver != null) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", stepTiming + " Screenshot");
            } catch (Exception e) {
                // Ignore screenshot errors
            }
        }
    }
}
