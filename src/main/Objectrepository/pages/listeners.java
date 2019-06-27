package pages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Base;

import java.io.IOException;

public class listeners implements ITestListener {
    Base b =new Base();
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        b.getScreenshot();

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
