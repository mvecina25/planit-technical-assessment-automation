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


public class TestCase4 extends TestBaseSetup{
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(ITestContext iTestContext) {
		driver = getDriver();		
		
		// Set the driver object to the ITestContext
		TestListener.setContext(iTestContext, driver);
	}
	
	@Test
	public void testCase4() {	
		
		// Establishing connection of two POMs
		Home HP = new Home(driver);		
		HP.click_HomeTab();		
		Shop SP = HP.click_ShopTab();		
	
		// Buy 2 Stuffed Frog, 5 Fluffy Bunny, 3 Valentine Bear
		SP.click_StuffedFrogBuy();
		SP.click_StuffedFrogBuy();
		SP.click_FluppyBunnyBuy();
		SP.click_FluppyBunnyBuy();
		SP.click_FluppyBunnyBuy();
		SP.click_FluppyBunnyBuy();
		SP.click_FluppyBunnyBuy();
		SP.click_ValentineBearBuy();
		SP.click_ValentineBearBuy();
		SP.click_ValentineBearBuy();
		
		// Go to the cart page
		SP.click_Cart();
		

		if (SP.getText_ItemOne().contains("Stuffed Frog")) {
			
			// Verify the price for each product
			Assert.assertTrue(SP.getText_ItemOnePrice().contains("$10.99"));
			
			// This will remove the dollar sign from Price
			String productPrice = SP.getText_ItemOnePrice().substring(1);
			
			// This will convert the string to double of Product Price
			Double i = SP.convertStringToDouble(productPrice);
			
			// This will get the value of Quantity
			String productQuantity = SP.getValue_ItemOneQuantity();
			
			// This will convert the string to integer
			int quantity = Integer.parseInt(productQuantity);
			int q = Integer.valueOf(quantity);
			
			// This will multiply Product Price and Quantity
			Double actualTotal = i * q;
			
			// This will remove the dollar sign from Subtotal
			String stotal = SP.getText_ItemOneSubtotal().substring(1);
			
			// This will convert the string to double of Subtotal
			Double expectedTotal = SP.convertStringToDouble(stotal);
			
			// Verify that each product’s sub total = product price * quantity
			Assert.assertEquals(expectedTotal, actualTotal);
			
			System.out.println("EXPECTED SUBTOTAL: " + expectedTotal + " | " + "ACTUAL SUBTOTAL: " + actualTotal);
			
		}
		
		if (SP.getText_ItemTwo().contains("Fluffy Bunny")) {
			
			// Verify the price for each product
			Assert.assertTrue(SP.getText_ItemTwoPrice().contains("$9.99"));
			
			// This will remove the dollar sign from Price
			String productPrice = SP.getText_ItemTwoPrice().substring(1);
			
			// This will convert the string to double of Product Price
			Double i = SP.convertStringToDouble(productPrice);
			
			// This will get the value of Quantity
			String productQuantity = SP.getValue_ItemTwoQuantity();
			
			// This will convert the string to integer
			int quantity = Integer.parseInt(productQuantity);
			int q = Integer.valueOf(quantity);
			
			// This will multiply Product Price and Quantity
			Double actualTotal = i * q;
			
			// This will remove the dollar sign from Subtotal
			String stotal = SP.getText_ItemTwoSubtotal().substring(1);
			
			// This will convert the string to double of Subtotal
			Double expectedTotal = SP.convertStringToDouble(stotal);
			
			// Verify that each product’s sub total = product price * quantity
			Assert.assertEquals(expectedTotal, actualTotal);
			
			System.out.println("EXPECTED SUBTOTAL: " + expectedTotal + " | " + "ACTUAL SUBTOTAL: " + actualTotal);
		}
		
		if (SP.getText_ItemThree().contains("Valentine Bear")) {
			
			// Verify the price for each product
			Assert.assertTrue(SP.getText_ItemThreePrice().contains("$14.99"));
			
			// This will remove the dollar sign from Price
			String productPrice = SP.getText_ItemThreePrice().substring(1);
			
			// This will convert the string to double of Product Price
			Double i = SP.convertStringToDouble(productPrice);
			
			// This will get the value of Quantity
			String productQuantity = SP.getValue_ItemThreeQuantity();
			
			// This will convert the string to integer
			int quantity = Integer.parseInt(productQuantity);
			int q = Integer.valueOf(quantity);
			
			// This will multiply Product Price and Quantity
			Double actualTotal = i * q;
			
			// This will remove the dollar sign from Subtotal
			String stotal = SP.getText_ItemThreeSubtotal().substring(1);
			
			// This will convert the string to double of Subtotal
			Double expectedTotal = SP.convertStringToDouble(stotal);
			
			// Verify that each product’s sub total = product price * quantity
			Assert.assertEquals(expectedTotal, actualTotal);
			
			System.out.println("EXPECTED SUBTOTAL: " + expectedTotal + " | " + "ACTUAL SUBTOTAL: " + actualTotal);
		}
		
		// This will remove the "Total:" text
		String total = SP.getText_Total().substring(7);
		
		// This will convert the string to double of Product Price
		Double actualTotal = SP.convertStringToDouble(total);
		
		// This will remove the dollar sign from Subtotal 
		String subTotalItemOne = SP.getText_ItemOneSubtotal().substring(1);
		String subTotalItemTwo = SP.getText_ItemTwoSubtotal().substring(1);
		String subTotalItemThree = SP.getText_ItemThreeSubtotal().substring(1);
		
		// This will convert the string to double of Subtotal
		SP.convertStringToDouble(subTotalItemOne);
		SP.convertStringToDouble(subTotalItemTwo);
		SP.convertStringToDouble(subTotalItemThree);
		
		// Sum of All Subtotal
		Double actualSubTotal = SP.convertStringToDouble(subTotalItemOne) + SP.convertStringToDouble(subTotalItemTwo) + SP.convertStringToDouble(subTotalItemThree);
		
		// Verify that total = sum(sub totals)  
		Assert.assertEquals(actualSubTotal, actualTotal);
		
		System.out.println("ACTUAL SUBTOTAL: " + actualSubTotal + " | " + "ACTUAL TOTAL: " + actualTotal);
	}
	
	
}
