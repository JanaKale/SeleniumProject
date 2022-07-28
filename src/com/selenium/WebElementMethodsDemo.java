package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo {
	public static void getAttribute() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String attribute = driver.findElement(By.xpath("//input[@name='login']")).getAttribute("name");
		System.out.println(attribute);
	}

	public static void getText() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String text = driver.findElement(By.linkText("Forgot Password?")).getText();
		System.out.println(text);
	}

	public static void isSelected() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		boolean selected = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		System.out.println("Before click:" + selected);
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		selected = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		System.out.println("After click:" + selected);
	}

	public static void isDisplayed() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		boolean isDisplayed = driver.findElement(By.xpath("//input[@value='Hide']")).isDisplayed();
		System.out.println(isDisplayed);
	}
	public static void getTagName() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String tag=driver.findElement(By.id("dropdown-class-example")).getTagName();
	    System.out.println(tag);
	}
	public static void isEnabled(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		boolean isEnabled=driver.findElement(By.xpath("//button[text()='Login']")).isEnabled();
		System.out.println(isEnabled);
	}

	public static void main(String[] args) {
		isEnabled();

	}

}
