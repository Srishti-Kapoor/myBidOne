package steps;

import framework.driver.TestDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {

    private TestDriver driver;

    public OpenGoogle(TestDriver driver) {
        this.driver = driver;
    }

    @Given("I open a google search page")
    public void iOpenAGoogleSearchPage() {
        driver.getDriver().navigate().to("https://google.co.nz");
    }

}
