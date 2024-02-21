package helper;

import dto.AgentDTO;
import dto.CustomerDTO;
import dto.FactoryDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static helper.HelperNavigation.BUTTON_AGENTS;
import static helper.HelperNavigation.LOGOUT;

public class HelperLoginPage extends HelperBase {
    public HelperLoginPage(WebDriver driver) {
        super(driver);
    }

    private final String TEXT_FORM_LOGIN = " //*[@id='root']/div/div[2]/div[2]/h3";
    private final String RADIO_BUTTON_ROLE_AGENT = "//html/body/div/div/div[2]/form/div[1]/label[1]";
    private final String RADIO_BUTTON_ROLE_PROVIDER = "//html/body/div/div/div[2]/form/div[1]/label[2]";
    private final String RADIO_BUTTON_ROLE_CUSTOMER = "//html/body/div/div/div[2]/form/div[1]/label[3]";
    private final String INPUT_EMAIL = "//input[@name = 'email']";
    private final String INPUT_PASSWORD = "//input[@name='password']";
    private final String BUTTON_LOGIN = "//button[@type='submit']";
    private final String LINK_HELP = " //*[@id='root']/div/div[2]/div[3]/a ";
    private final String TEXT = " //*[@id='root']/div/div[2]/div[4]/h5";
    private final String BUTTON_SIGN_UP = " //*[@id='root']/div/div[2]/div[5]/button";
    private final String BUTTON_SETTING = " //*[@id='root']/div[1]/div[1]/div[3]/a[1]/div/div[1]/h4";
    private final String BUTTON_EYE = "//*[@id='root']/div/div[2]/form/div[4]/button";


    public void chooseRoleAgent() {
        click(By.xpath(RADIO_BUTTON_ROLE_AGENT));
    }

    public void chooseRoleCustomer() {
        click(By.xpath(RADIO_BUTTON_ROLE_CUSTOMER));
    }

    public void chooseRoleFactory() {
        click(By.xpath(RADIO_BUTTON_ROLE_PROVIDER));
    }


    public void fillLoginFormAgent(AgentDTO agent) {
        type(By.xpath(INPUT_EMAIL), agent.getEmail());
        type(By.xpath(INPUT_PASSWORD), agent.getPassword());
    }
    public void fillLoginFormProvider(FactoryDTO factory) {
        type(By.xpath(INPUT_EMAIL), factory.getEmail());
        type(By.xpath(INPUT_PASSWORD), factory.getPassword());
    }
    public void fillLoginFormCustomer(CustomerDTO customer) {
        type(By.xpath(INPUT_EMAIL), customer.getEmail());
        type(By.xpath(INPUT_PASSWORD), customer.getPassword());
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
        public void open_Agents_Page() {
           click(By.xpath(BUTTON_AGENTS));
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
        fillLoginFormAgent(agent);
        clickButtonEye();
        clickButtonLogin();
        is_Button_Setting_Present();


    }
    public void login_Factory(FactoryDTO factory) {
        waitElement();
        chooseRoleFactory();
        fillLoginFormProvider(factory);
        clickButtonEye();
        clickButtonLogin();
        is_Button_Setting_Present();
    }
    public void login_Customer(CustomerDTO customer) {
        waitElement();
        chooseRoleCustomer();
        fillLoginFormCustomer(customer);
        clickButtonEye();
        clickButtonLogin();
        is_Button_Setting_Present();
    }



}
