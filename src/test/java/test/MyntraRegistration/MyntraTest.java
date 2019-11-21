package test.MyntraRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.Assertion;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class MyntraTest {
	WebDriver driver;
	RegisterOnMyntraBasePage register;
	SignUpPage sign;

	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ankita_Manekar_2018\\Selenium info\\chromedriver.exe");
		//register = PageFactory.initElements(driver, RegisterOnMyntraBasePage.class);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

		// Disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void MyntraRegistration() {
		register = new RegisterOnMyntraBasePage(driver);
		register.HoverOverProfile();
		register.ClickOnSignUpBtn();
//		sign = new SignUpPage(driver);
//		Assert.assertEquals("Signup with Myntra" , sign.VerifyTitle());
//		sign.EnterEmailId("ankita@mailinator.com");
//		sign.EnterPassword("ankita");
//		sign.EnterMobileNumber("8976542310");
//		sign.SelectGender();
	}
	
	@Test
	public void MyntraSignUp() {
		sign = new SignUpPage(driver);
		Assert.assertEquals("Signup with Myntra" , sign.VerifyTitle());
		sign.EnterEmailId("ankita@mailinator.com");
		sign.EnterPassword("ankita");
		sign.EnterMobileNumber("8976542310");
		sign.SelectGender();
	
	}

	@AfterClass
	public void close() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
