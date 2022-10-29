package com.TestClass;

import java.time.Duration;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseClass.BrowserSet;
import com.utilities.ExtendReport;

import pageClass.DashboardPage;
import pageClass.LoginKitePage;
import pageClass.PinPage;
@Listeners(ExtendReport.class)
public class TestApp extends BrowserSet{
	
	
	@Test
	public void login()
	{
		//driver.get(MainUrl);
      LoginKitePage lp=new LoginKitePage(driver);
       lp.userData(Baseid, Basepass);
       lp.Login();
      
       PinPage pn=new PinPage(driver);
       try {
    	   pn.pin(Basepin);
           pn.cotinue();
	} catch (Exception e) {
	e.printStackTrace();
	}
      
	
       
       
       
      
     
//	@DataProvider(name = "abc")
//	public Object[][]getData()
//	{
//		Object[][] searchWord=new Object[2][3];
//		searchWord[0][0]="KE3218";
//		searchWord[0][1]="Abhi@1234";
//		searchWord[0][2]="461998";
//		searchWord[1][0]="KE3219";
//		searchWord[1][1]="Abhi@1234";
//		searchWord[1][2]="461998";
//		return searchWord;
	}
	

}
