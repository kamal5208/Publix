package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigitalCoupons extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(page_objects.DigitalCoupons.class);

    public DigitalCoupons (WebDriver driver) {
        super(driver);
    }
    private static final By DigitalCoupons= By.xpath(" //a[contains(text(),'Digital Coupons')]");
    private static final By PrintableCoupons = By.xpath("//a[contains(text(),'Printable Coupons')]");
    private static final By PrintableCouponText =By.xpath("//h1[contains(text(),'Printable Coupons')]");

    public DigitalCoupons userClickOnDigitalCoupons() {
        ActOn.element(driver,DigitalCoupons).click();
        LOGGER.info("User clicked on digitalCoupon");
        return this;
}
    public DigitalCoupons userClickOnPrintableCoupons() {
        ActOn.element(driver, PrintableCoupons).click();
        LOGGER.info("user clicked on printableCoupons");
        return this;
    }
    public DigitalCoupons userIsNavigateToPrintableCouponsPage() {
        boolean printableCouponsPage = driver.findElement(PrintableCouponText).isDisplayed();
        Assert.assertTrue("Printable Coupons is Displayed",printableCouponsPage);
        LOGGER.info("User is on the printable coupons page");
        return this;

    }


}
