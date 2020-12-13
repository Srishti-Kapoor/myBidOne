package actions;

import framework.driver.FindElement;
import locators.SearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchAction {
    private final SearchPage searchPage;
    private final FindElement find;

    public SearchAction(SearchPage searchPage, FindElement find) {
        this.searchPage = searchPage;
        this.find = find;
    }

    public void enterUsername(){
        find.element(searchPage.username).sendKeys("BID198450");
    }

    public void enterPassword(){
        find.element(searchPage.password).sendKeys("Lgm3t4");
    }

    public void clickLogin(){
        find.element(searchPage.logIn).click();
    }


    public void searchItem(String item){
        find.element(searchPage.searchItem).sendKeys(item, Keys.ENTER);
    }

    public boolean isSearchResultsMatched(String SearchText)  {

        List<WebElement> elements =  find.elements(searchPage.searchResults);

        for(int i= 0; i<elements.size(); i++){
            if( elements.get(i).getText().equals(SearchText))
            {
                return true;
            }
        }
        return false;
    }

    public void addToCart() {
        if ( find.element(searchPage.addCart).isDisplayed()) {
            List<WebElement> addCartButton = find.elements(searchPage.addCart);
            addCartButton.get(0).click();
        }
    }

    public void addSecondItem(){
        List<WebElement> addCartButton = find.elements(searchPage.addCart);
        addCartButton.get(1).click();
    }

    public boolean popUpVisible(){
        if( find.elements(searchPage.popUpMessage).size()==0)
        {
            return false;
        }
        else{  return true; }

    }
    public void clickPopUpOk(){
        find.element(searchPage.popUpOk).click();
    }

    public boolean isAddTicked(){
        return find.element(searchPage.tickedOnAddbutton).isDisplayed();
    }
}
