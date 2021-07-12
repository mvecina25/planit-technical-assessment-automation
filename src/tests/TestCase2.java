package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.PrinterLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.EventListener;
import base.TestBaseSetup;
import base.TestListener;
import helper.SeleniumUtilities;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
import pages.Contact;
import pages.Home;
import pages.Shop;

import org.testng.annotations.Parameters;


public class TestCase2 extends TestBaseSetup{
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(ITestContext iTestContext) {
		driver = getDriver();		
		
		// Set the driver object to the ITestContext
		TestListener.setContext(iTestContext, driver);
	}
		
	
	// Note: Run this test 5 times to ensure 100% pass rate
	@Test (invocationCount = 5)
	public void testCase2() {		
		
		// Establishing connection of two POMs
		Home HP = new Home(driver);		
		HP.click_HomeTab();
		
		// From the home page go to contact page
		Contact CP = HP.click_ContactTab();		
		
		// Populate mandatory fields
		CP.input_Forename("Medel");
		CP.input_Email("medel.vecina@gmail.com");
		CP.input_Message("Planit Testing");
		
		// Click submit button
		CP.click_Submit();
		
		// Validate successful submission message
		Assert.assertFalse(CP.alertMsg_ContactForm().contains("Thanks test, we appreciate your feedback."));
		
	}
	
}
