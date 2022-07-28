package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	// static RemoteWebDriver driver;

	@SuppressWarnings("deprecation")
	public static void FileUpload() throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/Assignments/FileUpoload.html");
		
		WebElement choose = driver.findElement(By.xpath("//input[@type='file']"));
		Actions action = new Actions(driver);
		action.moveToElement(choose).click().build().perform(); //Thread.sleep(3000);
		
		Runtime.getRuntime().exec("\"C:\\Users\\Shree\\Documents\\File.exe\"");

		/*
		 * WebElement choose = driver.findElement(By.tagName("h2"));
		driver.findElement(with(By.tagName("input")).below(choose)).click();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input\").click()");*/
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		FileUpload();
	}
}
