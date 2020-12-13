package steps;

import framework.driver.FindElement;
import framework.driver.TestDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestDriver testDriver;
    private final FindElement element;

    public Hooks(TestDriver testDriver, FindElement element) {
        this.testDriver = testDriver;
        this.element = element;
    }

    @Before
    public void setup(){
        testDriver.setDriver();
        element.setDriver(testDriver.getDriver());
        testDriver.getDriver().navigate().to("http://www.bdirectcloud.net/");
        testDriver.getDriver().manage().window().maximize();
    }

   @After
        public void tearDown(){
       testDriver.removeDriver();
   }

}
