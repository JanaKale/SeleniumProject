package com.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) {
		handlingframe();

	}

	public static void handlingframe() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/Assignments/FrameDemo.html");

		/*
		 * frame() is available in overloaded forms which can take arguments as index
		 * ,frame id or name or any unique webelement locator
		 */

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("jana");

		driver.switchTo().frame("frame-2");
		driver.findElement(By.name("lname")).sendKeys("kale");

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[contains(@name,'ok')]")).click();

		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
	}

}
