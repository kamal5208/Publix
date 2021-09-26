package page_objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PublixLogo extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(PublixLogo.class);

    public PublixLogo(WebDriver driver) {
        super(driver);
    }

    private static final By PublixLogoImage = By.xpath("//img[@alt='Publix Logo']");


        public PublixLogo userIsOnThePublixLogoPage () {
            boolean publixlogo = driver.findElement(PublixLogoImage).isDisplayed();
            Assert.assertTrue("publix logo is not Displayed", publixlogo);
            LOGGER.info("User is on the Home page");
            return this;

        }
    }