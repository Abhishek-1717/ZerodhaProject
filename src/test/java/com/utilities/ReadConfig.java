package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	
	String path="F:\\NEW\\ZerodhaProject\\Configuration\\config.properties";
	
	Properties prop;
	
	public ReadConfig() {
		
		prop=new Properties();
		
		
		try {
			FileInputStream file=new FileInputStream(path);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public String setBrowser()
	{
		String browser=prop.getProperty("browser");
		return browser;
	}
	
	public String BaseUrl()
	{
		String Url=prop.getProperty("url");
		return Url;
	}
	
	public String SetId()
	{
		String Uid=prop.getProperty("userId");
		return Uid;
	}
	public String Setpass()
	{
		String Upass=prop.getProperty("password");
		return Upass;
	}
	public String setPin()
	{
		String Upin=prop.getProperty("Pin");
				return Upin;
	}

}
