package framework.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.SortedSet;

public class FindElement {
    private WebDriver driver;
    private By LoadingSpinner = By.xpath("");

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }
    public WebElement element(By locator){

        WebDriverWait wait = new WebDriverWait(driver, 50);

        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return wait.until(d -> d.findElement(locator));


    }


    public List<WebElement> elements(By locator)
    {
        // This below static wait is a temporary fix to handle the spinner on application. to remove this i need some changes in spinner attributes.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, 40);

        return wait.until(driver-> driver.findElements(locator));




    }



}
