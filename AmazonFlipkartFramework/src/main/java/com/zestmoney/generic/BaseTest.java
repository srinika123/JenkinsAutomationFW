package com.zestmoney.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	@Test
	public void openBrowser()
	{
			System.setProperty("webdriver.driver.chromedriver","");
			driver=new ChromeDriver();
	
	}
}
