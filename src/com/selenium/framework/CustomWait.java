package com.selenium.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;

public class CustomWait extends BaseTest{
	
	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "WebElement was visible within timeout period "+waitTime+" secs");
	}
	
	public void forElementVisibility(WebElement webelement) {
		wait = new WebDriverWait(driver, FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		test.log(LogStatus.INFO, "WebElement was visible within timeout period "+FrameworkConstants.OBJECT_LOAD_TIME_OUT+" secs");
	} 
	
	public void forElementVisibility(WebElement webelement, int customTimeout) {
		wait = new WebDriverWait(driver, customTimeout);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		test.log(LogStatus.INFO, "WebElement was visible within timeout period "+customTimeout+" secs");
	} 
	
	public void forElementInVisibility(By locator) throws InterruptedException {
		wait = new WebDriverWait(driver, FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		test.log(LogStatus.INFO, "WebElement was Invisible within timeout period "+FrameworkConstants.OBJECT_LOAD_TIME_OUT+" secs");
	}
	
	public void forElementInVisibility(By locator, int customTimeout) throws InterruptedException {
		wait = new WebDriverWait(driver, customTimeout);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		test.log(LogStatus.INFO, "WebElement was Invisible within timeout period "+customTimeout+" secs");
	}
	
	public void forAlertToBePresent() {
		wait = new WebDriverWait(driver, FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.alertIsPresent());
		test.log(LogStatus.INFO, "Alert message was displayed within timeout period "+FrameworkConstants.OBJECT_LOAD_TIME_OUT+" secs");
	}
	
	public void forAlertToBePresent(int customTimeout) {
		wait = new WebDriverWait(driver, customTimeout);
		wait.until(ExpectedConditions.alertIsPresent());
		test.log(LogStatus.INFO, "Alert message was displayed within timeout period "+customTimeout+" secs");
	}
	
	public void forPageTitle(String pagetitle) {
		wait = new WebDriverWait(driver, FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.titleIs(pagetitle));
		test.log(LogStatus.INFO, "Webpage with page title "+pagetitle+" loaded within timeout period "+FrameworkConstants.OBJECT_LOAD_TIME_OUT+" secs");
	}
	
	public void forPageTitle(String pagetitle, int customTimeout) {
		wait = new WebDriverWait(driver, customTimeout);
		wait.until(ExpectedConditions.titleIs(pagetitle));
		test.log(LogStatus.INFO, "Webpage with page title "+pagetitle+" loaded within timeout period "+customTimeout+" secs");
	}
	
	public void forPageToLoad(WebElement webelement) {
		wait = new WebDriverWait(driver, FrameworkConstants.PAGE_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		test.log(LogStatus.INFO, "Webpage loaded within timeout period "+FrameworkConstants.PAGE_LOAD_TIME_OUT+" secs");
	}
	
	public void forPageToLoad(WebElement webelement, int customTimeout) {
		wait = new WebDriverWait(driver, customTimeout);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		test.log(LogStatus.INFO, "Webpage loaded within timeout period "+customTimeout+" secs");
	}
	
	public void forPageToLoad(String pageTitle) {
		wait = new WebDriverWait(driver, FrameworkConstants.PAGE_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.titleIs(pageTitle));
		test.log(LogStatus.INFO, "Webpage loaded within timeout period "+FrameworkConstants.PAGE_LOAD_TIME_OUT+" secs");
	}
	
	public void forPageToLoad(String pageTitle, int customTimeout) {
		forPageTitle(pageTitle,customTimeout);
		test.log(LogStatus.INFO, "Webpage loaded within timeout period "+customTimeout+" secs");
	}
	
	public void forTextToBePresent(String text){
		text.trim();
		int count = 0;
		boolean flag = false;
		do {
			if(driver.getPageSource().contains(text)) {
				flag = true;
				test.log(LogStatus.INFO, "Search text found on the webpage");
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		
		if(!flag) {
			throw new TimeoutException("Search text not found on the webpage after timeout period of "+FrameworkConstants.OBJECT_LOAD_TIME_OUT+" secs");
		}
	}
	
	public void forTextToBePresent(String text, int customTimeout){
		text.trim();
		int count = 0;
		boolean flag = false;
		do {
			if(driver.getPageSource().contains(text)) {
				flag = true;
				test.log(LogStatus.INFO, "Search text found on the webpage");
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < customTimeout);
		
		if(!flag) {
			throw new TimeoutException("Search text not found on the webpage after timeout period of "+customTimeout+" secs");
		}
	}
	
	public void forElementToBeEnabled(WebElement webelement) {
		int count = 0;
		boolean flag = false;
		do {
			if(webelement.isEnabled()) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < FrameworkConstants.OBJECT_LOAD_TIME_OUT);
		
		if(!flag) {
			throw new ElementNotInteractableException("Element disabled");
		}
	}
	
	public void forElementToBeEnabled(WebElement webelement, int customTimeout) {
		int count = 0;
		boolean flag = false;
		do {
			if(webelement.isEnabled()) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < customTimeout);
		
		if(!flag) {
			throw new ElementNotInteractableException("Element disabled");
		}
	}
	
	public void forElementToBeVisibleAndEnabled(WebElement webelement) {
		forElementVisibility(webelement);
		forElementToBeEnabled(webelement);
	}	
	
	public void forElementToBeVisibleAndEnabled(WebElement webelement, int customTimeout) {
		forElementVisibility(webelement,customTimeout);
		forElementToBeEnabled(webelement,customTimeout);
	}
	
	public void forXseconds(int seconds) {
		seconds = seconds * 1000;
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
} 