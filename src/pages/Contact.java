package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helper.SeleniumUtilities;

public class Contact {
	
	WebDriver driver;	
	
	@FindBy(xpath = "//a[contains(.,'Contact')]") WebElement contactElement;
	@FindBy(xpath = "//a[contains(text(),'Submit')]") WebElement submitElement;
	@FindBy(xpath = "//input[@id='forename']") WebElement forenameElement;
	@FindBy(xpath = "//input[@id='email']") WebElement emailElement;
	@FindBy(xpath = "//textarea[@id='message']") WebElement messageElement;
	@FindBy(xpath = "//body") WebElement formErrorElement;
	@FindBy(xpath = "//div[@class='alert alert-success']") WebElement alertSuccessElement;
	
	public Contact() {
		
	}
	
	// Constructor
	public Contact(WebDriver driver) {
		this.driver = driver;
		
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void click_ContactTab() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(contactElement, 10).click();
	}
	
	public void click_Submit() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(submitElement, 10).click();
	}
	
	public void input_Forename(String strForename) {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElement(forenameElement, 10).sendKeys(strForename);
	}
	
	public void input_Email(String strEmail) {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElement(emailElement, 10).sendKeys(strEmail);
	}
	
	public void input_Message(String strMessage) {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElement(messageElement, 10).sendKeys(strMessage);
	}
	
	public String errMsg_ContactForm() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(formErrorElement, 10).getText();
		return strMessage;		
	}
	
	public String alertMsg_ContactForm() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(alertSuccessElement, 25).getText();
		return strMessage;		
	}
	
}
