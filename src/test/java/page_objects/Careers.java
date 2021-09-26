package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Careers extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(page_objects.Careers.class);

    public Careers(WebDriver driver) {
        super(driver);
    }

    private static final By Careers = By.xpath("//div[contains(@class,'footer-nav-desktop display-none lg-display-block')]//ul[contains(@class,'multi-layer-menu')]//li[contains(@class,'-parent')]//div//span[contains(text(),'Careers')]");
    private static final By InformationTechnology = By.xpath("//h4[contains(text(),'Information Technology')]");
    private static final By currentOpenings = By.xpath("//a[contains(text(),'Current Openings')]");
    private static final By InformationTech = By.xpath("//a[contains(text(),'Information Technology')]");
    private static final By SqaTestAnalyst = By.xpath("//a[contains(text(),'SQA Test Analyst')]");
    private static final By SqaTestAnalystPage = By.xpath("//h1[contains(text(),'SQA Test Analyst')]");

    public Careers userClickOnCareers() {
        ActOn.element(driver, Careers).click();
        LOGGER.info("user clicked on Careers");
        return this;
    }

    public Careers serClickOnInformationTechnologyLink() {
        ActOn.element(driver, InformationTechnology).click();
        LOGGER.info("user clicked on Information technology");
        return this;
    }

    public Careers userClickOnCurrentOpenings() {
        ActOn.element(driver, currentOpenings).click();
        LOGGER.info("user clicked on Current Openings");
        return this;

    }

    public Careers userClickOnInformationTechnology() {
        ActOn.element(driver, InformationTech).click();
        LOGGER.info("user clicked on Information technology");
        return this;
    }

    public Careers clickOnSqaTestAnalyst() {
        ActOn.element(driver, SqaTestAnalyst).click();
        LOGGER.info("user clicked on SQA Analyst");
        return this;
    }

    public Careers userIsOnTheTestAnalystCareerPage() {
        Boolean SqaAnalyst = driver.findElement(SqaTestAnalystPage).isDisplayed();
        Assert.assertTrue("Sqa analyst career page is not displayed", SqaAnalyst);
        LOGGER.info("user is not on the SQA Analyst career page");
        return this;
    }
}