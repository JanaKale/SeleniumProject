package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	static WebDriver driver;
	public static void main(String[] args) {
		setup();
		//radioButton();
		checkbox();
	}
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
   public static void radioButton() {
	   driver.get("https://mdbootstrap.com/docs/b4/jquery/forms/radio-button/");
	   List <WebElement> buttons=driver.findElements(By.xpath("//div/label[@class='custom-control-label']"));
	  System.out.println(buttons.size());
	  for(int i=5;i<8;i++) {
		  WebElement b=buttons.get(i);
		  
		  if(b.getText().equals("Option 2")) {
			  b.click();
		  }
	  }	                            
   }
   public static void checkbox() {
	   driver.get("https://mdbootstrap.com/docs/b4/jquery/forms/checkbox/");
	   List <WebElement> cbox= driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
        for(WebElement c:cbox) {
        	if(c.getText().equals("1")) {
        		System.out.println(c.getText());
        		c.click();
        	}
        }
   }
}
