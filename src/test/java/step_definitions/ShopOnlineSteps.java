package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.ShopOnline;

public class ShopOnlineSteps {
    WebDriver driver = Hooks.driver;

    @When("^user mouse hover on Shop Online$")
    public void userMouseHoverToShopOnline() {
        new ShopOnline(driver)
                .userMouseHoverToShopOnline();

    }
    @When("^user click on Publix Gift Cards$")
    public void userClickOnPublixGiftCards() {
        new ShopOnline(driver)
                .userClickOnPublixGiftCards();

    }

    @When("^user click on Individual Order Type$")
    public void userSelectOrderTypeIsIndividual() {
        new ShopOnline(driver)
                .userSelectOrderTypeIsIndividual();

    }

    @And("^user click on No Imprint Restriction Type$")
    public void userSelectImprintRestrictionTypeIsNoImprint() {
        new ShopOnline(driver)
                .userSelectImprintRestrictionTypeIsNoImprint();
    }

    @When("^user click on Continue Order Button$")
    public void userClickOnContinueOrder() {
        new ShopOnline(driver)
                .userClickOnContinueOrder();

    }

    @Then("^user is on the Publix Gift Card page$")
    public void userIsOnThePublixGiftCardPage() {
        new ShopOnline(driver)
                .userIsOnThePublixGiftCardPage();
    }

}
