package com.dev.selenium;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.phantomjs.PhantomJSDriver;
 import org.openqa.selenium.remote.DesiredCapabilities;
 import org.testng.annotations.Test;
 
 
 public class FacebookTest {
 
 	WebDriver driver;
 	@Test
 	public void verifyFacebookTitle()
 	{
 	System.setProperty("phantomjs.binary.path","/Users/Dev/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");	
 	DesiredCapabilities cap = DesiredCapabilities.phantomjs();
 	driver = new PhantomJSDriver(cap);
 	driver.get("http://www.facebook.com");
 	System.out.println(driver.getTitle());
 	System.out.println("Hello");
 		
 	}
 	
 }