package test.MyntraRegistration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterOnMyntraBasePage {
	public WebDriver driver;

	public RegisterOnMyntraBasePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUpBtn;

	public RegisterOnMyntraBasePage HoverOverProfile(){
		Actions action = new Actions(driver);
		// Thread.sleep(3000);
		action.moveToElement(profile).build().perform();
		return this;
	}
	
	public SignUpPage ClickOnSignUpBtn() {
		signUpBtn.click();
		return new SignUpPage(driver);
	}
}
