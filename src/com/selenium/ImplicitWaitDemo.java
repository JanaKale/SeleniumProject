package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/ImplicitWaitDemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("name")).sendKeys("java");
		driver.findElement(By.xpath("//button[contains(text(),click)]")).click();
		driver.findElement(By.xpath("//button[text()='Button2']")).click();
		System.out.println("Button2 clicked");
	}

}
