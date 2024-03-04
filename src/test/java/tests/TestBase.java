package tests;

import config.AppManager;
import dto.Availability;
import dto.FactoryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Reader;

import java.io.IOException;

public class TestBase {
    AppManager app = new AppManager();

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    boolean flag_Need_Logout = false;


    @BeforeSuite
    public void setUp() throws IOException {
        app.init();
        logger.info("Test started");

    }


    @AfterSuite(alwaysRun = true)

    public void stop() {
       // app.tearDown();
        logger.info("Test stopped");


    }

}
