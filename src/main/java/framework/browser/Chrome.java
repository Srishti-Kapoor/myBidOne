package framework.browser;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public WebDriver getChromeDriver() {
        ChromeDriverManager.getInstance(ChromeDriver.class).setup();
        return new ChromeDriver();
    }

}
