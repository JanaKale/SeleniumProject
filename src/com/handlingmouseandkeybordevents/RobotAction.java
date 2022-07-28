package com.handlingmouseandkeybordevents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAction {
	static WebDriver driver;

	public static void usingRobot() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		driver = new ChromeDriver();
		driver.get("hhttps://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kalejana53@gmail.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void sendkey() {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Shree/Desktop/Assignments/ImplicitWaitDemo.html");
		driver.findElement(By.id("name")).sendKeys("jana");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		usingRobot();
	}

}
