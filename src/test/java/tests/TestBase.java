package tests;

import config.AppManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase extends AppManager {

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    boolean flag_Need_Logout = false;



    @BeforeSuite
    public void setUp() throws IOException {
        init ();
        logger.info("Test started");

    }



    @AfterSuite(alwaysRun = true)

    public void stop() {
        tearDown();
        logger.info("Test stopped");





    }

}
