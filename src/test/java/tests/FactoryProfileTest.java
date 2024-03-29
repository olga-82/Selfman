package tests;

import dto.FactoryDTO;
import helper.ObjectDTO;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class FactoryProfileTest extends TestBase implements ObjectDTO {


   @BeforeMethod(alwaysRun = true)
    public void precondition() {
       app.getLog().login_Factory(factory);
    }

    @Test
    public void createProfileFactory_001(){
        app.getProvider().OpenSettingsPage();
        app.getLog().pause(2000);
        app.getProvider().ClickButtonEditProfile();
        app.getLog().pause(2000);
        app.getProvider().editProfileFactory(factory);
        app.getProvider().clickButtonPreview();
        app.getLog().pause(2000);
        app.getProvider().clickButtonSave();
        app.getLog().pause(2000);
       Assert.assertEquals( app.getProvider().GetText("TEXT_PRODUCT"), "Products");
//       app.getProvider().AddProduct(factory);
//       app.getLog().pause(2000);
//       app.getProvider().AddCompany(factory);
//       app.getProvider().clickButtonReturnToFactoryPage();
//       app.getProvider().clickButtonSave();
       flag_Need_Logout=true;
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