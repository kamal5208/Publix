package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.MyList;

public class MyListSteps {
    WebDriver driver = Hooks.driver;


    @When("^user click on Shopping List$")
    public void userClickOnShoppingList() {
        new MyList(driver)
                .userClickOnShoppingList();

    }


    @Then("^users is on the My List Page$")
    public void userIsOnTheMyListPage (){
        new MyList(driver)
                .userIsOnTheMyListPage();

    }
}
