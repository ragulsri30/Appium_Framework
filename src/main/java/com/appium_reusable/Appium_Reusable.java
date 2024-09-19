package com.appium_reusable;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.appium_baseclass.Appium_Library;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Appium_Reusable extends Appium_Library {

	
	
	
	public TouchAction a ;
	
	public void element_Click(WebElement element) {

		element.click();
	}

	public void enter_Value(WebElement element, String value) {

		element.sendKeys(value);
	}

	public void scrollDown(int count, int wait_Time) {

		Dimension size = driver.manage().window().getSize();

		int Startx = size.width / 2;

		int StartY = (int) (size.height * 0.8);

		int endY = (int) (size.height * 0.2);

		 a = new TouchAction(driver);

		for (int i = 0; i < count; i++) {

			a.press(PointOption.point(Startx, StartY))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(wait_Time)))
					.moveTo(PointOption.point(Startx, endY))

					.release().perform();
		}

		
	
	}
	
	public void scrollUp(int count , int wait_Time) {
		
		
		for (int i = 0; i <count; i++) {
			
		
				a.press(PointOption.point(500,1500)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(wait_Time)))
				.moveTo(PointOption.point(500,500)).release().perform();
		}	
		
		
		
	}
	
	
	
	
	
	public  void element_Long_Press() {

		
		
	}
	
	
	
	
	
}