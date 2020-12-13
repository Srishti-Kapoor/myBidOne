package steps;

import actions.SearchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    private final SearchAction searchAction;

    public SearchSteps(SearchAction searchAction) {
        this.searchAction = searchAction;
    }

    @Given("I login into myBidFood with valid credentials")
    public void iLoginIntoMyBidFoodWithValidCredentials() {
        searchAction.enterUsername();
        searchAction.enterPassword();
        searchAction.clickLogin();


    }

    @When("^I search with (.+) keyword$")
    public void iSearchWithKeyword(String item){


        searchAction.searchItem(item);

    }

    @Then("I ensure the search result is showing coconut items")
    public void iEnsureTheSearchResultIsShowingCoconutItems() {
        Assert.assertEquals(true, searchAction.isSearchResultsMatched("COCONUT MILK"));
    }

    @Then("I click on add button to add item to the cart")
    public void iClickOnAddButtonToAddItemToTheCart() {
        searchAction.addToCart();

        if(searchAction.popUpVisible()==true){
            searchAction.clickPopUpOk();
        }
    }

    @Then("I added same item twice into my cart")
    public void iAddedSameItemTwiceIntoMyCart() {
        searchAction.addToCart();

        if (!searchAction.popUpVisible()) {
            searchAction.addToCart();
        }
        searchAction.clickPopUpOk();
    }

    @Then("I ensure the item is added successfully")
    public void iEnsureTheItemIsAddedSuccessfully() {

        Assert.assertEquals(true, searchAction.isAddTIcked());
    }

    @Then("I ensure the pop up warning message appear")
    public void iEnsureThePopUpWarningMessageAppear() {

        Assert.assertEquals(true, searchAction.popUpVisible());
    }
}
