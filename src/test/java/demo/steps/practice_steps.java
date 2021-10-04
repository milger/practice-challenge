
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.pages.PracticePage;
import demo.queries.ProductList;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class practice_steps {
    @Steps
    PracticePage practicePage;
    ProductList productList;

    @Given("^I visited to practice page$")
    public void iVisitPracticePage() {
        practicePage.open();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchText) {
        practicePage.searchFor(searchText);
    }

    @Then("^I should see the list$")
    public void iShouldSee(List<String> expectedListOfItems) {
        assertThat(productList.itemsDisplayed(), is(equalTo(expectedListOfItems)));
    }
}
