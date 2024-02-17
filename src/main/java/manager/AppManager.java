package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public abstract class AppManager {

    WebDriver driver;
    String browser;
    Logger logger= LoggerFactory.getLogger(AppManager.class);
    WebDriverListener listener;
    String BASE_URL="https://shetko.online";
    public AppManager() {
        browser = System.getProperty("browser", Browser.CHROME.browserName());
        logger.info(browser);
    }

    @BeforeSuite(alwaysRun = true)
    public void init() {

        if (browser.equals(Browser.CHROME.browserName())) {
            ChromeOptions options = new ChromeOptions();
            WebDriver original = new ChromeDriver(options);
            listener = new WDListener(); // Initialize the listener instance
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        } else if (browser.equals(Browser.FIREFOX.browserName())) {
            FirefoxOptions options = new FirefoxOptions();
            WebDriver original = new FirefoxDriver(options);
            listener = new WDListener(); // Initialize the listener instance
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        }
        else if (browser.equals(Browser.SAFARI.browserName())) {
            SafariOptions options = new SafariOptions();
            WebDriver original = new SafariDriver(options);
            listener = new WDListener(); // Initialize the listener instance
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        }

      //  driver.navigate().to(Reader.getProperty("web.baseUrl"));
        driver.navigate().to(BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }



    @AfterSuite(alwaysRun = true)

    public void tearDown() {
        driver.quit();

    }




}