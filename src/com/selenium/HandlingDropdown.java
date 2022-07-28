package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// selectDropdown();
		// useGetOptions();
		// multiselectDrop();
		// multiDrop();
		bootstrapDrop();
	}

	public static void selectDropdown() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up' and @tabindex='4'] ")).click();

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		// driver.findElement(By.xpath("//span/label[text()='Female']")).click();
		/*
		 * Select selectday=new Select(day); selectday.selectByIndex(4);
		 * 
		 * Select selectmonth=new Select(month); selectmonth.selectByVisibleText("Mar");
		 * 
		 * Select selectyear=new Select(year); selectyear.selectByVisibleText("1995");
		 */

		selectBirthday(day, "5");
		selectBirthday(month, "Mar");
		selectBirthday(year, "1995");

	}

	public static void useGetOptions() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up' and @tabindex='4'] ")).click();

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selectmonth = new Select(month);
		List<WebElement> listofmonths = selectmonth.getOptions();
		for (WebElement mont : listofmonths) {

			if (mont.getText().equals("Mar")) {
				selectmonth.selectByVisibleText("Mar");
				break;
			}
			System.out.println(mont.getText());
		}
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectday = new Select(day);
		List<WebElement> listofday = selectday.getOptions();
		for (WebElement din : listofday) {

			if (din.getText().equals("5")) {
				selectmonth.selectByIndex(4);
				break;
			}
			System.out.println(din.getText());
		}
	}

	public static void selectBirthday(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}

	public static void bootstrapDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.mobiscroll.com/select/country-picker");
		driver.findElement(By.xpath("//span/input[@id='demo155-country-picker']")).click();
		// driver.findElement(By.xpath("//label/span/input[@autocomplete='off']")).sendKeys("ind");
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//div/img[@src='https://img.mobiscroll.com/demos/flags/ID.png']")).click();
		List<WebElement> countries =driver.findElements(By.className("md-country-picker-item"));
		System.out.println(countries.size());
		for (int i = 0; i < countries.size(); i++) {

			WebElement c = countries.get(i);
			/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.withTimeout(Duration.ofSeconds(60));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(c));*/
			driver.executeScript("");
			System.out.println(c.getText());
		}
	}

	public static void multiDrop() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement cources = driver.findElement(By.xpath("//select[@class='multi-select']"));
		Select lang = new Select(cources);
		System.out.println(lang.isMultiple());
		lang.selectByVisibleText("Core Java");
		lang.selectByVisibleText("Selenium Grid");
		List<WebElement> s = lang.getAllSelectedOptions();
		for (WebElement c : s) {
			System.out.println(c.getText());
		}
	}

	public static void multiselectDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-101.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select#");
		// WebElement
		// drop=driver.findElement(By.xpath("//input[@id='multiple-select-input']"));
		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		// wait.until(ExpectedConditions.elementToBeClickable(drop));
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"(//span[@class='mbsc-textfield-tags mbsc-ios mbsc-ltr  mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea'])[1]"))
				.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@role='option'][text()='Books']")).click();
		driver.findElement(By.xpath("//div[@role='option'][text()='Movies, Music & Games']")).click();
		driver.findElement(By.xpath("//div[@role='option'][text()='Electronics & Computers']")).click();
		// driver.findElements(By.xpath("//div[@role='option']"))
	}

}
