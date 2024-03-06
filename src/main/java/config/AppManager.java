package config;

import helper.HelperAgentProfile;
import helper.HelperCustomerProfile;
import helper.HelperFactoryProfile;
import helper.HelperLoginPage;
import org.openqa.selenium.Dimension;
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
import utils.Reader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public  class AppManager {

    WebDriver driver;
    String browser;
    Logger logger= LoggerFactory.getLogger(AppManager.class);
    WebDriverListener listener;
    HelperLoginPage loginPage;
    HelperFactoryProfile provider;
    HelperAgentProfile agent;
    HelperCustomerProfile customer;
    public AppManager() {
        browser = System.getProperty("browser");
        if (browser == null) {
            browser = Browser.CHROME.browserName();
        }
        logger.info(browser);
    }
    public HelperLoginPage getLog() {
        return loginPage;
    }

    public HelperFactoryProfile getProvider() {
        return provider;
    }
    public HelperAgentProfile getAgent() {return agent;}

    public  HelperCustomerProfile getCustomer(){
        return  customer;
    }


    @BeforeSuite(alwaysRun = true)
    public void init() {

        if (browser.equals(Browser.CHROME.browserName())) {
            ChromeOptions options = new ChromeOptions();
            WebDriver original = new ChromeDriver(options);
            listener = new WDListener();
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        } else if (browser.equals(Browser.FIREFOX.browserName())) {
            FirefoxOptions options = new FirefoxOptions();
            WebDriver original = new FirefoxDriver(options);
            listener = new WDListener();
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        }
        else if (browser.equals(Browser.SAFARI.browserName())) {
            SafariOptions options = new SafariOptions();
            WebDriver original = new SafariDriver(options);
            listener = new WDListener();
            driver = new EventFiringDecorator(listener).decorate(original); // Pass the listener instance
            logger.info("Browser start "+ browser);
        }


        driver.navigate().to(Reader.getProperty("web.baseUrl"));
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage=new HelperLoginPage(driver);
        provider =new HelperFactoryProfile(driver);
        agent =new HelperAgentProfile(driver);
        customer=new HelperCustomerProfile(driver);
    }



    @AfterSuite(alwaysRun = true)

    public void tearDown() {
        driver.quit();

    }




}
