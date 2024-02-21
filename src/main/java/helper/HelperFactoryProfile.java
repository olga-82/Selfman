package helper;

import org.openqa.selenium.WebDriver;

public class HelperFactoryProfile extends  HelperBase{
    public HelperFactoryProfile(WebDriver driver) {
        super(driver);
    }

    private final String EDIT_PROFILE_BUTTON ="//*[@id='root']//div[2]/div[3]/div[1]/button[1]";
    private final String CHANGE_PASSWORD_BUTTON ="//*[@id='root']//div[2]/div[3]/div[1]/button[2]";
    private final String INPUT_COMPANY_NAME =" //*[@id='root']//div[2]/div[2]/div/input";
    private final String INPUT_COUNTRY =" //*[@id='root']//div[2]/div[3]/div/input";
    private final String INPUT_CITY =" //*[@id='root']//div[2]/div[3]/div[2]/input";
    private final String INPUT_EMAIL =" //*[@id='root']//div[2]/div[3]/div[3]/input";
    private final String INPUT_WEB_SITE =" //*[@id='root']//div[2]/div[3]/div[4]/div[1]/input";
    private final String INPUT_FACEBOOK =" //*[@id='root']//div[2]/div[3]/div[4]/div[2]/input";
    private final String INPUT_INSTAGRAM =" //*[@id='root']//div[2]/div[3]/div[4]/div[3]/input";
    private final String INPUT_LINKEDIN =" //*[@id='root']//div[2]/div[3]/div[4]/div[4]/input";




}
