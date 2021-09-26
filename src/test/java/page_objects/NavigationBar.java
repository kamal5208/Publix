package page_objects;

import command_providers.ActOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
   // private final By MortgageCalculatorLogo = By.xpath("//a/img[@alt ='Logo']");
   // private final By RatesLink = By.linkText("Rates");
    //private final By RealAprLink = By.linkText("Real APR");

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;

    }
    //Mouse hover to the shopOnline
    public NavigationBar userMouseHoverToShopOnline() {
//        ActOn.element(driver,ShopOnlineLink).mouseHover();
//        LOGGER.info("user mouse hover on Shop Online");
        new ShopOnline(driver)
                .userMouseHoverToShopOnline();
        return this;
    }


}
