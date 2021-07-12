package base;

import static base.InitializeLogging.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		 System.out.println("Alert Accepted");
		 log.info("Alert Accepted");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Alert Dismissed");
		log.info("Alert Dismissed");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("The value in the element after changing: "+arg2[0]);
		log.info("");
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Element clicked");
		log.info("The value in the element after changing");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Element found");
		log.info("Element found");
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Screen shot was taken successfully. Target type is %s, result is %s", arg0, arg1);
		log.info("Screen shot was taken successfully");
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println("Got the text of an element: " + arg2);
		log.info("Got the text of an element");
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Navigating back to: "+arg0.getCurrentUrl());
		log.info("Navigating back to");
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Navigating forward to: "+arg0.getCurrentUrl());
		log.info("Navigating forward to");
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url after refreshing: "+arg0.getCurrentUrl());
		log.info("URL after refreshing");
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Navigating to url: "+arg0);
		log.info("Navigating to url");
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Executed javascript: "+arg0);
		log.info("Executed javascript");
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Driver is switched to window %s", arg0);
		log.info("Driver is switched to window");
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before accepting alert");
		log.info("Before accepting alert");
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before dismissing alert");
		log.info("Before dismissing alert");
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before changing the value: "+arg2[0]);
		log.info("Before changing the value");
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Trying to click on the element");
		log.info("Trying to click on the element");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Trying to find the element: " + arg0.toString());
		log.info("Trying to find the element");
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		System.out.printf("Attempt to take screen shot. Target type is %s", arg0);
		log.info("Attempt to take screen shot");
	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Attempt to get text of the element");
		log.info("Attempt to get text of the element");
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before navigating back: "+arg0.getCurrentUrl());
		log.info("Url before navigating back");
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before navigating forward");
		log.info("Url before navigating forward");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Url before refreshing page: "+arg0.getCurrentUrl());
		log.info("Url before refreshing page");
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Current URL : "+arg1.getCurrentUrl());
		log.info("Current URL");
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Executing javascript: " +arg0);
		log.info("Executing javascript");
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.printf("Attempt to switch to window %s", arg0);
		log.info("Attempt to switch to window");
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Exception throwed: "+arg0.getMessage());
		log.info("Exception throwed");
	}

}
