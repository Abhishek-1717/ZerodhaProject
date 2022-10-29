package com.baseClass;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSet {
	
	public WebDriver driver;
	
	ReadConfig read=new ReadConfig();
	//public String MainUrl=read.BaseUrl();
    public String Baseid=read.SetId();
	public String Basepass=read.Setpass();
	public String Basepin=read.setPin();

	@Parameters({"browser"})
	@BeforeTest
	public void setUp(@Optional("chrome")String browser)
	{
    	if(browser.equalsIgnoreCase("chrome"))
    	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Start-maximized");
		 driver=new ChromeDriver(options);
    	}
    	else if(browser.equalsIgnoreCase("edge"))
    	{
    	 WebDriverManager.edgedriver().setup();
    	 EdgeDriver driver=new EdgeDriver();
    	}
    	else
    	{
    		throw new  RuntimeException("browser Value invalid");
    	
    	}
         //driver.get("https://kite.zerodha.com/#loggedout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	}
	
	
	@AfterTest
	public void terup()
	{
		driver.close();
	}

}
