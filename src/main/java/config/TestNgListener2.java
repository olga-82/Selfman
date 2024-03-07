package config;

import helper.HelperBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestNgListener2  implements ITestListener {
    Logger logger = LoggerFactory.getLogger(TestNgListener2.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("START TEST: " + result.getName());
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        logger.info("TEST "+ result.getName() +" FAILED " +result.getThrowable().fillInStackTrace());
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String fileName = "src/test/screenshots/screenshot-" + timestamp + ".png";
        logger.info("Create screenshot: " + fileName);
        HelperBase.takeScreenshot(fileName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("TEST SUCCESFULY: " + result.getName());
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("TEST SKIPPED: " + result.getName());
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        logger.info("test out of time: " + result.getName());
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("START TEST -  : " + context.getName());
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("FINISH TEST  - : " + context.getName());
        logger.info("all code executed: passed tests: " + context.getPassedTests());
        logger.info("all code executed: failed tests: " + context.getFailedTests());
        ITestListener.super.onFinish(context);
    }
}