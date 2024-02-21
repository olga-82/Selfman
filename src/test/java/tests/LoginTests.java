package tests;

import dto.AgentDTO;
import dto.CustomerDTO;
import dto.FactoryDTO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.Reader;

import java.lang.reflect.Method;

public class LoginTests extends TestBase{

    @AfterMethod(alwaysRun = true)
    public void precondition(Method method){
        if (flag_Need_Logout) {
            getLog().logout();
            flag_Need_Logout = false;
            logger.info("flagNeedLogout = " + flag_Need_Logout);
            logger.info("method info: " + method.getName());
        }


    }

    @Test
    public void login_Positive_Test_Agent() {
         AgentDTO agent = AgentDTO.builder()
                    .email(Reader.getProperty("web.email"))
                    .password(Reader.getProperty("web.password"))
                    .build();
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" loginPositiveAgent start with credentials "
                + agent.getEmail() + " " + agent.getPassword());

        getLog().login_Agent(agent);
        getLog().pause(2000);


    }
    @Test
    public void login_Positive_Test_Factory() {
       FactoryDTO factory = FactoryDTO.builder()
                .email(Reader.getProperty("web.email"))
                .password(Reader.getProperty("web.password"))
                .build();
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" login Positive Factory start with credentials "
                + factory.getEmail() + " " + factory.getPassword());

       getLog().login_Factory(factory);
       getLog().pause(2000);


    }
    @Test
    public void login_Positive_Test_Customer() {
       CustomerDTO customer = CustomerDTO.builder()
                .email(Reader.getProperty("web.email"))
                .password(Reader.getProperty("web.password"))
                .build();
        flag_Need_Logout=true;
        logger.info("flagNeedLogout = " + flag_Need_Logout);
        logger.info(" loginPositiveCustomer start with credentials "
                + customer.getEmail() + " " + customer.getPassword());

        getLog().login_Customer(customer);
        getLog().pause(2000);

    }
}
