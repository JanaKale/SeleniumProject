package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		String url=driver.getCurrentUrl();
		if(url.equals("http://www.facebook.com")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		driver.findElement(By.xpath(url));
	}

}
