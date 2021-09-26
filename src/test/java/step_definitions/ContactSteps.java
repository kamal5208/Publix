package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Contact;

public class ContactSteps {
    WebDriver driver = Hooks.driver;


    @When("^user click on contact us$")
    public void userClickOnContactUs() {
           new Contact(driver)
                   .userClickOnContactUs();
    }

    @Then("^user is on the contact information page$")
    public void userIsOnTheContactInformationPage() {
        new Contact(driver)
                .userIsOnTheContactInformationPage();

    }

}
