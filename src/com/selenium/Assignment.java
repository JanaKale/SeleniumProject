package com.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		m1();
		
	}
	public static void m1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qatechhub.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String title=driver.getTitle();
		
		if(title.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
			System.out.println("PASS");
		}
		else {
			System.out.println(title);
		}
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
			
	}

}
