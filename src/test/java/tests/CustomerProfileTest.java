package tests;

import helper.ObjectDTO;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CustomerProfileTest extends TestBase implements ObjectDTO {

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        app.getLog().login_Customer(customer);
    }

    @Test
    public void createProfileCustomer_001() {
        app.getProvider().OpenSettingsPage();
        app.getCustomer().pause(5000);
        app.getCustomer().editCustomerProfile(customer);
        flag_Need_Logout = true;
        app.getCustomer().pause(4000);
        Assert.assertEquals(app.getCustomer().GetText("TEXT_COMPANY_NAME_CUSTOMER"), customer.getCompany_name());
        Assert.assertEquals(app.getCustomer().GetText("TEXT_EMAIL_CUSTOMER"), customer.getEmail());
    }


    @AfterMethod(alwaysRun = true)
    public void postcondition(Method method) {
        if (flag_Need_Logout) {
            app.getLog().logout();
            flag_Need_Logout = false;
            logger.info("flagNeedLogout = " + flag_Need_Logout);
            logger.info("method info: " + method.getName());
        }

    }
}
