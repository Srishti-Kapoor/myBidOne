package actions;

import framework.driver.FindElement;
import locators.CartPage;
import locators.SearchPage;

public class CartAction {
    private final FindElement find;
    private final CartPage cartPage;
    private final SearchPage searchPage;

    public CartAction(FindElement find, CartPage cartPage, SearchPage searchPage) {
        this.find = find;
        this.cartPage = cartPage;
        this.searchPage = searchPage;
    }

    public void clickCart(){
        find.element(cartPage.cart).click();
    }
    public boolean isCartAlreadyEmpty(){
        return find.element(cartPage.cart).isDisplayed();
    }


    public void emptyCart(){
        find.element(cartPage.emptyCart).click();
        find.element(searchPage.popUpOk).click();
    }


    public Integer itemCountOnCartIcon() {
        // Application is taking time to update the item count on Cart icon so to reduce the speed of code i am using thread sleep her.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Integer.parseInt((find.element(cartPage.totalItems).getText()));
    }
}
