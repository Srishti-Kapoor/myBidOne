package framework.browser;

public enum BrowserType {
    FIREFOX,
    CHROME;

   public static BrowserType getBrowserType(String browser){
        browser = browser.toLowerCase();

        switch (browser){
            case "firefox":
                return BrowserType.FIREFOX;
            default:
                return BrowserType.CHROME;
        }
   }
}
