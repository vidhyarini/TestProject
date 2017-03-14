package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main (String args[]){

	//	System.setProperty("webdriver.gecko.driver","C:\\Rini\\Selenium\\Drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	//	System.setProperty("webdriver.chrome.driver","C:\\Rini\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\Rini\\Selenium\\Drivers\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		
	//	WebDriver driver= new FirefoxDriver();
	//	ChromeDriver driver = new ChromeDriver();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		String url= "https://lemontree.no/";
		driver.get(url);
	}
}
