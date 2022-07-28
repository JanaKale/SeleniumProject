package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/Assignments/ImplicitWaitDemo.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("java");

		/*
		 * The only differene between fluentwait and webdriverwait is webdriverwait can
		 * take only driver instance as an argument and with fluentwait we can pass
		 * other arguments also like javascriptexecuter object also
		 * FluentWait wait=new FluentWait(driver,Duration.ofSeconds(10));
		 */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("10 seconds timeout satisfied");
		wait.withTimeout(Duration.ofSeconds(15));
		wait.ignoring(ElementNotInteractableException.class);// here we can write multiple exceptions separated with ,
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),click)]")));
    
		driver.findElement(By.xpath("//button[contains(text(),click)]")).click();
		System.out.println("Button clicked");
		driver.findElement(By.xpath("//button[text()='Button2']")).click();
		System.out.println("Button2 clicked");
		
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
	}

}
