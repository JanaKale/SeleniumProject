package com.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void jse() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shree\\Downloads\\Browser Drivers\\msedgedriver-101.exe");
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://testingshastra.com");
        String script="window.scrollBy(0,500)";
        driver.executeAsyncScript(script);
       Thread.sleep(5000);
       String script1="window.scrollBy(0,-500)";
       driver.executeAsyncScript(script1);
     //  driver.executeScript("window.scrollBy(0,arguments[0])",500,800);
       //driver.executeScript("window.scrollBy(arguments[0],arguments[1])",0,800);
      // String text=(String) driver.executeScript("return document.querySelector(\"li#menu-item-255\").innerText");
	
	//System.out.println(text);
	}
	public static void jse1() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("file:///C:/Users/Shree/Desktop/FileUpoload.html");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
	}
    public static void main(String[] args) throws InterruptedException {
    	jse1();
    }
}
