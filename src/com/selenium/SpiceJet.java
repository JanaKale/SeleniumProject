package com.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	public static void endtoend() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.xpath("//div[text()='one way']")).click();

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[1]")).click();
		driver.findElement(By.xpath("//div/div[text()='Raja Bhoj Airport']")).click();

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[2]")).click();
		driver.findElement(By.xpath("//div[text()='Amritsar']")).click();

		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		driver.findElement(
				By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']/div[text()='29']"))
				.click();// date

		driver.findElement(By.xpath("//div[text()='Passengers']")).click();// passenger
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();// passenger/adult
		driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();// passenger/children

		driver.findElement(By.xpath("//div[text()='Currency']")).click();// currency
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and text()='USD']")).click();// currency

		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();// checkbox

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/child::div[@data-testid='home-page-flight-cta']"))
				.click();// search flight

	}

	public static void rough() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		List<WebElement> checkbox = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']"));
		System.out.println(checkbox.size());
		for (WebElement c : checkbox) {
			String s = c.getText();
			if (s.equals("Armed Forces")) {
				c.click();
			}
		}

		// driver.findElement(By.xpath("//div[text()='round trip']")).click();
		List<WebElement> radio = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']"));
		System.out.println(radio.size());
		for (WebElement r : radio) {
			String s = r.getText();
			if (s.equals("round trip")) {
				r.click();
			}
		}

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[1]")).click();
		// driver.findElement(By.xpath("//div/div[text()='Raja Bhoj
		// Airport']")).click();
		List<WebElement> dropdown = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		System.out.println(dropdown.size());
		try {
			for (WebElement d : dropdown) {
				String s = d.getText();
				if (s.equals("Vijayawada")) {
					d.click();
				}
			}
		} catch (StaleElementReferenceException e) {

		}

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[2]")).click();
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); alert.dismiss(); //
		 * driver.findElement(By.xpath("//div/div[text()='Raja Bhoj //
		 * Airport']")).click();
		 */
		List<WebElement> todropdown = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		System.out.println(dropdown.size());

		for (WebElement d : todropdown) {
			String s = d.getText();
			if (s.equals("Ahmedabad")) {
				d.click();
			}
		}

		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();// date

		driver.findElement(By.xpath("//div[text()='Passengers']")).click();// passenger
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();// passenger/adult
		driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();// passenger/children

		driver.findElement(By.xpath("//div[text()='Currency']")).click();// currency
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and text()='USD']")).click();// currency

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/child::div[@data-testid='home-page-flight-cta']"))
				.click();// search flight

	}

	public static void rsaPracticePage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rbuttons = driver.findElements(By.xpath("//input[contains(@value,'radio')]"));
		for (WebElement b : rbuttons) {
			if (b.getAttribute("value").contains("radio1")) {
				b.click();
				System.out.println(b.getAttribute("value"));
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");
		driver.findElement(By.xpath("//ul/li/div[text()='India']")).click();

		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(drop);
		List<WebElement> options = select.getOptions();
		for (WebElement o : options) {
			String text = o.getText();
			// System.out.println(text);
			if (text.equals("Option2")) {
				select.selectByVisibleText(text);
			}
		}
		WebElement option1 = driver.findElement(By.xpath("//input[@value='option1']"));
		if (!option1.isSelected()) {
			option1.click();
		}
		System.out.println(option1.isSelected());

		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
				String msg = driver.findElement(By.xpath("//div/h3[starts-with(text(),'An Academy ')]")).getText();
				System.out.println(msg);
			}
		}
		// driver.close();
		driver.switchTo().window(parenthandle);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String> tabhandles = driver.getWindowHandles();
		for (String thandle : tabhandles) {
			driver.switchTo().window(thandle);
			String title = driver.getTitle();
			if (title.contains("Rahul Shetty Academy")) {
				System.out.println(driver.findElement(By.xpath("//strong[contains(text(),' Earn')]")).getText());

			}
			driver.switchTo().window(parenthandle);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

		}
	}

	public static void calender() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\Downloads\\Browser Drivers\\chromedriver-103.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		//String month1=driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']/div/div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText();
		//String month2=driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']/div/div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText();
		
		List<WebElement> months = driver
				.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
		for (int i = 0; i < months.size(); i++) {
			if (months.get(i).getText().split(" ")[0].contains("August")) {
				months.get(i).click();
				break;
			}
		}
WebElement box=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/div[3])"));
	List<WebElement> days=box.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
	for (int j = 0; j < days.size(); j++) {
		if(days.get(j).getText().equalsIgnoreCase("23")){
			days.get(j).click();
			break;
		}
	}
	}

	public static void main(String[] args) {
		// rsaPracticePage();
		calender();
	}
}
