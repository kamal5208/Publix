package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.OrderSubs;

public class OrderSubsSteps {
    WebDriver driver = Hooks.driver;


    @When("^user click on Order Subs$")
    public void userClickOnOrderSubs(){
        new OrderSubs(driver)
                .userClickOnOrderSubs();
    }


    @Then("^user is on the In Store Pickup Oder Subs$")
    public void ValidateInStorePickupOderSubs() {
        new OrderSubs(driver)
                .ValidateInStorePickupOderSubs();
    }


}
