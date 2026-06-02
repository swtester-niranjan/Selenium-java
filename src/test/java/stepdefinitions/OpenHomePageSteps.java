package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.HomePage;

public class OpenHomePageSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("the user launches the Chrome browser")
    public void the_user_launches_the_chrome_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        String path = System.getProperty("user.dir") + "/src/test/resorces/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver(options);
        Hooks.driver = driver;
        homePage = new HomePage(driver);
    }

    @When("the user navigates to the-internet homepage")
    public void the_user_navigates_to_the_internet_homepage() {
        homePage.open();
    }

    @Then("the homepage should be displayed")
    public void the_homepage_should_be_displayed() {
        String expected = "The Internet";
        String actual = homePage.getTitle();
        Assert.assertEquals(actual, expected);
        driver.quit();
        Hooks.driver = null;
    }
}
