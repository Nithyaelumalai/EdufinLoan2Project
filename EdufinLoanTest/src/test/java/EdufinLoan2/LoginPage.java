package EdufinLoan2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Apply now '])[1]")
	private WebElement applyNow1;
	
	@FindBy(xpath="(//a[text()='Apply Now'])[2]")
	private WebElement applyNow2;
	
	@FindBy(xpath="//*[@class='css-8mmkcg']")
	private WebElement language;
	
	@FindBy(xpath ="//*[@class='form-control']")
	private WebElement phoneNo;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath ="//*[@id='number']")
	private WebElement otpField;
	
	@FindBy(xpath ="(//*[text()='Verify OTP'])[2]")
	private WebElement VerifyOTP;
	
	
	public WebElement getApplyNow1() {
		return applyNow1;
	}

	public WebElement getApplyNow2() {
		return applyNow2;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getOtpField() {
		return otpField;
	}

	public WebElement getVerifyOTP() {
		return VerifyOTP;
	}
	
	
}


