package com.zensar.CucumberBasics.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	Properties prop=null;
	String currDir=System.getProperty("user.dir");
	String pathFoeChromeDriver=currDir+"\\src\\main\\java\\com\\zensar\\CucumberBasics\\driver\\chromedriver.exe";
	String username=null;
	String password=null;
	WebDriver driver=null;
	public Base(){
		prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(currDir+"\\src\\main\\java\\com\\zensar\\CucumberBasics\\config");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
	
	public void init() {
		System.setProperty("webdriver.chrome.driver",pathFoeChromeDriver);
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
	

}
