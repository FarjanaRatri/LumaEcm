package luma.us.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.us.basepage.LumaBasePage;

public class LumaCommonUtilitys extends LumaBasePage{
	
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
	}
	
	public static void getJSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public static void getAssert(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		log.info("Verified text" + actual);
		System.out.println("Verified text" + actual);
	}
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	
	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);
			
	}
	
	public static void elementScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].scrollIntoView", element);
	}
	
	public static void pageScrollDown() {
		Actions Magic = new Actions(driver);
		Magic.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	public static void clickUntilElementClickAble(WebElement element ) {
		WebElement ele = element;
		//int i;
		for(int i=0; i<=299; i++) {
			ele.click();
			break;
		}
		
	}
	
	public static void getRadioButton(WebElement ele) {
		boolean sel = ele.isSelected();
		if(!sel) {
			ele.click();
			
		}
			
	}
}
