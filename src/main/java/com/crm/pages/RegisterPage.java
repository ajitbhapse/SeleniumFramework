package com.crm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.BasePage;

public class RegisterPage extends BasePage{
	
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement secondName;
	
	@FindBy(xpath = "//input[@name='radiooptions']")
	private List<WebElement> gender;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> hobbies;
	
	@FindBy(id="Skills")
	private WebElement skills;
	
	@FindBy(id = "yearbox")
	private WebElement yearBox;
	
	/**
	 * use this method to enter first name
	 * @param firstName
	 */
	public void  enterFirstName(String firstName) {
		sendKeys(this.firstName,firstName);
	}
	
	/**
	 * use this method to add second name
	 * @param secondName
	 */
	public void enterSecondName(String secondName) {
		sendKeys(this.secondName, secondName);
	}
	
	/**
	 * use this method to select gender
	 * @param value
	 */
	public void selectGender(String value) {
		selectRadioButton(gender,value);
	}
	
	public void selectHobbies(List<String> values) {
		selectCheckBoxButton(hobbies, values);
	}
	/**
	 * use this method to select skills
	 * @param value
	 */
	public void selectSkills(String value) {
		selectByVisibleText(skills,value);
	}
	
	public void selectYear(String value) {
		selectByVisibleText(yearBox, value);
	}
	

}
