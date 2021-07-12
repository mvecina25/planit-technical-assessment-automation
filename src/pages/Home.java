package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helper.SeleniumUtilities;

public class Home {
	
	WebDriver driver;	
	
	@FindBy(xpath = "//a[contains(.,'Home')]") WebElement homeElement;
	@FindBy(xpath = "//a[contains(.,'Contact')]") WebElement contactElement;
	@FindBy(xpath = "//a[contains(.,'Shop')]") WebElement shopElement;	

	// Constructor
	public Home(WebDriver driver) {
		this.driver = driver;
		
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void click_HomeTab() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(homeElement, 10).click();
	}
	
	
	public Contact click_ContactTab() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(contactElement, 10).click();
		return new Contact(driver);		
	}

	public Shop click_ShopTab() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(shopElement, 10).click();
		return new Shop(driver);		
	}
	
}
