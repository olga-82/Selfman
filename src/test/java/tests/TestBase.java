package tests;

import config.AppManager;
import config.TestNgListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.IOException;
@Listeners(TestNgListener.class)
public class TestBase {
    protected static AppManager app;
    protected Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected boolean flag_Need_Logout = false;

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws IOException {
        app = new AppManager(); // Initialize AppManager here
        app.init();
        logger.info("Test started");
    }

    @AfterSuite(alwaysRun = true)
    public void stop() {
        app.tearDown();
        logger.info("Test stopped");
    }
}
