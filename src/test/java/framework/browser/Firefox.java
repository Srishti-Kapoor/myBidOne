package framework.browser;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox  {


    public WebDriver getFirefoxDriver() {
        FirefoxDriverManager.getInstance(FirefoxDriver.class);
        return new FirefoxDriver();
    }


}
