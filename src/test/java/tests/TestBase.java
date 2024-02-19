package tests;

import manager.AppManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase {

    Logger logger = LoggerFactory.getLogger(TestBase.class);

     AppManager app = new AppManager();

    @BeforeSuite
    public void setUp() throws IOException {
        app.init ();
        logger.info("Test started");

    }



    @AfterSuite(alwaysRun = true)

    public void stop() {
       // app.tearDown();
        logger.info("Test stopped");





    }

}
