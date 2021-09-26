package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCards extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(page_objects.GiftCards.class);

    public GiftCards(WebDriver driver) {
        super(driver);
    }

    private static final By GiftCard = By.linkText("Gift Cards");
    private static final By PublixGiftCards = By.xpath("//h1[contains(text(),'Publix Gift Cards')]");

    public GiftCards clickOnGiftCards() {
        ActOn.element(driver, GiftCard).click();
        LOGGER.info("user clicked on Gift Card");
        return this;
    }

    public GiftCards userIsNavigatedToGiftCardHomepage() {
        boolean publixGiftCardDisplayed = driver.findElement(PublixGiftCards).isDisplayed();
        Assert.assertTrue("Publix Gift Card is not displayed", publixGiftCardDisplayed);
        LOGGER.info("User is on the Gift Card page ");
        return this;
    }
}