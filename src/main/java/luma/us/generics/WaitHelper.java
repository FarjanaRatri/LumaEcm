package luma.us.generics;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import luma.us.basepage.LumaBasePage;

public class WaitHelper extends LumaBasePage {
	
	// below i have kept different function of waits for my requirements 
	// explicit wait
	public static void seleniumWait(WebElement ele, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));	
	}
	
	public static void waitUntilElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void waitVisibilityOfAllElements(List<WebElement> element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public void waitUntilElementIsVisible(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void waitUntilElementIsClickable(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	// Fluent Wait 
	/*
	 * public static void waitForElementWithFluentWait(By element, WebDriver driver)
	 * { // fluent wait declaration part Wait<WebDriver> fwait = new
	 * FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(30)) //Specify
	 * the timeout of the wait .withTimeout(5,TimeUnit.SECONDS)
	 * .pollingEvery(Duration.SECONDS_FIELD_NUMBER) //Specify polling time/ interval
	 * time, like every 5 seconds .ignoring(NoSuchElementException.class);// until
	 * these line is fluent wait declaration part
	 * 
	 * // fluent wait usage/utilization part for each element WebElement ele =
	 * fwait.until(new Function<WebDriver, WebElement>() { public WebElement
	 * apply(WebDriver driver) { return driver.findElement(element); } }); // until
	 * these line is fluent wait usage/utilization part for each element
	 * //ele.click(); }
	 */
		
}
