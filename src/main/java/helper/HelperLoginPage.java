package helper;

import dto.AgentDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HelperLoginPage extends HelperBase {
    public HelperLoginPage(WebDriver driver) {
        super(driver);
    }

    private final String TEXT_FORM_LOGIN = " //*[@id='root']/div/div[2]/div[2]/h3";
    private final String RADIO_BUTTON_ROLE_AGENT = "//html/body/div/div/div[2]/form/div[1]/label[1]";
    private final String RADIO_BUTTON_ROLE_PROVIDER = "//input[@id='provider']";
    private final String RADIO_BUTTON_ROLE_CUSTOMER = "//input[@id='customer']";
    private final String INPUT_EMAIL = "//input[@name = 'email']";
    private final String INPUT_PASSWORD = "//input[@name='password']";
    private final String BUTTON_LOGIN = "//button[@type='submit']";
    private final String LINK_HELP = " //*[@id='root']/div/div[2]/div[3]/a ";
    private final String TEXT = " //*[@id='root']/div/div[2]/div[4]/h5";
    private final String BUTTON_SIGN_UP = " //*[@id='root']/div/div[2]/div[5]/button";
    private final String BUTTON_SETTING = " //*[@id='root']/div[1]/div[1]/div[3]/a[1]/div/div[1]/h4";
    private final String BUTTON_EYE = "//*[@id='root']/div/div[2]/form/div[4]/button";

    private final String LOGOUT = "//*[@id='root']/div[1]/div[1]/div[4]/div[2]/div/h4";


    public void chooseRoleAgent() {
        click(By.xpath(RADIO_BUTTON_ROLE_AGENT));
    }

    public void chooseRoleCustomer() {
        click(By.xpath(RADIO_BUTTON_ROLE_CUSTOMER));
    }

    public void chooseRoleFactory() {
        click(By.xpath(RADIO_BUTTON_ROLE_PROVIDER));
    }


    public void fillLoginForm(AgentDTO agent) {
        type(By.xpath(INPUT_EMAIL), agent.getEmail());
        type(By.xpath(INPUT_PASSWORD), agent.getPassword());
    }

    public void clickButtonLogin() {
        click(By.xpath(BUTTON_LOGIN));
    }

    public void clickButtonEye() {
        click(By.xpath(BUTTON_EYE));

    }

    public void click_Do_You_Need_Help() {
        click(By.xpath(LINK_HELP));
    }

    public void click_Button_Sign_Up() {
        click(By.xpath(BUTTON_SIGN_UP));
    }


    public void logout() {
        click(By.xpath(LOGOUT));


    }

    public void is_Button_Setting_Present() {
        isElementPresent(By.xpath(BUTTON_SETTING));
    }

    public void waitElement() {
        wait(By.xpath(TEXT_FORM_LOGIN));
    }

    public void login_Agent(AgentDTO agent) {
        waitElement();
        chooseRoleAgent();
        fillLoginForm(agent);
        clickButtonEye();
        clickButtonLogin();
        is_Button_Setting_Present();


    }


}
