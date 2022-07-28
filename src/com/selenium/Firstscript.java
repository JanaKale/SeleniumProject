package com.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstscript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://freecrm.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("kalejana53@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Jana25395");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

}
