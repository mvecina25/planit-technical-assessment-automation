package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	String filePath = "C:./src\\report\\";
		
	@Override
	public void onTestFailure(ITestResult result) {
    	System.out.println("***** Error " + result.getName() + " test has failed *****");
    	
    	// Accessing the driver object that we added in the setUp method
    	String methodName = result.getName().toString().trim();    	
        ITestContext context = result.getTestContext();        
        WebDriver driver = (WebDriver)context.getAttribute("driver");       
    	takeScreenShot(methodName, driver);
    }
	
	public void takeScreenShot(String methodName, WebDriver driverEvent) {
		
   	 	File screenShotFile = ((TakesScreenshot)driverEvent).getScreenshotAs(OutputType.FILE);
   	 
        // The below method will save the screen shot in the report folder under class with test method name 
   	 	try {
			FileUtils.copyFile(screenShotFile, new File(filePath + methodName + ".png"));
			System.out.println(" *** Placed screen shot in "+ filePath + " ***");				
		} catch (IOException e) {				
			e.printStackTrace();
		}
   }
	
	// Set the driver object to the ITestContext
	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
        iTestContext.setAttribute("driver", driver);
        return iTestContext;
    }
	
//	public void onFinish(ITestContext context) {}
//	  
//    public void onTestStart(ITestResult result) {   }
//  
//    public void onTestSuccess(ITestResult result) {   }
//
//    public void onTestSkipped(ITestResult result) {   }
//
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }
//
//    public void onStart(ITestContext context) {   }
}
