package page_objects;

import command_providers.ActOn;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class Login extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Login.class);

    public Login(WebDriver driver) {
        super(driver);
    }

    private static final By EmailAddress = By.id("signInName");
    private static final By Password = By.id("password");
    private static final By LoginButton = By.xpath("//nav[@aria-label='header']//span[contains(text(),'Log In')]");
    private static final By Login = By.id("next");
    private static final By PublixLogo = By.xpath("//img[@alt='Publix Logo']");

    public Login navigateToLoginPage() {
        ActOn.browser(driver).openBrowser("https://www.publix.com");
        LOGGER.info("User is in the login page");
        return this;
    }


    public Login clickOnLogInButton() {
        ActOn.element(driver, LoginButton).click();
        LOGGER.info("user clicked on LOGIN button");
        return this;
    }


    public Login enterUserCredentials(String emailAddress, String password) {
        ActOn.element(driver, EmailAddress).setValue(emailAddress);
        ActOn.element(driver, Password).setValue(password);
        LOGGER.info("User has entered credentials");
        return this;
    }


    public Login clickedOnLogin() {
        ActOn.element(driver, Login).click();
        LOGGER.info("User clicked on login button");
        return this;
    }

    public Login userClickOnLoginButtonUponEnteringCredentials(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            ActOn.element(driver, EmailAddress).setValue(cells.get("emailAddress"));
            ActOn.element(driver, Password).setValue(cells.get("password"));
            LOGGER.info("user has entered valid credentials");

            ActOn.element(driver, Login).click();
            LOGGER.info("user clicked on login button");
        }
        return this;
    }


    public Login validateUserIsLoggedInSuccessfully () {
            boolean PublixLogoText = driver.findElement(PublixLogo).isDisplayed();
            Assert.assertTrue("Publix Logo is not displayed", PublixLogoText);
            LOGGER.info("User is in the Home page");
            return this;

        }

    }


