package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    private WebDriver driver;
    private String url = "https://the-internet.herokuapp.com/";

    // Locators for all example links
    public By abTestLink = By.linkText("A/B Testing");
    public By addRemoveElementsLink = By.linkText("Add/Remove Elements");
    public By basicAuthLink = By.linkText("Basic Auth");
    public By brokenImagesLink = By.linkText("Broken Images");
    public By challengingDomLink = By.linkText("Challenging DOM");
    public By checkboxesLink = By.linkText("Checkboxes");
    public By contextMenuLink = By.linkText("Context Menu");
    public By digestAuthLink = By.linkText("Digest Authentication");
    public By disappearingElementsLink = By.linkText("Disappearing Elements");
    public By dragAndDropLink = By.linkText("Drag and Drop");
    public By dropdownLink = By.linkText("Dropdown");
    public By dynamicContentLink = By.linkText("Dynamic Content");
    public By dynamicControlsLink = By.linkText("Dynamic Controls");
    public By dynamicLoadingLink = By.linkText("Dynamic Loading");
    public By entryAdLink = By.linkText("Entry Ad");
    public By exitIntentLink = By.linkText("Exit Intent");
    public By fileDownloadLink = By.linkText("File Download");
    public By fileUploadLink = By.linkText("File Upload");
    public By floatingMenuLink = By.linkText("Floating Menu");
    public By forgotPasswordLink = By.linkText("Forgot Password");
    public By formAuthenticationLink = By.linkText("Form Authentication");
    public By framesLink = By.linkText("Frames");
    public By geolocationLink = By.linkText("Geolocation");
    public By horizontalSliderLink = By.linkText("Horizontal Slider");
    public By hoversLink = By.linkText("Hovers");
    public By infiniteScrollLink = By.linkText("Infinite Scroll");
    public By inputsLink = By.linkText("Inputs");
    public By jqueryUIMenusLink = By.linkText("JQuery UI Menus");
    public By javascriptAlertsLink = By.linkText("JavaScript Alerts");
    public By javascriptErrorLink = By.linkText("JavaScript onload event error");
    public By keyPressesLink = By.linkText("Key Presses");
    public By largeDomLink = By.linkText("Large & Deep DOM");
    public By multipleWindowsLink = By.linkText("Multiple Windows");
    public By nestedFramesLink = By.linkText("Nested Frames");
    public By notificationMessagesLink = By.linkText("Notification Messages");
    public By redirectLink = By.linkText("Redirect Link");
    public By secureFileDownloadLink = By.linkText("Secure File Download");
    public By shadowDomLink = By.linkText("Shadow DOM");
    public By shiftingContentLink = By.linkText("Shifting Content");
    public By slowResourcesLink = By.linkText("Slow Resources");
    public By sortableDataTablesLink = By.linkText("Sortable Data Tables");
    public By statusCodesLink = By.linkText("Status Codes");
    public By typosLink = By.linkText("Typos");
    public By wysiwygEditorLink = By.linkText("WYSIWYG Editor");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    // Example: click a link by By locator
    public void clickExample(By exampleLink) {
        driver.findElement(exampleLink).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
