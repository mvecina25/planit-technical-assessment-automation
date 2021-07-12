package helper;

import static org.testng.Assert.assertFalse;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBaseSetup;

public class SeleniumUtilities {

	WebDriver driver;
	
	public SeleniumUtilities(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement waitForElement(WebElement elementLocator, int timeout) {
		
		WebElement webElement = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		try {
			System.out.println(elementLocator);
			webElement = wait.until(ExpectedConditions.visibilityOf(elementLocator));
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		}
		
		if (webElement == null) {
			assertFalse(true, "WebElement not found within " + timeout + " seconds. Test Failed - " + "Element: " + elementLocator + "\nCurrent Page: " + driver.getCurrentUrl());
		}
		
		return webElement;
	}
	
	public WebElement waitForElementToBeClickable(WebElement elementLocator, int timeout) {
		
		WebElement webElement = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);

		try {
			System.out.println(elementLocator);
			webElement = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		}
		
		if (webElement == null) {
			assertFalse(true, "WebElement not found within " + timeout + " seconds. Test Failed - " + "Element: " + elementLocator + "\nCurrent Page: " + driver.getCurrentUrl());
		}
		
		return webElement;
	}
	
    public void waitForPageLoad() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
	public void selectProductItemByCSSNameAndPrice(String cssSelector, String itemName, String itemPrice) {
		
		List<WebElement> productList = driver.findElements(By.cssSelector(cssSelector));
		
		System.out.println(productList.size());
		
		for (WebElement item: productList ) {
				
			String selectedItem = item.getText();
			
			System.out.println("THIS IS THE ELEMENT 1: " + selectedItem);
			
			if (selectedItem.contains(itemName)) {   			
				
				if (selectedItem.contains(itemPrice)) {	
					
	            	System.out.println("THIS IS THE ELEMENT 2:" + selectedItem);
	            	
	        		SeleniumUtilities util = new SeleniumUtilities(driver);
	        		
	        		util.waitForElementToBeClickable(item, 10).click();
	        		
	        		break;
				}
            }	
		}
	}

		
}
