package com.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest3 {
 static RemoteWebDriver driver;
 public static void guru99() {
	 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
		driver.findElement(By.id("txt1")).sendKeys("jana");
 }
 public static void hyr() throws InterruptedException{
	 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
			RemoteWebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			try {
			driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("jana");
			driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("kale");
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Email']")));
			driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("jk@gmail.com");
			driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("jk@5395");
			driver.findElement(By.xpath("//label[text()='Repeat Password']")).sendKeys("jk@5395");
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			}
			catch(ElementNotInteractableException e) {
				
			}
			
 }
	public static void main(String[] args) throws InterruptedException {
	hyr();
		
	}

}
