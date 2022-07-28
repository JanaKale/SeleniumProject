package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		int count=0;
		for (WebElement link : links) {

			String url = link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int statuscode = con.getResponseCode();
			if (statuscode > 400) {
				count++;
				System.out.println(count);
				System.out.println("link is broken");
			}
		}

		/*
		 * String url =
		 * driver.findElement(By.xpath("//a[contains(@href,'brokenlink')]")).
		 * getAttribute("href"); HttpURLConnection con = (HttpURLConnection) new
		 * URL(url).openConnection(); con.setRequestMethod("HEAD"); con.connect(); int
		 * statuscode = con.getResponseCode(); System.out.println(statuscode);
		 */
	}

}
