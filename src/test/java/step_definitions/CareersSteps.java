package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Careers;

public class CareersSteps {
    WebDriver driver = Hooks.driver;


    @When("^user click on Careers$")
    public void user_click_on_careers() {
        new Careers(driver)
                .userClickOnCareers();

    }

    @And("^user click on INFORMATION TECHNOLOGY$")
    public void userClickOnInformationTechnologyLink() {
        new Careers(driver)
                .serClickOnInformationTechnologyLink();

    }

    @When("^user click on Current Openings$")
    public void userClickOnCurrentOpenings() {
        new Careers(driver)
                .userClickOnCurrentOpenings();

    }

    @When("^user click on information technology$")
    public void userClickOnInformationTechnology() {
        new Careers(driver)
                .userClickOnInformationTechnology();

    }

    @When("^click on SQA test analyst$")
    public void clickOnSqaTestAnalyst() {
        new Careers(driver)
                .clickOnSqaTestAnalyst();

    }

    @Then("^user is on the test analyst career page$")
    public void userIsOnTheTestAnalystCareerPage() {
        new Careers(driver)
                .userIsOnTheTestAnalystCareerPage();

    }


}