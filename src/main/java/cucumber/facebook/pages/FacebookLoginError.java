package cucumber.facebook.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.utitlities.BasePage;

public class FacebookLoginError extends BasePage {
	private static String validationEmailText = "อีเมลที่คุณป้อนไม่ตรงกับบัญชีผู้ใช้ใดๆ สมัครใช้งานบัญชีผู้ใช้";

	@FindBy(css = "._4rbf._53ij")
	WebElement validationEmail;

	public FacebookLoginError(WebDriver driver) {
		super(driver);
	}

	public void testValidationEmail() {
		Assert.assertTrue(validationEmail.isDisplayed());
		Assert.assertEquals(validationEmail.getText(), validationEmailText);
	}
}