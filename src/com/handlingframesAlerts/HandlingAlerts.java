package com.handlingframesAlerts;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//simpleAlert();
		//bootstrapPopUp();
		promptAlert();
	}

	public static void simpleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("101");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();       
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		String alerttext2 = alert2.getText();
		System.out.println(alerttext2);
		alert2.accept();
		Thread.sleep(3000);
		driver.close();
	}

	public static void confirmAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alerttext = confirmalert.getText();
		System.out.println(alerttext);
		confirmalert.dismiss();
		Thread.sleep(3000);
		driver.close();
	}
    public static void promptAlert() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@class='static_page']")).click();
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert promptalert=driver.switchTo().alert();
		Thread.sleep(5000);
		promptalert.sendKeys("abc");
		System.out.println(promptalert.getText());
		promptalert.accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		Thread.sleep(3000);
		driver.close();
    }
   public static void tsPromptAlert() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testingshastra.com/assignments/prompt");
		driver.findElement(By.xpath("//button")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Jana");
		Thread.sleep(5000);
		alert.accept();
		//Thread.sleep(3000);
		//alert.sendKeys("26");
		Thread.sleep(3000);
		alert.accept();
   }
    public static void bootstrapPopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
		driver.findElement(By.xpath("(//div/button[contains(text(),'Launch demo modal')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div/button[contains(text(),'Close')])[2]")).click();
	}
}
