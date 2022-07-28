package com.linkspractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksPractise {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Getting all the links present on webpage
		System.out.println(driver.findElements(By.tagName("a")).size());

        //limiting the scope of driver means getting all the links from footer section only
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// creating minidriver getting links from specific portion of the webpage
		WebElement columndriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		List<WebElement> links = columndriver.findElements(By.tagName("a"));
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			// String key = Keys.chord(Keys.CONTROL, Keys.ENTER); //sending more than one
			// keyboard keys
			itr.next().sendKeys(Keys.CONTROL, Keys.ENTER);
		}
		Set<String> handles = driver.getWindowHandles();
		for (String h : handles) {
			System.out.println(driver.switchTo().window(h).getTitle());
		}
	}
}
