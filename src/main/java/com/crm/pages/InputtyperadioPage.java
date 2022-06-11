package com.crm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.BasePage;


public class InputtyperadioPage extends BasePage{
	
	WebDriver driver;
	
	public InputtyperadioPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@name='fav_language']")
	private List<WebElement> favLanguage;
	
	@FindBy(id="iframeResult")
	private WebElement iframeResult;
	
	/**
	 * select fav language
	 * @param value
	 */
	public void selectFavLanguage(String value) {
		selectRadioButton(favLanguage,value);
	}
	
	public void switchToFrame() {
		driver.switchTo().frame(iframeResult);
	}

}
