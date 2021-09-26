package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InStorePickup extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(page_objects.InStorePickup.class);

    public InStorePickup(WebDriver driver) {
        super(driver);
    }
    private static final By InStorePickup = By.xpath("//a[contains(text(),'In-Store Pickup')]");
    private static final By SeaFood = By.xpath("//span[@class='category-name'][contains(text(),'Seafood')]");
    private static final By SmallLobsterWild = By.xpath("//div[contains(text(),'Live Lobster, Small, 1.00 - 1.25 Lbs/Lobster Wild')]");
    private static final By Quantity =By.xpath("//div[@class='wrapper']");
    private static final By AddToOrder = By.xpath("//button[contains(text(),'Add to Order')]");
    private static final By ReviewAndCheckout = By.xpath("//span[contains(text(),'Review and checkout')]");
    private static final By PickupAtThisStore = By.xpath("//span[contains(text(),'Pick up at this store')]");

    public InStorePickup userClickOnInStorePickup() {
        ActOn.element(driver,InStorePickup).click();
        LOGGER.info("user clicked on In Store Pickup");
        return this;
}
    public InStorePickup userClickOnSeafood() {
        ActOn.element(driver, SeaFood).click();
        LOGGER.info("user clicked on SeaFood");
        return this;
    }
    public InStorePickup userClickOnLiveSmallLobsterWild() {
        ActOn.element(driver, SmallLobsterWild).click();
        LOGGER.info("user clicked on Small Lobster Wild");
        return this;
    }
    public InStorePickup clickOnAddToOrder() {
        ActOn.element(driver, AddToOrder).click();
        LOGGER.info("user clicked on ADD TO ORDER");
        return this;
    }
    public InStorePickup userClickOnReviewAndCheckout() {
        ActOn.element(driver, ReviewAndCheckout).click();
        LOGGER.info("user clicked on Review and Checkout");
        return this;
    }
    public InStorePickup userIsOnTheConfirmYourStore() {
        Boolean ConfirmStore = driver.findElement(PickupAtThisStore).isDisplayed();
        Assert.assertTrue("In store pickup is not Displayed",ConfirmStore);
        return this;

    }

}
