package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopOnline extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(page_objects.ShopOnline.class);

    public ShopOnline(WebDriver driver) {
        super(driver);
    }
    private static final By ShopOnlineLink = By.xpath("//div[@id='dropdown-menu-14']//a[contains(@class,'')]//span[contains(text(),'Shop Online')]");
    private static final By PublixGiftCardLink = By.xpath("//a[contains(@role,'menuitem')]//span[contains(text(),'Publix Gift Cards')]");
    private static final By OrderTypeIndividual = By.xpath("//span[contains(text(),'Individual')]");
    private static final By ImprintTypeNoImprint =By.xpath("//span[contains(text(),'No Imprint')]");
    private static final By ContinueOrderButton = By.xpath("//button[contains(text(),'CONTINUE ORDER')]");
    private static final By PublixGiftCardText = By.xpath("//h1[contains(text(),'Publix Gift Cards')]");

    public ShopOnline userMouseHoverToShopOnline() {
        ActOn.element(driver,ShopOnlineLink).mouseHover();
        LOGGER.info("user mouse hover on Shop Online");
        return this;
}
    public ShopOnline userClickOnPublixGiftCards() {
        ActOn.element(driver, PublixGiftCardLink).click();
        LOGGER.info("user clicked on Publix Gift Cards");
        return this;
    }
    public ShopOnline userSelectOrderTypeIsIndividual() {
        ActOn.element(driver, OrderTypeIndividual).click();
        LOGGER.info("user clicked on Individual");
        return this;
    }
    public ShopOnline userSelectImprintRestrictionTypeIsNoImprint() {
        ActOn.element(driver, ImprintTypeNoImprint).click();
        LOGGER.info("user clicked on No Imprint");
        return this;
    }
    public ShopOnline userClickOnContinueOrder() {
        ActOn.element(driver,ContinueOrderButton).click();
        LOGGER.info("user clicked on Continue Order");
        return this;

    }
    public ShopOnline userIsOnThePublixGiftCardPage() {
        boolean publixGiftCard = driver.findElement(PublixGiftCardText).isDisplayed();
        Assert.assertTrue("Card Customization is not Displayed",publixGiftCard);
        LOGGER.info("User is on the Card Customization page");
        return this;
    }

}

