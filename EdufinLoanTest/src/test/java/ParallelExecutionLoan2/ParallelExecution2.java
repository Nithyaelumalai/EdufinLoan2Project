package ParallelExecutionLoan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution2 {
	@Test
	private void TestMethods5() throws InterruptedException {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://schools.edufin.in/");
		Thread.sleep(5000);	

	}
	
	@Test
	private void TestMethods6() throws InterruptedException {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

	}

}
