package steps;

import Modals.CartDetails;
import actions.CartAction;
import actions.SearchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class CartSteps {
    private final CartAction cartAction;
    private final SearchAction searchAction;
    private final CartDetails cartDetails;


    public CartSteps(CartAction cartAction, SearchAction searchAction, CartDetails cartDetails) {
        this.cartAction = cartAction;
        this.searchAction = searchAction;
        this.cartDetails = cartDetails;
    }

    @Then("I empty the bucket")
    public void iEmptyTheBucket() {
       if(!(cartAction.itemCountOnCartIcon()== 0)){
           cartAction.clickCart();
           cartAction.emptyCart();
       }

    }

    @And("I add second item")
    public void iAddSecondItem() {
        searchAction.addSecondItem();
    }

    @Then("I validate the number of items added match in the cart after adding items")
    public void iValidateTheNumberOfItemsAddedMatchInTheCartAfterAddingItems() {
        cartAction.itemCountOnCartIcon();
    }

    @And("I capture the cart's icon count before adding any item")
    public void iCaptureTheCartSIconCountBeforeAddingAnyItem() throws InterruptedException {

        cartDetails.setCountOnCart(cartAction.itemCountOnCartIcon()+1);
        System.out.println(cartDetails.getCountOnCart());

    }

    @Then("I assert the number on cart should be increased based on how many items ae added.")
    public void iAssertTheNumberOnCartShouldBeIncreasedBasedOnHowManyItemsAeAdded() {

        Assert.assertEquals((cartDetails.getCountOnCart()),cartAction.itemCountOnCartIcon());

    }


    @Then("I Ensure the bucket is empty")
    public void iEnsureTheBucketIsEmpty() {

        Assert.assertEquals(true, cartAction.isCartAlreadyEmpty());
    }


}
