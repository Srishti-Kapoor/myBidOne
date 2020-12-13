package framework.driver;

import framework.browser.BrowserType;
import framework.browser.Chrome;
import framework.browser.Firefox;
import org.openqa.selenium.WebDriver;

public class TestDriver {

    private WebDriver webDriver;

    public void setDriver(){
        BrowserType browserType = BrowserType.CHROME; //This needs to be set from a property file

        switch (browserType){
            case FIREFOX:
                webDriver= new Firefox().getFirefoxDriver();
                break;
            default:
                webDriver = new Chrome().getChromeDriver();
        }
    }

    public WebDriver getDriver(){
        return webDriver;
    }

    public void removeDriver(){
        webDriver.close();
        webDriver.quit();
    }
}
