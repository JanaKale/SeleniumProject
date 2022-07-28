package com.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GScript {
	static ChromeDriver driver;

	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public static void m1() throws InterruptedException {
		driver.get("http://demo.guru99.com/V4");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("jana");
		driver.findElement(By.name("password")).sendKeys("abcde");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		/*
		 * FluentWait<ChromeDriver> wait = new FluentWait(driver);
		 * wait.withTimeout(Duration.ofSeconds(15));
		 * wait.pollingEvery(Duration.ofSeconds(2));
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();

	}

	public static void explicitWait() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		if (title.contains("Free Training")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		driver.findElement(By.xpath("//a[@href=\"http://www.guru99.com/\"and @class='item']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='➤ Selenium']")));
		WebElement seleniumLink = driver.findElement(By.xpath("//a[text()='➤ Selenium']"));
		seleniumLink.click();
	}

	public static void main(String[] args) throws InterruptedException {
		setup();
		//m1();
		explicitWait();
	}
}
