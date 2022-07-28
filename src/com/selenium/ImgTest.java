package com.selenium;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImgTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mlmproductsupply.com/");
		
		//This code is just to take the img screenshot and store in our system
		WebElement logoimg = driver.findElement(By.xpath("//img[@class='et_b_header-logo-img']"));
		Screenshot img = new AShot().takeScreenshot(driver, logoimg);
		ImageIO.write(img.getImage(), "png", new File("C://Users//Shree//Desktop//projects//logo.png"));
		
		//just to check image exists or not at specified location
		File f = new File("C://Users//Shree//Desktop//projects//logo.png");
		System.out.println(f.exists());
		
		//actual code to compare both the images
		
		BufferedImage expimg = ImageIO.read(f);
		WebElement logoimgele = driver.findElement(By.xpath("//img[@class='et_b_header-logo-img']"));
		Screenshot logimg = new AShot().takeScreenshot(driver, logoimgele);
		BufferedImage actimg = logimg.getImage();
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expimg, actimg);
		if(!diff.hasDiff())
		System.out.println("Images are same test pass");
	}

}
