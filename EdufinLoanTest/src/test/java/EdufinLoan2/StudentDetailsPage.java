package EdufinLoan2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentDetailsPage extends BaseClass {
	
	public StudentDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text () ='ACHARIYA BALA SIKSHA MANDIR - VENKATA NAGAR']")
	private WebElement institutionName;
	
	@FindBy(xpath="(//input[@id='flexSwitchCheckDefault'])[1]")
	private WebElement newAdmissionIcon;
	
	@FindBy(xpath="(//input[@id='flexSwitchCheckDefault'])[2]")
	private WebElement transportationFeesIcon;
	
	@FindBy(xpath="//*[@id='student_name']")
	private WebElement studentName;
	
	@FindBy(xpath="//*[@id='student_roll_no']")
	private WebElement studentRollNo;
	
	@FindBy(xpath="//*[@id='dob']")
	private WebElement DOB;
	
	@FindBy(xpath="(//*[@class='d-flex justify-content-center mt-1 mb-1'])")
	private WebElement scrollDown;
	
	@FindBy(xpath="(//div[@class=' css-1wy0on6'])[3]")
	private WebElement courseName;
	
	@FindBy(xpath="//div[@id='academic_year']")
	private WebElement academicYear;
	
	@FindBy(xpath="//*[@id='annual_fee']")
	private WebElement annualFees;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;

	public WebElement getInstitutionName() {
		return institutionName;
	}

	public WebElement getNewAdmissionIcon() {
		return newAdmissionIcon;
	}

	public WebElement getTransportationFeesIcon() {
		return transportationFeesIcon;
	}

	public WebElement getStudentName() {
		return studentName;
	}

	public WebElement getStudentRollNo() {
		return studentRollNo;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getCourseName() {
		return courseName;
	}

	public WebElement getAcademicYear() {
		return academicYear;
	}

	public WebElement getAnnualFees() {
		return annualFees;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
   


