package com.handlingframeswindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	static WebDriver driver;

	public static void click(String findxpath,String gettextxpath) {
		driver.findElement(By.xpath(findxpath)).click();
		String text = driver.findElement(By.xpath(gettextxpath)).getText();
		System.out.println(text);
	}
	public static void tsExample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/Assignments/HandlingMultipleWindows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("//button")).click();
		Set<String> handles = driver.getWindowHandles();
		String findxpath="//button";
		String gettextxpath="//p";

		for (String h : handles) {
			driver.switchTo().window(h);
			try {
			if ((driver.findElement(By.xpath("//h2")).getText()).contains("Fourth")) {
				click(findxpath, gettextxpath);
			} else if ((driver.findElement(By.xpath("//h2")).getText()).contains("First")) {
				click(findxpath, gettextxpath);
			} else if ((driver.findElement(By.xpath("//h2")).getText()).contains("Third")) {
				click(findxpath, gettextxpath);
			} else if ((driver.findElement(By.xpath("//h2")).getText()).contains("Second")) { 
				click(findxpath, gettextxpath);
			}
			}
			catch(NoSuchElementException e) {
				
			} 
		}
		Thread.sleep(5000);
		driver.close();
	}
	public static void hyrExample() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		String parenthandle=driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
	    Set<String> handles=driver.getWindowHandles();	
	    for(String s:handles) {
	    	if(!s.equals(parenthandle)) {
	    		driver.switchTo().window(s);
	    	driver.manage().window().maximize();	   	    	
	   		driver.findElement(By.xpath("//input[@name='fName']")).sendKeys("jana");
	    	Thread.sleep(3000);
	    	driver.close();
	    	}
	    }
	    driver.switchTo().window(parenthandle);
	    driver.findElement(By.className("whTextBox")).sendKeys("kale");
	    Thread.sleep(4000);
	    driver.close();
	}
	public static void guru99Example(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		String parenthandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//p/a")).click();
        Set<String> handles=driver.getWindowHandles();
        for(String hand:handles) {
        	driver.switchTo().window(hand);
        	if(!hand.equals(parenthandle)) {
        		break;
        	}
        }
        driver.findElement(By.name("emailid")).sendKeys("kalejana53@gmail.com");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    driver.close();
	    driver.switchTo().window(parenthandle);
	    driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		guru99Example();

	}

}
