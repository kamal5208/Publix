package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyList extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(MyList.class);

    public MyList(WebDriver driver) {
        super(driver);
    }

    private static final By ShoppingList = By.xpath("//div[@class='after-search']//span[@class='shopping-list-label'][contains(text(),'Shopping List')]");
    private static final By BakeryText = By.xpath("//h1[@class='headline-medium display-none lg-display-block']//span[@class='truncate'][normalize-space()='My List']");

    public MyList userClickOnShoppingList() {
        ActOn.element(driver, ShoppingList).click();
        LOGGER.info("User clicked on Shopping List");
        return this;

    }
    public MyList userIsOnTheMyListPage (){
        boolean BakeryProduct = driver.findElement(BakeryText).isDisplayed();
        Assert.assertTrue("My List is not displayed",BakeryProduct);
        LOGGER.info("User is on the My List page");
        return this;

    }
}