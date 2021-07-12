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


public class TestCase3 extends TestBaseSetup{
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(ITestContext iTestContext) {
		driver = getDriver();		
		
		// Set the driver object to the ITestContext
		TestListener.setContext(iTestContext, driver);
	}
	
	@Test
	public void testCase3() {	
		
		// Establishing connection of two POMs
		// From the home page go to shop page
		Home HP = new Home(driver);		
		HP.click_HomeTab();		
		Shop SP = HP.click_ShopTab();		
		
		// Click buy button 2 times on “Funny Cow”
		SP.click_FunnyCowBuy();
		SP.click_FunnyCowBuy();
		
		// Click buy button 1 time on “Fluffy Bunny”
		SP.click_FluppyBunnyBuy();
		
		// Click the cart menu
		SP.click_Cart();
		
		// Verify the items are in the cart
		Assert.assertTrue(SP.getText_ItemOne().contains("Funny Cow"));		
		Assert.assertTrue(SP.getText_ItemTwo().contains("Fluffy Bunny"));

	}
	
}
