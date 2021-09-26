package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSubs extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(OrderSubs.class);

    public OrderSubs
            (WebDriver driver) {
        super(driver);
    }

    private static final By OrderSubs = By.xpath("//nav[@class='site-header-secondary -bar']//a[contains(text(),'Order Subs')]");
    private static final By InStorePickup = By.xpath("//h1[contains(text(),'In-Store Pickup')]");


    public OrderSubs userClickOnOrderSubs() {
        ActOn.element(driver, OrderSubs).click();
        LOGGER.info("user clicked on Order subs");
        return this;
    }

    public OrderSubs ValidateInStorePickupOderSubs() {
        Boolean Search = driver.findElement(InStorePickup).isDisplayed();
        Assert.assertTrue("In Store Pickup is not displayed",Search);
        LOGGER.info("user able to see All In store pickup order subs ");
        return this;

    }


}

