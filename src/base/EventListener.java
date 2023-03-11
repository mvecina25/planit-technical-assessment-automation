package base;

import static base.InitializeLogging.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener{

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		 System.out.println("Alert Accepted");
		 log.info("Alert Accepted");
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Alert Dismissed");
		log.info("Alert Dismissed");
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("The value in the element after changing: "+arg2[0]);
		log.info("");
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Element clicked");
		log.info("The value in the element after changing");
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Element found");
		log.info("Element found");
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Screen shot was taken successfully. Target type is %s, result is %s", arg0, arg1);
		log.info("Screen shot was taken successfully");
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println("Got the text of an element: " + arg2);
		log.info("Got the text of an element");
	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Navigating back to: "+arg0.getCurrentUrl());
		log.info("Navigating back to");
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Navigating forward to: "+arg0.getCurrentUrl());
		log.info("Navigating forward to");
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url after refreshing: "+arg0.getCurrentUrl());
		log.info("URL after refreshing");
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Navigating to url: "+arg0);
		log.info("Navigating to url");
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Executed javascript: "+arg0);
		log.info("Executed javascript");
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Driver is switched to window %s", arg0);
		log.info("Driver is switched to window");
	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before accepting alert");
		log.info("Before accepting alert");
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before dismissing alert");
		log.info("Before dismissing alert");
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before changing the value: "+arg2[0]);
		log.info("Before changing the value");
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Trying to click on the element");
		log.info("Trying to click on the element");
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Trying to find the element: " + arg0.toString());
		log.info("Trying to find the element");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		System.out.printf("Attempt to take screen shot. Target type is %s", arg0);
		log.info("Attempt to take screen shot");
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Attempt to get text of the element");
		log.info("Attempt to get text of the element");
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before navigating back: "+arg0.getCurrentUrl());
		log.info("Url before navigating back");
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before navigating forward");
		log.info("Url before navigating forward");
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before refreshing page: "+arg0.getCurrentUrl());
		log.info("Url before refreshing page");
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Current URL : "+arg1.getCurrentUrl());
		log.info("Current URL");
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Executing javascript: " +arg0);
		log.info("Executing javascript");
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Attempt to switch to window %s", arg0);
		log.info("Attempt to switch to window");
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Exception throwed: "+arg0.getMessage());
		log.info("Exception throwed");
	}

}
