package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.InStorePickup;

public class InStorePickupSteps {

    WebDriver driver = Hooks.driver;

    @When("^user click on In-Store Pickup$")
    public void userClickOnInStorePickup() {
        new InStorePickup(driver)
                .userClickOnInStorePickup();
    }

    @When("^user click on Seafood$")
    public void userClickOnSeafood() {
        new InStorePickup(driver)
                .userClickOnSeafood();

    }

    @When("^user click on Live Small Lobster Wild$")
    public void userClickOnLiveSmallLobsterWild() {
        new InStorePickup(driver)
                .userClickOnLiveSmallLobsterWild();

    }

    @And("^click on ADD TO ORDER$")
    public void clickOnAddToOrder() {
        new InStorePickup(driver)
                .clickOnAddToOrder();

    }

    @When("^user click on REVIEW and CHECKOUT$")
    public void userClickOnReviewAndCheckout() {
        new InStorePickup(driver)
                .userClickOnReviewAndCheckout();

    }

    @Then("^user is on the Confirm Your Store$")
    public void userIsOnTheConfirmYourStore() {
        new InStorePickup(driver)
                .userIsOnTheConfirmYourStore();

    }

}
