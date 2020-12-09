package steps;

import framework.driver.TestDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Search {

    private TestDriver driver;

    public Search(TestDriver driver) {
        this.driver = driver;
    }

    @When("I search for cucumber")
    public void iSearchForCucumber() {
        driver.getDriver().findElement(By.name("q")).sendKeys("Cucucmber");
    }

}
