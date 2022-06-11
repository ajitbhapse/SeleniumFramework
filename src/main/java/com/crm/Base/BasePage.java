package com.crm.Base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * use this method to enter value in text box
	 * 
	 * @param elem
	 * @param value
	 */
	public void sendKeys(WebElement elem, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elem));
		elem.clear();
		try {
			elem.sendKeys(value);
		} catch (IllegalArgumentException e) {
			System.out.println("null value send...");
		}
	}

	/**
	 * use this method to select radio button
	 * 
	 * @param elems
	 * @param value
	 */
	public void selectRadioButton(List<WebElement> elems, String value) {
		for (WebElement elem : elems) {
			if (elem.getAttribute("value").equalsIgnoreCase(value)) {
				elem.click();
				break;
			}
		}
	}

	/**
	 * use this method to select radio button
	 * 
	 * @param elems
	 * @param value
	 */
	public void selectCheckBoxButton(List<WebElement> elems, List<String> values) {
		for (String value : values) {
			for (WebElement elem : elems) {
				if (elem.getAttribute("value").equalsIgnoreCase(value)) {
					elem.click();
					break;
				}
			}
		}
	}

	/**
	 * use this method to select value from dropdown
	 * 
	 * @param elem
	 * @param value
	 */
	public void selectByVisibleText(WebElement elem, String value) {
		Select select = new Select(elem);
		select.selectByVisibleText(value);
	}

	/**
	 * use this method to perform click operation
	 * 
	 * @param elem
	 */
	public void click(WebElement elem) {
		elem.click();
	}

	/**
	 * use this method to perform submit operation
	 * 
	 * @param elem
	 */
	public void submit(WebElement elem) {
		elem.submit();
	}
}
