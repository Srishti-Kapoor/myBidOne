package locators;

import org.openqa.selenium.By;

public class SearchPage {
    public final By username = By.xpath("//input[@id='UserName']");
    public final By password = By.xpath("//input[@id='Password']");
    public final By logIn = By.xpath("//input[@id='submitBtn']");

    public final By searchItem = By.xpath("//div[@id='keyword-search']//input");

    public final By searchResults = By.xpath("//*[@class='productName']/a");

    public final By addCart = By.xpath("//div[@class='list-buttons add']");

    public final By popUpMessage = By.xpath("//span[contains(text(),'already exists')]");

    public final By popUpOk = By.xpath("//button[text()='OK']");

    public final By tickedOnAddbutton = By.xpath("(//*[@class='icon ng-scope'])[1]");


}
