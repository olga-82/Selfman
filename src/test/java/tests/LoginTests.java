package tests;

import config.AppManager;
import dto.AgentDTO;
import dto.CustomerDTO;
import dto.FactoryDTO;
import helper.ObjectDTO;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.Reader;

import java.lang.reflect.Method;

import static utils.Reader.getProperty;

public class LoginTests extends TestBase implements ObjectDTO {

    @AfterMethod(alwaysRun = true)
    public void precondition(Method method){
        if (flag_Need_Logout) {
           app.getLog().logout();
            flag_Need_Logout = false;
            logger.info("flagNeedLogout = " + flag_Need_Logout);
            logger.info("method info: " + method.getName());
        }


    }

    @Test(alwaysRun = true)
    public void login_Positive_Test_Agent() {
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" loginPositiveAgent start with credentials "
                + agent.getEmail() + " " + agent.getPassword());

        app.getLog().login_Agent(agent);
        app.getLog().pause(2000);
        Assert.assertEquals(app.getAgent().GetText("TEXT_NAME_LAST_NAME_AGENT"),agent.getFirst_name()+" "+agent.getLast_name());
        Assert.assertEquals(app.getAgent().GetText("TEXT_COMPANY_NAME_AGENT"),agent.getCompany_name());

    }
    @Test(alwaysRun = true)
    public void login_Positive_Test_Factory() {
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" login Positive Factory start with credentials "
                + factory.getEmail() + " " + factory.getPassword());
       app.getLog().login_Factory(factory);
       app.getLog().pause(2000);
        Assert.assertEquals(app.getProvider().GetText("TEXT_COMPANY_NAME"),factory.getCompany_name());



    }
    @Test(alwaysRun = true)
    public void login_Positive_Test_Customer() {
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" loginPositiveCustomer start with credentials "
                + customer.getEmail() + " " + customer.getPassword());

        app.getLog().login_Customer(customer);
        app.getLog().pause(2000);
        Assert.assertEquals(app.getProvider().GetText("TEXT_COMPANY_NAME_CUSTOMER"),customer.getCompany_name());

    }
}
