package EdufinLoan2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanApplicationDetailsPage extends BaseClass {

	public LoanApplicationDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='applicantsFatherName']")
	private WebElement applicantsFatherName;
	
	@FindBy(xpath="//input[@id='panNo']")
	private WebElement panNo;
	
	@FindBy(xpath="//input[@id='empDOB']")
	private WebElement empDOB;
	
	@FindBy(xpath="//div[text()='Relationship Type']//following-sibling::div")
	private WebElement RelationshipType;
	
	@FindBy(xpath="(//div[@class=' css-19bb58m'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//div[@class=' css-hlgwow'])[3]")
	private WebElement marritalStatus;
	
	@FindBy(xpath="//input[@id='bankAccountNo']")
	private WebElement AccountNo;
	
	@FindBy(xpath="(//div[@class=' css-hlgwow'])[4]")
	private WebElement bankName;
	
	@FindBy(xpath="(//input[@id='ifscCode'])")
	private WebElement IFSCcode;
	
	@FindBy(xpath="(//div[text()='Account Type']//following::input)[1]")
	private WebElement AccountType;
	
	@FindBy(xpath="(//*[@class='text-primary'])[3]")
	private WebElement down1;
	
	@FindBy(xpath="//*[@id='emiTenure']")
	private WebElement emiTenure;
	
	@FindBy(xpath="(//*[@class='card-footer d-flex justify-content-center'])[1]")
	private WebElement down2;
	
	@FindBy(xpath="(//*[@class='btn btn-primary'])[1]")
	private WebElement emi;
	
	@FindBy(xpath="(//*[@class='text-primary'])[4]")
	private WebElement down3;
	
	@FindBy(xpath="(//div[@class=' css-hlgwow'])[6]")
	private WebElement address;
	
	@FindBy(xpath="//*[@id='residenceAddress']")
	private WebElement residenceAddress;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[7]")
	private WebElement dropDown1;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[8]")
	private WebElement dropDown2;
	
	@FindBy(xpath="//*[@id='pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="(//*[@class='text-primary'])[6]")
	private WebElement down4;
	
	@FindBy(xpath="//*[@id='flexSwitchCheckDefault']")
	private WebElement icon;
	
	@FindBy(xpath="//*[@id='organizationName']")
	private WebElement organizationName;
	
	@FindBy(xpath="//*[@id='employedSince']")
	private WebElement employedSince;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[11]")
	private WebElement OccupationType ;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[12]")
	private WebElement BusinessConstitution;
	
	@FindBy(xpath="//*[@id='designation']")
	private WebElement Designation;
	
	@FindBy(xpath="//*[@id='netMonthlySalary']")
	private WebElement netMonthlySalary;
	
	@FindBy(xpath="//*[@id='officeAddress']")
	private WebElement officeAddress;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[13]")
	private WebElement down5;
	
	@FindBy(xpath="(//*[@class='css-8mmkcg'])[14]")
	private WebElement down6;
	
	@FindBy(xpath="//*[@id='officePincode']")
	private WebElement officePincode;
	
	@FindBy(xpath="(//*[@type='checkbox'])[2]")
	private WebElement checkbox2;
	
	@FindBy(xpath="(//*[@type='checkbox'])[3]")
	private WebElement checkbox3;
	
	@FindBy(xpath="(//*[@class='btn btn-primary btn-sm'])[2]")
	private WebElement box2;
	
	@FindBy(xpath="(//*[@class='btn btn-sm btn-primary'])[1]")
	private WebElement box3;

	public WebElement getName() {
		return name;
	}

	public WebElement getApplicantsFatherName() {
		return applicantsFatherName;
	}

	public WebElement getPanNo() {
		return panNo;
	}

	public WebElement getEmpDOB() {
		return empDOB;
	}

	public WebElement getRelationshipType() {
		return RelationshipType;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMarritalStatus() {
		return marritalStatus;
	}

	public WebElement getAccountNo() {
		return AccountNo;
	}

	public WebElement getBankName() {
		return bankName;
	}

	public WebElement getIFSCcode() {
		return IFSCcode;
	}

	public WebElement getAccountType() {
		return AccountType;
	}

	public WebElement getDown1() {
		return down1;
	}

	public WebElement getEmiTenure() {
		return emiTenure;
	}

	public WebElement getDown2() {
		return down2;
	}

	public WebElement getEmi() {
		return emi;
	}

	public WebElement getDown3() {
		return down3;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getResidenceAddress() {
		return residenceAddress;
	}

	public WebElement getDropDown1() {
		return dropDown1;
	}

	public WebElement getDropDown2() {
		return dropDown2;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getDown4() {
		return down4;
	}

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getEmployedSince() {
		return employedSince;
	}

	public WebElement getOccupationType() {
		return OccupationType;
	}

	public WebElement getBusinessConstitution() {
		return BusinessConstitution;
	}

	public WebElement getDesignation() {
		return Designation;
	}

	public WebElement getNetMonthlySalary() {
		return netMonthlySalary;
	}

	public WebElement getOfficeAddress() {
		return officeAddress;
	}

	public WebElement getDown5() {
		return down5;
	}

	public WebElement getDown6() {
		return down6;
	}

	public WebElement getOfficePincode() {
		return officePincode;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}

	public WebElement getBox2() {
		return box2;
	}

	public WebElement getBox3() {
		return box3;
	}
	
	
	
}


