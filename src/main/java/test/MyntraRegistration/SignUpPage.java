package test.MyntraRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@class='register-user-input-email register-user-input']")
	private WebElement emailId;

	// @FindBy(xpath = "//button[@class='register-facebook register-button']")
	// private WebElement e;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//p[@class='register-title']")
	private WebElement signUpTitle;

	@FindBy(xpath = "//input[@type='number']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//input[@id='female']")
	private WebElement gender;

	public String VerifyTitle() {
		String Title = signUpTitle.getText();
		return Title;

	}

	public SignUpPage EnterEmailId(String email) {
		emailId.click();
		emailId.sendKeys(email);
		return this;
	}

	public SignUpPage EnterPassword(String pass) {
		//password.click();
		password.sendKeys(pass);
		return this;
	}

	public SignUpPage EnterMobileNumber(String  number) {
		mobileNo.sendKeys(number);
		return this;
	}
	
	public SignUpPage SelectGender() {
		gender.click();
		return this;
		

}
}