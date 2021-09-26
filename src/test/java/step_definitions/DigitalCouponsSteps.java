package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.DigitalCoupons;

public class DigitalCouponsSteps {
    WebDriver driver = Hooks.driver;


    @When("^user click on Digital Coupons$")
    public void userClickOnDigitalCoupons() {
        new DigitalCoupons(driver)
                .userClickOnDigitalCoupons();

    }

    @When("^user click on Printable Coupons$")
    public void userClickOnPrintableCoupons() {
        new DigitalCoupons(driver)
                .userClickOnPrintableCoupons();

    }

    @Then("^user is on Printable coupons page$")
    public void userIsNavigateToPrintableCouponsPage() {
        new DigitalCoupons(driver)
                .userIsNavigateToPrintableCouponsPage();

    }


    }




