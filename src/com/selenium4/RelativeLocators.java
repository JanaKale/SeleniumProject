package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namebox=driver.findElement(By.name("name"));
	   System.out.println(driver.findElement(with(By.tagName("label")).above(namebox)).getText());

	    WebElement bday=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
	   driver.findElement(with(By.tagName("input")).below(bday)).click();
	  //driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    
	    WebElement check=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(check)).click();
	    
	    WebElement rdb=driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
	
	    WebElement checkbox=driver.findElement(By.xpath("//input[@value='option3']"));
	    System.out.println(driver.findElement(with(By.tagName("label")).near(checkbox)).getText());
	}

}

