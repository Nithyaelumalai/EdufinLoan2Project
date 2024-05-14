package ParallelExecutionLoan2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution1  {
	@Test
	private void TestMethods5() throws InterruptedException, AWTException {
	
		ChromeOptions options  = new ChromeOptions ();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver (options);
		driver.get("https://www.eduf.in");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("useAutomationExtension", false);
		opt.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//*[@class=\'css-8mmkcg\']")).click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class=\'form-control\']")).sendKeys("8438638597");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@type=\'submit\']")).click();
		Thread.sleep(30000);
		WebElement otpField = driver.findElement(By.xpath("//*[@id=\'number\']"));
		otpField.sendKeys("");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"form_page\"]/div[2]/form/div[4]/button")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://www.eduf.in/clear-lead-fibe");
		Thread.sleep(2000);
		driver.navigate().to("https://www.eduf.in/loan2/17051/student");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@class=' css-19bb58m']")).click();
		Thread.sleep(1000);

		// select institution name
		driver.findElement(By.xpath("//div[text()='ACHARIYA BALA SIKSHA MANDIR - VENKAT NAGAR']"));

		Thread.sleep(5000);

		Robot rs = new Robot();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);

		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		// click new admission icon
		WebElement sentenceElement = driver.findElement(By.xpath("(//input[@id='flexSwitchCheckDefault'])[1]"));

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Double-click the element
		actions.click(sentenceElement).perform();
		Thread.sleep(2000);
		sentenceElement.click();

		// click transportation fees icon
		WebElement transportationIcon = driver.findElement(By.xpath("(//input[@id='flexSwitchCheckDefault'])[2]"));
		transportationIcon.click();
		Thread.sleep(2000);
		transportationIcon.click();
		Thread.sleep(2000);

		// Enter student name
		WebElement names = driver.findElement(By.xpath("//*[@id='student_name']"));
		names.click();
		names.clear();
		names.sendKeys("EdufinTester");

		// enter student roll no
		WebElement rollno = driver.findElement(By.xpath("//*[@id='student_roll_no']"));
		rollno.click();
		rollno.clear();
		rollno.sendKeys("345677");
		Thread.sleep(2000);

		// Enter date of birth
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("30-04-2001");
		Thread.sleep(3000);

		// scroll down
		WebElement down = driver.findElement(By.xpath("(//*[@class='d-flex justify-content-center mt-1 mb-1'])"));

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].scrollIntoView(true);", down);
		Thread.sleep(3000);

		// select course name
		driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]")).click();
		Thread.sleep(3000);
		
		Robot course = new Robot();
		course.keyPress(KeyEvent.VK_DOWN);
		course.keyRelease(KeyEvent.VK_DOWN);
		course.keyPress(KeyEvent.VK_UP);
		course.keyRelease(KeyEvent.VK_UP);
		course.keyPress(KeyEvent.VK_ENTER);
		course.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		// click academic year
		driver.findElement(By.xpath("//div[@id='academic_year']")).click();
		Thread.sleep(3000);
		Robot year = new Robot();
//		year.keyPress(KeyEvent.VK_DOWN);
//		year.keyRelease(KeyEvent.VK_DOWN);
		year.keyPress(KeyEvent.VK_ENTER);
		year.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		// Enter annual fees
		WebElement fees = driver.findElement(By.xpath("//*[@id='annual_fee']"));
		fees.click();
		// clear annual fees value
		fees.clear();
		fees.sendKeys("40000");

		// click submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor applicatePage = (JavascriptExecutor) driver;
		applicatePage.executeScript("arguments[0].scrollIntoView(false)", name);
   
		// validate to name

		name.clear();
		name.sendKeys("EdufinTester");

		// validate to applicantsFatherName
		WebElement fatherName = driver.findElement(By.xpath("//input[@id='applicantsFatherName']"));
		fatherName.clear();
		fatherName.sendKeys("EdufinTester");

		// validate to panNo
		WebElement panNo = driver.findElement(By.xpath("//input[@id='panNo']"));
		panNo.clear();
		panNo.sendKeys("AAMTS3432L");

		// Enter date of birth
		driver.findElement(By.xpath("//input[@id='empDOB']")).sendKeys("30-06-2007");
	
		// select Relation type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Relationship Type']//following-sibling::div")).click();
		
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// select gender
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-19bb58m'])[2]")).click();
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// select marital status
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[3]")).click();
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// enter account no
		driver.findElement(By.xpath("//input[@id='bankAccountNo']")).sendKeys("123456789054321");

		// enter Bank Name
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[4]")).click();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// enter IFSC code
		driver.findElement(By.xpath("(//input[@id='ifscCode'])")).sendKeys("IFSCEDUFIN0009");

		// enter account type
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Account Type']//following::input)[1]")).click();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement down1 = driver.findElement(By.xpath("(//*[@class='text-primary'])[3]"));
		JavascriptExecutor  details = (JavascriptExecutor) driver;
		details.executeScript("arguments[0].scrollIntoView(true);", down1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='emiTenure']")).click();
		Thread.sleep(3000);
		WebElement down2 = driver.findElement(By.xpath("(//*[@class='card-footer d-flex justify-content-center'])[1]"));
        
		JavascriptExecutor  emi = (JavascriptExecutor) driver;
		emi.executeScript("arguments[0].scrollIntoView(true);", down2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(3000);
		WebElement down3 = driver.findElement(By.xpath("(//*[@class='text-primary'])[4]"));

		JavascriptExecutor  text = (JavascriptExecutor) driver;
		text.executeScript("arguments[0].scrollIntoView(true);", down3);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[6]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='residenceAddress']")).sendKeys("23/1, Ground Floor, Cathedral Garden Road.");
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[7]")).click();
		Thread.sleep(5000);
		Robot  state= new Robot();
		state.keyPress(KeyEvent.VK_DOWN);
		state.keyRelease(KeyEvent.VK_DOWN);
	;
		state.keyPress(KeyEvent.VK_ENTER);
		state.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[8]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='pincode']")).sendKeys("600035");
		Thread.sleep(3000);
		WebElement down4 = driver.findElement(By.xpath("(//*[@class='text-primary'])[6]"));
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//*[@id='flexSwitchCheckDefault']")).click();
		 Thread.sleep(3000);
		JavascriptExecutor  organization = (JavascriptExecutor) driver;
		organization.executeScript("arguments[0].scrollIntoView(true);", down4);
		Thread.sleep(5000);
		
//		   driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
		// select Organization Name
		 WebElement Organization = driver.findElement(By.xpath("//*[@id='organizationName']"));
		 Organization.clear();
		 Organization.sendKeys("Edufinorganization");
		Thread.sleep(2000);
		
		//select Employed Since 
		driver.findElement(By.xpath("//*[@id='employedSince']")).sendKeys("2024-04-03");
		Thread.sleep(2000);
		
		// select Occupation Type 

		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[11]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//select Business Constitution 
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[12]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_UP);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		
        //select Designation 
		WebElement Designation = driver.findElement(By.xpath("//*[@id='designation']"));
		Designation.clear();
		Designation.sendKeys("Tester");
		Thread.sleep(3000);
		
		//select Net Monthly Salary
		WebElement NetMonthlysalary = driver.findElement(By.xpath("//*[@id='netMonthlySalary']"));
		NetMonthlysalary.clear();
		NetMonthlysalary .sendKeys("25000");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='officeAddress']")).sendKeys("23/1, Ground Floor, Cathedral Garden Road, Nungambakkam.");
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[13]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_UP);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[14]")).click();
		Thread.sleep(4000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id='officePincode']")).sendKeys("600056");
        Thread.sleep(3000); 
        
        driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
        Thread.sleep(2000);
        
	    driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])[2]")).click();
	    Thread.sleep(10000);
		   
		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])[1]")).click();
		Thread.sleep(10000);
		// quit the browser
        driver.quit();
		
	}



	
	@Test
	private void TestMethods6() throws InterruptedException, AWTException {
//		WebDriverManager.chromedriver().clearDriverCache().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(5000);
		
		ChromeOptions options  = new ChromeOptions ();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver (options);
		driver.get("https://www.eduf.in");
		Thread.sleep(5000);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("useAutomationExtension", false);
		opt.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//*[@class=\'css-8mmkcg\']")).click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class=\'form-control\']")).sendKeys("8438638597");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@type=\'submit\']")).click();
		Thread.sleep(30000);
		WebElement otpField = driver.findElement(By.xpath("//*[@id=\'number\']"));
		otpField.sendKeys("");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"form_page\"]/div[2]/form/div[4]/button")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://www.eduf.in/clear-lead-fibe");
		Thread.sleep(2000);
		driver.navigate().to("https://www.eduf.in/loan2/17051/student");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@class=' css-19bb58m']")).click();
		Thread.sleep(1000);

		// select institution name
		driver.findElement(By.xpath("//div[text()='ACHARIYA BALA SIKSHA MANDIR - VENKAT NAGAR']"));

		Thread.sleep(5000);

		Robot rs = new Robot();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);

		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		// click new admission icon
		WebElement sentenceElement = driver.findElement(By.xpath("(//input[@id='flexSwitchCheckDefault'])[1]"));

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Double-click the element
		actions.click(sentenceElement).perform();
		Thread.sleep(2000);
		sentenceElement.click();

		// click transportation fees icon
		WebElement transportationIcon = driver.findElement(By.xpath("(//input[@id='flexSwitchCheckDefault'])[2]"));
		transportationIcon.click();
		Thread.sleep(2000);
		transportationIcon.click();
		Thread.sleep(2000);

		// Enter student name
		WebElement names = driver.findElement(By.xpath("//*[@id='student_name']"));
		names.click();
		names.clear();
		names.sendKeys("EdufinTester");

		// enter student roll no
		WebElement rollno = driver.findElement(By.xpath("//*[@id='student_roll_no']"));
		rollno.click();
		rollno.clear();
		rollno.sendKeys("345677");
		Thread.sleep(2000);

		// Enter date of birth
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("30-04-2001");
		Thread.sleep(3000);

		// scroll down
		WebElement down = driver.findElement(By.xpath("(//*[@class='d-flex justify-content-center mt-1 mb-1'])"));

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].scrollIntoView(true);", down);
		Thread.sleep(3000);

		// select course name
		driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]")).click();
		Thread.sleep(3000);
		
		Robot course = new Robot();
		course.keyPress(KeyEvent.VK_DOWN);
		course.keyRelease(KeyEvent.VK_DOWN);
		course.keyPress(KeyEvent.VK_UP);
		course.keyRelease(KeyEvent.VK_UP);
		course.keyPress(KeyEvent.VK_ENTER);
		course.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		// click academic year
		driver.findElement(By.xpath("//div[@id='academic_year']")).click();
		Thread.sleep(3000);
		Robot year = new Robot();
//		year.keyPress(KeyEvent.VK_DOWN);
//		year.keyRelease(KeyEvent.VK_DOWN);
		year.keyPress(KeyEvent.VK_ENTER);
		year.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		// Enter annual fees
		WebElement fees = driver.findElement(By.xpath("//*[@id='annual_fee']"));
		fees.click();
		// clear annual fees value
		fees.clear();
		fees.sendKeys("40000");

		// click submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor applicatePage = (JavascriptExecutor) driver;
		applicatePage.executeScript("arguments[0].scrollIntoView(false)", name);
   
		// validate to name

		name.clear();
		name.sendKeys("EdufinTester");

		// validate to applicantsFatherName
		WebElement fatherName = driver.findElement(By.xpath("//input[@id='applicantsFatherName']"));
		fatherName.clear();
		fatherName.sendKeys("EdufinTester");

		// validate to panNo
		WebElement panNo = driver.findElement(By.xpath("//input[@id='panNo']"));
		panNo.clear();
		panNo.sendKeys("AAMTS3432L");

		// Enter date of birth
		driver.findElement(By.xpath("//input[@id='empDOB']")).sendKeys("30-06-2007");
	
		// select Relation type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Relationship Type']//following-sibling::div")).click();
		
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// select gender
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-19bb58m'])[2]")).click();
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// select marital status
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[3]")).click();
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// enter account no
		driver.findElement(By.xpath("//input[@id='bankAccountNo']")).sendKeys("123456789054321");

		// enter Bank Name
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[4]")).click();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);

		// enter IFSC code
		driver.findElement(By.xpath("(//input[@id='ifscCode'])")).sendKeys("IFSCEDUFIN0009");

		// enter account type
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Account Type']//following::input)[1]")).click();
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement down1 = driver.findElement(By.xpath("(//*[@class='text-primary'])[3]"));
		JavascriptExecutor  details = (JavascriptExecutor) driver;
		details.executeScript("arguments[0].scrollIntoView(true);", down1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='emiTenure']")).click();
		Thread.sleep(3000);
		WebElement down2 = driver.findElement(By.xpath("(//*[@class='card-footer d-flex justify-content-center'])[1]"));
        
		JavascriptExecutor  emi = (JavascriptExecutor) driver;
		emi.executeScript("arguments[0].scrollIntoView(true);", down2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(3000);
		WebElement down3 = driver.findElement(By.xpath("(//*[@class='text-primary'])[4]"));

		JavascriptExecutor  text = (JavascriptExecutor) driver;
		text.executeScript("arguments[0].scrollIntoView(true);", down3);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class=' css-hlgwow'])[6]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyRelease(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='residenceAddress']")).sendKeys("23/1, Ground Floor, Cathedral Garden Road.");
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[7]")).click();
		Thread.sleep(5000);
		Robot  state= new Robot();
		state.keyPress(KeyEvent.VK_DOWN);
		state.keyRelease(KeyEvent.VK_DOWN);
	;
		state.keyPress(KeyEvent.VK_ENTER);
		state.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[8]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='pincode']")).sendKeys("600035");
		Thread.sleep(3000);
		WebElement down4 = driver.findElement(By.xpath("(//*[@class='text-primary'])[6]"));
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//*[@id='flexSwitchCheckDefault']")).click();
		 Thread.sleep(3000);
		JavascriptExecutor  organization = (JavascriptExecutor) driver;
		organization.executeScript("arguments[0].scrollIntoView(true);", down4);
		Thread.sleep(5000);
		
//		   driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
		// select Organization Name
		 WebElement Organization = driver.findElement(By.xpath("//*[@id='organizationName']"));
		 Organization.clear();
		 Organization.sendKeys("Edufinorganization");
		Thread.sleep(2000);
		
		//select Employed Since 
		driver.findElement(By.xpath("//*[@id='employedSince']")).sendKeys("2024-04-03");
		Thread.sleep(2000);
		
		// select Occupation Type 

		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[11]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//select Business Constitution 
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[12]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_UP);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		
        //select Designation 
		WebElement Designation = driver.findElement(By.xpath("//*[@id='designation']"));
		Designation.clear();
		Designation.sendKeys("Tester");
		Thread.sleep(3000);
		
		//select Net Monthly Salary
		WebElement NetMonthlysalary = driver.findElement(By.xpath("//*[@id='netMonthlySalary']"));
		NetMonthlysalary.clear();
		NetMonthlysalary .sendKeys("25000");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='officeAddress']")).sendKeys("23/1, Ground Floor, Cathedral Garden Road, Nungambakkam.");
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[13]")).click();
		Thread.sleep(3000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_UP);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//*[@class='css-8mmkcg'])[14]")).click();
		Thread.sleep(4000);
		rs.keyPress(KeyEvent.VK_DOWN);
		rs.keyPress(KeyEvent.VK_ENTER);
		rs.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id='officePincode']")).sendKeys("600056");
        Thread.sleep(3000); 
        
        driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
        Thread.sleep(2000);
        
	    driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])[2]")).click();
	    Thread.sleep(10000);
		   
		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])[1]")).click();
		Thread.sleep(10000);
		// quit the browser
        driver.quit();

	}
		
		

	}




