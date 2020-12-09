package framework.browser;

public enum BrowserType {
    FIREFOX,
    CHROME;

   public static BrowserType getBrowserType(String browser){
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                return BrowserType.CHROME;
            case "firefox":
                return BrowserType.FIREFOX;
            default:
                return BrowserType.CHROME;
        }
   }
}
