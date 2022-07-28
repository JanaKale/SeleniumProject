package com.screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/*There are three ways to take screenshot in selenium
 * using Robot class
 * using selenium's Takescreenshot interface
 * using Ashot (External library for screenshots)
 */
public class Screenshots {

	public static void usingRobot() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		Robot robot=new Robot();
		Rectangle rect=new Rectangle();
		rect.setSize(1280,800);
		BufferedImage img=robot.createScreenCapture(rect);
		ImageIO.write(img, "png", new File("usingRobot.png"));
	}

	public static void usingSelenium() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("usingSelenium.png"));
	}

	public static void usingAshot() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot sc = ashot.takeScreenshot(driver);
		BufferedImage img = sc.getImage();
		ImageIO.write(img, "PNG", new File("usingAshot.png"));
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
      usingAshot();
	}

}
