package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(page_objects.Contact.class);

    public Contact(WebDriver driver) {
        super(driver);
    }

    private static final By ContactUs = By.xpath("//a[normalize-space()='Contact Us']");
    private static final By ContactCustomerCareText = By.xpath("//h3[normalize-space()='Contact Customer Care']");


    public Contact userClickOnContactUs() {
        ActOn.element(driver, ContactUs).click();
        LOGGER.info("user clicked on Contact Us");
        return this;
    }

    public Contact userIsOnTheContactInformationPage() {
        boolean contactCustomerCare = driver.findElement(ContactCustomerCareText).isDisplayed();
        Assert.assertTrue("Contact Customer Care is Displayed", contactCustomerCare);
        LOGGER.info("User is able to see Contact Customer Care");
        return this;
    }
}
