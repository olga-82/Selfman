package helper;

import com.google.common.io.Files;
import dto.Availability;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Reader;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static utils.Reader.getProperty;

public class HelperBase {

    static WebDriver driver ;
    Logger logger = LoggerFactory.getLogger(HelperBase.class);
    public HelperBase( WebDriver driver) {
        this.driver = driver;
    }

    public  void  click(By locator) {
        driver.findElement(locator).click();
    }
    public void type(By locator, String text){
        WebElement element=driver.findElement( locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
    public String getTextAttribute(String attribute,By locator) {
        return driver.findElement(locator).getAttribute(attribute);
    }
    public String GetText(String locator) {
        WebElement text = driver.findElement(By.xpath(Reader.getProperty(locator)));
       return text.getText().trim();


    }

    public void clickRightMouse(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(locator);
        actions.contextClick(element).perform();
    }
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }


    public void waitElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public WebElement wait(By locator) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public static void takeScreenshot(String link) {
        File tmp=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenshot=new File(link);
        try {
            Files.copy(tmp,screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void UploadFoto (String locator, String  PathOfFiles){
        WebElement uploadElement=driver.findElement(By.xpath(getProperty(locator)));
        uploadElement.sendKeys(getProperty(PathOfFiles));
    }
    public int countContacts(String locator) {
        return driver.findElements(By.xpath(getProperty(locator))).size();
    }
    public int removeKeywords(String locator,String locatorDelete) {

        int countBefore = countContacts(locator);
        logger.info("Amount of contacts before is " + countBefore);
        click(By.xpath(getProperty(locator)));
        pause(2000);
        click(By.xpath(getProperty(locatorDelete)));
        int countAfter = countContacts(locator);
        logger.info("Amount of contacts after is " + countAfter);
        return countAfter - countBefore;
    }
    public void removeAllKeywords(String locator,String locatorDelete) {
        while (driver.findElements(By.xpath(getProperty(locator))).size() > 0) {
            removeKeywords(locator,locatorDelete);
        }
    }
        public void fillKeywordsField(String keywords, String locator) {
        String[] split = keywords.split(",");
        click(By.xpath(getProperty(locator)));
        for (String keyword : split) {
            driver.findElement(By.xpath(getProperty(locator))).sendKeys(keyword);
            driver.findElement(By.xpath(getProperty(locator))).sendKeys(Keys.ENTER);

        }

    }




    public void selectAvailability(Availability availability, String locatorNow, String locatorNext_Week,String locatorNext_Month) {
        switch (availability) {
            case NOW:
                click(By.xpath(getProperty(locatorNow)));
                break;
            case NEXT_WEEK :
                click(By.xpath(getProperty(locatorNext_Week)));
                break;
            case NEXT_MONTH :
                click(By.xpath(getProperty(locatorNext_Month)));
                break;

        }

    }

}
