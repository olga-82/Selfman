package tests;

import dto.AgentDTO;
import org.testng.annotations.Test;
import utils.Reader;

public class LoginTests extends TestBase{

    @Test

    public void login_Positive_Test_01() {
         AgentDTO agent = AgentDTO.builder()
                    .email(Reader.getProperty("web.email"))
                    .password(Reader.getProperty("web.password"))
                    .build();

        app.getLog().login_Agent(agent);
        app.getLog().logout();

    }
}
