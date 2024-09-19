package com.appium_baseclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appium_Library {
	
	
	public AndroidDriver driver;
	
	public void device_Configuration() throws MalformedURLException {

	
	
	
	DesiredCapabilities capabilities= new DesiredCapabilities();
	
	
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion","Funtouch OS 14");
	capabilities.setCapability("deviceName","vivo Y35");
	capabilities.setCapability("udid", "10BD1A0JSA0013Z");
   capabilities.setCapability("appPackage","com.google.android.youtube");
	capabilities.setCapability("appActivity","com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
	
	
	URL url= new URL("http://0.0.0.0:4723/wd/hub");
	
	 driver= new AndroidDriver(url,capabilities);
	 
	 
	}

}
