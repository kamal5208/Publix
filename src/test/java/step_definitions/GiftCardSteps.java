package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.GiftCards;

public class GiftCardSteps {
    WebDriver driver = Hooks.driver;

    @When("^click on Gift Cards$")
    public void clickOnGiftCards() {
        new GiftCards(driver)
                .clickOnGiftCards();
    }

    @Then("^user is on the Gift Card Homepage$")
    public void userIsNavigatedToGiftCardHomepage() {
        new GiftCards(driver)
                .userIsNavigatedToGiftCardHomepage();

    }

}
