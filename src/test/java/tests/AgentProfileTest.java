package tests;

import helper.ObjectDTO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AgentProfileTest extends TestBase implements ObjectDTO {
    @BeforeMethod(alwaysRun = true)
    public void precondition(Method method) {
        app.getLog().login_Agent(agent);
    }
    @Test
    public void createAgentProfileTest_001()  {
        app.getProvider().OpenSettingsPage();
        app.getLog().pause(2000);
        app.getAgent().editFeeHourBlockAgent(agent);
        app.getLog().pause(2000);
        app.getAgent().editSocialBlockAgent(agent);
        app.getLog().pause(2000);
        app.getAgent().editAboutBlockAgent(agent);
        app.getLog().pause(2000);
        app.getAgent().editInfoBlockAgent(agent);
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
