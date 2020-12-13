package locators;

import org.openqa.selenium.By;

public class CartPage {
    public final By cart = By.xpath("//button[contains(@class,'cart')]");
    public final By emptyCart = By.xpath("//a[text()='Empty My Basket']");

    public final By totalItems = By.xpath("//span[@class='badge ng-binding default']");
}
