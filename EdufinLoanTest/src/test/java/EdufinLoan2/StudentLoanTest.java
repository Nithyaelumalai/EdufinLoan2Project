package EdufinLoan2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.screenrecorder.BaseClassRec;

public class StudentLoanTest extends BaseClass{
	@Test

	public void studentLoan() throws Exception {
		BaseClassRec.startRecord("testClass");

		// launch the browser
		browserLaunch("https://www.eduf.in");
		// maximize the browser
		maximize();
		// implicit wait for all script
		time();

		LoginPage login = new LoginPage();

		// select language
		buttonClick(login.getLanguage());

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// wait some time
		LoadingTime();

		// enter the phone number
		inputText(login.getPhoneNo(), "8438638597");
		LoadingTime();

		// click submit button
		buttonClick(login.getSubmit());

		// click OTP field box
		buttonClick(login.getOtpField());
		// Enter OTP number manually
		inputText(login.getOtpField(), "");

		// wait 30 seconds for enter OTP number
		Thread.sleep(30000);
		LoadingTime();

		// click verify OTP button
		buttonClick(login.getVerifyOTP());
		LoadingTime();
		LoadingTime();

		pageLoadingTime();
		navigate("https://www.eduf.in/clear-lead-fibe");
		LoadingTime();
		navigate("https://www.eduf.in/loan2/17051/student");
		pageLoadingTime();

		DashboardDetailsPage dashboard = new DashboardDetailsPage();

		// click educational loan button
		buttonClick(dashboard.getEducationalLoan());
		LoadingTime();
		
		// Student Details page
		StudentDetailsPage studentDetails = new StudentDetailsPage();

		// select institution name
		LoadingTime();
		buttonClick(studentDetails.getInstitutionName());
	
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		LoadingTime();

		// click new admission icon
		buttonClick(studentDetails.getNewAdmissionIcon());
		r.delay(5000);
		buttonClick(studentDetails.getNewAdmissionIcon());

		// click transportation fees icon
		buttonClick(studentDetails.getTransportationFeesIcon());
		r.delay(5000);
		buttonClick(studentDetails.getTransportationFeesIcon());
		r.delay(3000);

		// Enter student name
		buttonClick(studentDetails.getStudentName());
		clear(studentDetails.getStudentName());
		inputText(studentDetails.getStudentName(), "EdufinTester");

		// Enter student roll no
		buttonClick(studentDetails.getStudentRollNo());
		clear(studentDetails.getStudentRollNo());
		inputText(studentDetails.getStudentRollNo(), "345677");
		LoadingTime();

		// Enter date of birth
		inputText(studentDetails.getDOB(), "30-04-2001");
		LoadingTime();

		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", studentDetails.getScrollDown());
		LoadingTime();

		// select course name
		buttonClick(studentDetails.getCourseName());
		LoadingTime();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		LoadingTime();

		// click academic year
		buttonClick(studentDetails.getAcademicYear());
		LoadingTime();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		LoadingTime();

		// Enter annual fees
		buttonClick(studentDetails.getAnnualFees());
		clear(studentDetails.getAnnualFees());
		inputText(studentDetails.getAnnualFees(), "40000");

		// click submit button
		buttonClick(studentDetails.getSubmit());
		pageLoadingTime();

		// Loan application Details page
		LoanApplicationDetailsPage loanApplication = new LoanApplicationDetailsPage();

		js.executeScript("arguments[0].scrollIntoView(false)", loanApplication.getName());

		clear(loanApplication.getName());
		inputText(loanApplication.getName(), "EdufinTester");

		// validate to applicantsFatherName
		clear(loanApplication.getApplicantsFatherName());
		inputText(loanApplication.getApplicantsFatherName(), "EdufinTester");

		// validate to panNo
		clear(loanApplication.getPanNo());
		inputText(loanApplication.getPanNo(), "AAMTS3432L");

		// Enter date of birth
		inputText(loanApplication.getEmpDOB(), "30-06-2007");
		LoadingTime();

		// select Relation type
		buttonClick(loanApplication.getRelationshipType());

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		// select gender
		buttonClick(loanApplication.getGender());

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		// select marrital status
		buttonClick(loanApplication.getMarritalStatus());
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// enter account no
		inputText(loanApplication.getAccountNo(), "123456789054321");
		LoadingTime();

		// Enter Bank Name
		buttonClick(loanApplication.getBankName());

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Enter IFSC code
		inputText(loanApplication.getIFSCcode(), "IFSCEDUFIN0009");
		LoadingTime();

		// enter account type
		buttonClick(loanApplication.getAccountType());

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		LoadingTime();

		// EMI details
		js.executeScript("arguments[0].scrollIntoView(true)", loanApplication.getDown1());
		LoadingTime();

		buttonClick(loanApplication.getEmiTenure());
		LoadingTime();

		js.executeScript("arguments[0].scrollIntoView(true)", loanApplication.getDown2());
		LoadingTime();

		buttonClick(loanApplication.getEmi());
		LoadingTime();

		js.executeScript("arguments[0].scrollIntoView(true)", loanApplication.getDown3());
		LoadingTime();

		buttonClick(loanApplication.getAddress());
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		LoadingTime();

		inputText(loanApplication.getResidenceAddress(), "23/1, Ground Floor, Cathedral Garden Road.");

		buttonClick(loanApplication.getDropDown1());
		pageLoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		buttonClick(loanApplication.getDropDown2());
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		inputText(loanApplication.getPincode(), "600035");
		LoadingTime();

		buttonClick(loanApplication.getIcon());
		LoadingTime();
		js.executeScript("arguments[0].scrollIntoView(true)", loanApplication.getDown4());

		pageLoadingTime();

		// select Organization Name
		clear(loanApplication.getOrganizationName());
		inputText(loanApplication.getOrganizationName(), "Edufinorganization");
		LoadingTime();

		// select Employed Since
		inputText(loanApplication.getEmployedSince(), "2024-04-03");
		LoadingTime();

		// select Occupation Type
		buttonClick(loanApplication.getOccupationType());
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		// select Business Constitution
		buttonClick(loanApplication.getBusinessConstitution());
		LoadingTime();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// select Designation
		clear(loanApplication.getDesignation());
		inputText(loanApplication.getDesignation(), "Tester");
		LoadingTime();

		// select Net Monthly Salary
		clear(loanApplication.getNetMonthlySalary());
		inputText(loanApplication.getNetMonthlySalary(), "25000");
		LoadingTime();

		// Enter office address
		inputText(loanApplication.getOfficeAddress(), "23/1, Ground Floor, Cathedral Garden Road, Nungambakkam.");

		buttonClick(loanApplication.getDown5());
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		buttonClick(loanApplication.getDown6());
		LoadingTime();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		LoadingTime();

		// Enter Office pin code
		inputText(loanApplication.getOfficePincode(), "600056");
		LoadingTime();
		
		buttonClick(loanApplication.getCheckbox2());
		LoadingTime();
		
		buttonClick(loanApplication.getCheckbox3());
		LoadingTime();

		buttonClick(loanApplication.getCheckbox3());
		r.delay(10000);
		buttonClick(loanApplication.getCheckbox3());
		r.delay(10000);
		
		//quit the browser
		quitBrowser();
		BaseClassRec.stopRecord();

	}
}


