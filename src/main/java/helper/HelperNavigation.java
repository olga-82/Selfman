package helper;

public interface HelperNavigation {

   String BUTTON_ASSISTANT = "//*[@id='root']//div[1]/div[2]/a[1]//div[1]/h4";
    String BUTTON_FACTORY = " //*[@href='/factories']//div[1]/h4";
    String BUTTON_BUSINESS_REQUEST = "//*[@href='/requests']//div[1]/h4";
    String BUTTON_ORDERS = " //*[@href='/orders']//div[1]/h4";
    String BUTTON_AGENTS = "//*[@href='/agents']//div[1]/h4";
    String BUTTON_SETTINGS = "//*[@href='/settings']//div[1]/h4";
    String BUTTON_HELP = "//*[@href='/help']//div[1]/h4";
    String BUTTON_CONTACT_US = " //*[@href='/contact-us']//div[1]/h4";
    String LOGOUT = "//*[@id='root']//div[1]/div[4]/div[2]//h4";

}
