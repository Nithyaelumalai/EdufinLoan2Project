package Utilityclass;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public static WebDriver driver;// created reference variable for WebDriver

	public static void browserLaunch(String url) {

		WebDriverManager.chromedriver().setup();// initializing driver variable using EdgeDriver
		driver = new ChromeDriver();// created method for Browser
		driver.get(url);

	}

	public static void title() {// created method for Title
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void url() {// create method for URL
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
	}

	public static void refresh() {
		driver.navigate().refresh();

	}
	

	public static void maximize() {// create method for maximized
		driver.manage().window().maximize();
	}

	public static void minimize() {// create method for minimize
		driver.manage().window().minimize();
	}

	public static void time() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void waitUntilElementVisible(WebDriver driver, WebElement webElement) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(webElement));

		} catch (Exception e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(webElement));
		}
	}

	public static void takeScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\Screenshots\\homepage.png");
		FileUtils.copyFile(src, destination);
	}

	public static void dropDownMethod(WebElement element, String text) {// create method for dropDownMethod
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void dropDownText(WebElement element, String text) {// create method for dropDownText
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public static void buttonClick(WebElement element) {// create method for button Click
		element.click();
	}

	public static void inputText(WebElement element, String text) {// create method for sendKeys values
		element.sendKeys(text);
	}

	public static void outputText(WebElement element) {// create method for Output Text
		System.out.println(element.getText());
	}

	public static void closeBrowser() {// close the session
		driver.close();
	}

	public static void quitBrowser() {// Quit the driver
		driver.quit();
	}

}
