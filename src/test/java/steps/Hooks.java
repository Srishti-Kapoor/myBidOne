package steps;

import framework.driver.TestDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestDriver testDriver;

    public Hooks(TestDriver testDriver) {
        this.testDriver = testDriver;
    }

    @Before
    public void setup(){
        testDriver.setDriver();
    }

    @After
    public void tearDown(){
        testDriver.removeDriver();
    }

}
