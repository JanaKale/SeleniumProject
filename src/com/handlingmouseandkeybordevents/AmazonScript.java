package com.handlingmouseandkeybordevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScript {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		setup();
		// dragAndDrop();
		mouseOver();
		tearDown();
	}

	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public static void dragAndDrop() throws InterruptedException {
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//img[@src='/images/MERN-Stack-Development.jpg']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
	}

	public static void methods() throws InterruptedException {
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//img[@src='/images/MERN-Stack-Development.jpg']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action = new Actions(driver);
		action.clickAndHold(src).moveToElement(dest).release().build().perform();

	}
	public static void mouseOver() throws InterruptedException{
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("menu-item-153"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	public static void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
	}

}