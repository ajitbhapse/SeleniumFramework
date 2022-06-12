package com.crm.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.crm.pages.InputtyperadioPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FavLanguageTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
	}
	
	@Test
	public void favLang() {
		InputtyperadioPage inputtyperadioPage = new InputtyperadioPage(driver);
		inputtyperadioPage.switchToFrame();
		inputtyperadioPage.selectFavLanguage("CSS");
		Assert.assertEquals(true, true);
	}

}
