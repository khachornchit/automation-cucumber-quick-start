package cucumber.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.facebook.pages.FacebookLoginPage;
import cucumber.facebook.pages.FacebookMainPage;
import cucumber.facebook.pages.FacebookSignUpPage;
import cucumber.utitlities.DriverFactory;

public class facebookStepDefinitions {
	private WebDriver driver;
	private FacebookLoginPage fbLogin;
	private FacebookMainPage fbMainPage;
	private FacebookSignUpPage fbSignUpPage;

	@Given("^Browse facebook website successfully$")
	public void browse_facebook_website_successfully() throws Throwable {
		driver = DriverFactory.getDriver();
		fbLogin = PageFactory.initElements(driver, FacebookLoginPage.class);
		fbLogin.loadPage();
	}

	@When("^Input email address correctly$")
	public void input_email_address_correctly() throws Throwable {
		fbLogin.setTextEmailCorrect();
	}

	@When("^Input password correctly$")
	public void input_password_correctly() throws Throwable {
		fbLogin.setTextPasswordCorrect();
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		fbLogin.clickLoginButton();
	}

	@Then("^Able to login facebook and see account name label$")
	public void able_to_login_facebook_and_see_account_name_label() throws Throwable {
		fbMainPage = fbLogin.getLoginSuccessfullyPage();
		fbMainPage.testAccountName();
	}

	@Then("^Close facebook website$")
	public void close_facebook_website() throws Throwable {
		driver.quit();
	}

	@When("^Login to facebook successfully$")
	public void login_to_facebook_successfully() throws Throwable {
		fbMainPage = fbLogin.loginCorrect();
	}

	@Then("^Able to click on user navigation menu$")
	public void able_to_click_on_user_navigation_menu() throws Throwable {
		fbMainPage.clickNavigationMenu();
	}

	@Then("^Able to moving mouse to sub menu item Logout$")
	public void able_to_moving_mouse_to_sub_menu_item_Logout() throws Throwable {
		fbMainPage.moveMouseToSubMenuLogout();
	}

	@Then("^Able to click on Logout item$")
	public void able_to_click_on_Logout_item() throws Throwable {
		fbMainPage.clickSubMenuLogout();
	}

	@Given("^Able to redirect page to login page after logout successful$")
	public void able_to_redirect_page_to_login_page_after_logout_successful() throws Throwable {
		FacebookLoginPage fbLoginPageRedirectFromLogout = fbMainPage.returnToLoginPageAfterLogout();
		fbLoginPageRedirectFromLogout.testLogoutRedirectPageSuccessfully();
	}

	@Then("^Able to close facebook website finally$")
	public void able_to_close_facebook_website_finally() throws Throwable {
		driver.close();
	}

	@When("^The user navigation menu is displayed$")
	public void the_user_navigation_menu_is_displayed() throws Throwable {
		fbMainPage.userNavigationMenuIsDisplayed();
	}

	@Then("^Able to moving mouse to each sub menu items one by one$")
	public void able_to_moving_mouse_to_each_sub_menu_items_one_by_one() throws Throwable {
		fbMainPage.moveMouseToSubMenuItemsOneByOne();
	}

	@When("^I key data into each field$")
	public void i_key_data_into_each_field(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();

		String firstName = data.get(1).get(1);
		String lastName = data.get(2).get(1);
		String email = data.get(3).get(1);
		String password = data.get(4).get(1);
		String bDay = data.get(5).get(1);
		String bMonth = data.get(6).get(1);
		String bYear = data.get(7).get(1);
		
		fbSignUpPage = fbLogin.returnFacebookSignUpPage();
		fbSignUpPage.fillSignup(firstName, lastName, email, bDay, bMonth, bYear);
	}
}
