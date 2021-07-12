package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SeleniumUtilities;

public class Shop {
	
	WebDriver driver;	
	
	@FindBy(xpath = "(//a[contains(.,'Shop')]") WebElement shopElement;	
	@FindBy(xpath = "//li[@id='product-2']/div/p/a[@class='btn btn-success']") WebElement stuffedFrogBuyElement;	
	@FindBy(xpath = "//li[@id='product-6']/div/p/a[@class='btn btn-success']") WebElement funnyCowBuyElement;	
	@FindBy(xpath = "//li[@id='product-4']/div/p/a[@class='btn btn-success']") WebElement fluffyBunnyBuyElement;	
	@FindBy(xpath = "//li[@id='product-7']/div/p/a[@class='btn btn-success']") WebElement valentineBearBuyElement;	
	
	@FindBy(xpath = "//a[contains(.,'Cart')]") WebElement cartElement;
	
	@FindBy(xpath = "//a[contains(text(),'Empty Cart')]") WebElement emptyCartElement;	
	@FindBy(xpath = "//a[contains(text(),'Yes')]") WebElement emptyCartYesElement;	
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]") WebElement itemOneElement;	
	@FindBy(xpath = "//tbody/tr[2]/td[1]") WebElement itemTwoElement;	
	@FindBy(xpath = "//tbody/tr[3]/td[1]") WebElement itemThreeElement;	
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]") WebElement itemOnePriceElement;	
	@FindBy(xpath = "//tbody/tr[2]/td[2]") WebElement itemTwoPriceElement;	
	@FindBy(xpath = "//tbody/tr[3]/td[2]") WebElement itemThreePriceElement;	
		
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]") WebElement itemOneQuantityElement;	
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]") WebElement itemTwoQuantityElement;	
	@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]") WebElement itemThreeQuantityElement;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]") WebElement itemOneSubtotalElement;	
	@FindBy(xpath = "//tbody/tr[2]/td[4]") WebElement itemTwoSubtotalElement;	
	@FindBy(xpath = "//tbody/tr[3]/td[4]") WebElement itemThreeSubtotalElement;
	
	@FindBy(xpath = "//tfoot/tr[1]") WebElement totalElement;
	
	public Shop() {
		
	}
	
	public String productListElement() {
		return null;
		
	}
	
	// Constructor
	public Shop(WebDriver driver) {
		this.driver = driver;
		
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void click_StuffedFrogBuy() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(stuffedFrogBuyElement, 10).click();
	}	
	
	public void click_FunnyCowBuy() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(funnyCowBuyElement, 10).click();
	}	
	
	public void click_FluppyBunnyBuy() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(fluffyBunnyBuyElement, 10).click();
	}	
	
	public void click_ValentineBearBuy() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(valentineBearBuyElement, 10).click();
	}

	public void click_Cart() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(cartElement, 10).click();
	}
	
	public void click_EmptyCart() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(emptyCartElement, 10).click();
	}
	
	public void click_EmptyCartYes() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.waitForElementToBeClickable(emptyCartYesElement, 10).click();
	}

	public String getText_ItemOne() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemOneElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_ItemOnePrice() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemOnePriceElement, 10).getText();
		return strMessage;		
	}
	
	public String getValue_ItemOneQuantity() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemOneQuantityElement, 10).getAttribute("value");
		return strMessage;		
	}
	
	public String getText_ItemOneSubtotal() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemOneSubtotalElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_ItemTwo() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemTwoElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_ItemTwoPrice() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemTwoPriceElement, 10).getText();
		return strMessage;		
	}
	
	public String getValue_ItemTwoQuantity() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemTwoQuantityElement, 10).getAttribute("value");
		return strMessage;		
	}
	
	public String getText_ItemTwoSubtotal() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemTwoSubtotalElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_ItemThree() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemThreeElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_ItemThreePrice() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemThreePriceElement, 10).getText();
		return strMessage;		
	}
	
	public String getValue_ItemThreeQuantity() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemThreeQuantityElement, 10).getAttribute("value");
		return strMessage;		
	}
	
	public String getText_ItemThreeSubtotal() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(itemThreeSubtotalElement, 10).getText();
		return strMessage;		
	}
	
	public String getText_Total() {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		String strMessage = util.waitForElement(totalElement, 10).getText();
		return strMessage;		
	}
	
	public Double convertStringToDouble(String str) {
		Double intTotal = Double.parseDouble(str);
		Double t = Double.valueOf(intTotal);
		return t;
	}
	
}
