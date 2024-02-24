package tests;

import dto.FactoryDTO;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class FactoryProfileTest extends TestBase {


    @AfterMethod(alwaysRun = true)
    public void precondition(Method method) {
        if (flag_Need_Logout) {
            app.getLog().logout();
            flag_Need_Logout = false;
            logger.info("flagNeedLogout = " + flag_Need_Logout);
            logger.info("method info: " + method.getName());
        }

    }

    @Test
    public void createProfileFactory_001(){
        app.getLog().login_Factory(provider);
        app.getLog().pause(2000);
        app.getProvider().OpenSettingsPage();
        app.getLog().pause(2000);
        app.getProvider().ClickButtonEditProfile();
        app.getLog().pause(2000);
        app.getProvider().editProfileFactory(factory);
        app.getProvider().clickButtonPreview();
        app.getLog().pause(2000);
        app.getProvider().clickButtonSave();
        app.getLog().pause(2000);
       Assert.assertEquals( app.getProvider().GetText(), "Products");
       app.getProvider().AddProduct(factory);

    }


}