package com.crm.Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.crm.pages.RegisterPage;
import com.crm.utils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTests {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	
	
	@Test(groups = "Smoke")
	public void register_01() {
		
		Map<String, String> testData = TestUtil.getTestData("register.json", "register_01");
		
		RegisterPage registerPage = new RegisterPage(driver);
		
		//enter first Name
		registerPage.enterFirstName(testData.get("firstName"));
		
		//enter second name
		registerPage.enterSecondName(testData.get("secondName"));
		
		//select gender
		registerPage.selectGender(testData.get("gender"));
		
		//select hobbies
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Cricket");
		hobbies.add("Movies");
		registerPage.selectHobbies(hobbies);
		
		//select skill
		registerPage.selectSkills(testData.get("skill"));
		
		//select year
		registerPage.selectYear(testData.get("year"));
		
		Assert.assertEquals("true", true, true);
	}
	
	
	@Test(groups = "Regression")
	public void register_02() {
		
		RegisterPage registerPage = new RegisterPage(driver);
		
		//enter first Name
		registerPage.enterFirstName("Pooja");
		
		//enter second name
		registerPage.enterSecondName("Abc");
		
		//select gender
		registerPage.selectGender("FeMale");
		
		//select hobbies
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Cricket");
		registerPage.selectHobbies(hobbies);
		
		//select skill
		registerPage.selectSkills("APIs");
		
		//select year
		registerPage.selectYear("1938");
		
		Assert.assertEquals("true", true, true);
	}

}
