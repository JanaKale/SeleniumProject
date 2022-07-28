package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSAscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys("rahulshettyacdemy");
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value=\"rmbrUsername\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"chkboxTwo\"]")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("jana");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("kalejana53@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("8483850225");
		driver.findElement((By.xpath("//button[contains(text(),\"Go to \")]"))).click();
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[starts-with(@class,'submit')]")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		}

}
