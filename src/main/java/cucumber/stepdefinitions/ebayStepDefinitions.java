package cucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.ebay.pages.EbayElectronicsPage;
import cucumber.ebay.pages.EbayFashionPage;
import cucumber.ebay.pages.EbayHomePage;
import cucumber.utitlities.DriverFactory;

public class ebayStepDefinitions {
	private WebDriver driver;
	private EbayHomePage ebayHomePage;
	private EbayFashionPage ebayFashionPage;
	private EbayElectronicsPage ebayElectronicsPage;

	@Given("^I browse ebay website till page load finish$")
	public void i_browse_ebay_website_till_page_load_finish() throws Throwable {
		driver = DriverFactory.getDriver();
		ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
		ebayHomePage.loadPage();
	}

	@When("^I click on navigation link name \"([^\"]*)\"$")
	public void i_click_on_navigation_link_name_navigationName(String navName) throws Throwable {
		ebayHomePage.clickNavigationLink(navName);
	}

	@Then("^It will navigate to correct page tile$")
	public void it_will_navigate_to_correct_page_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I close the ebay website$")
	public void i_close_the_ebay_website() throws Throwable {
		driver.quit();
	}

}
