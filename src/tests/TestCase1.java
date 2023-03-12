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


public class TestCase1 extends TestBaseSetup{
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(ITestContext iTestContext) {
		driver = getDriver();		
		
		// Set the driver object to the ITestContext
		TestListener.setContext(iTestContext, driver);
	}
	
	
	@Test
	public void testCase1() {		
		
		// Establishing connection of two POMs
		Home HP = new Home(driver);
		
		// From the home page go to contact page
		Contact CP = HP.click_ContactTab();

		// Click submit button
		CP.click_Submit();
		
		// Verify error messages
		Assert.assertTrue(CP.errMsg_ContactForm().contains("Forename is required"));
		Assert.assertTrue(CP.errMsg_ContactForm().contains("Email is required"));
		Assert.assertTrue(CP.errMsg_ContactForm().contains("Message is required"));
		
		// Populate mandatory fields
		CP.input_Forename("Medel");
		CP.input_Email("medel.vecina@gmail.com");
		CP.input_Message("Planit Testing");
		
		// Validate errors are gone
		Assert.assertFalse(CP.errMsg_ContactForm().contains("Forename is required"));
		Assert.assertFalse(CP.errMsg_ContactForm().contains("Email is required"));
		Assert.assertFalse(CP.errMsg_ContactForm().contains("Message is required"));	
			
	}
	
}
