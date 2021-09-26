package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PublixLogoSteps {
    WebDriver driver = Hooks.driver;


    @Then("user is on the publix logo")
    public void userIsOnThePublixLogoPage() {
        new page_objects.PublixLogo(driver)
                .userIsOnThePublixLogoPage();

    }


}



