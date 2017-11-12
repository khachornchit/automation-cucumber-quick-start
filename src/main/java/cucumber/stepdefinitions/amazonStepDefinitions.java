package cucumber.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.amazon.pages.AmazonGiftCardsRegistryPage;
import cucumber.amazon.pages.AmazonHelpPage;
import cucumber.amazon.pages.AmazonMainPage;
import cucumber.amazon.pages.AmazonSellPage;
import cucumber.amazon.pages.AmazonTodayDealsPage;
import cucumber.amazon.pages.AmazonYourAmazonPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.utitlities.DriverFactory;

public class amazonStepDefinitions {
	public amazonStepDefinitions() throws Exception {
		super();
	}

	private WebDriver driver;
	private AmazonMainPage amazonMainPage;
	private AmazonYourAmazonPage amazonYourAmazonPage;
	private AmazonTodayDealsPage amazonTodayDealsPage;
	private AmazonGiftCardsRegistryPage amazonGiftCardsRegistryPage;
	private AmazonSellPage amazonSellPage;
	private AmazonHelpPage amazonHelpPage;

	@Given("^I open browser with amazon website$")
	public void i_open_browser_with_amazon_website() throws Throwable {
		driver = DriverFactory.getDriver();
		amazonMainPage = PageFactory.initElements(driver, AmazonMainPage.class);
	}

	@Given("^I must load page with correctly page title$")
	public void i_must_load_page_with_correctly_page_title() throws Throwable {
		amazonMainPage.loadPage();
	}

	@Given("^I must find main menu name \"([^\"]*)\"$")
	public void i_must_find_main_menu_name(String mainMenuName) throws Throwable {
		amazonMainPage.foundMainMenuYourAmazon(mainMenuName);
	}

	@When("^I click on main menu \"([^\"]*)\"$")
	public void i_click_on_main_menu(String mainMenuName) throws Throwable {
		AmazonMainPage.MainMenuType selectMenu = AmazonMainPage.getMainMenuType(mainMenuName);
		switch (selectMenu) {
		case YourAmazon:
			amazonYourAmazonPage = amazonMainPage.clickMainMenuYourAmazon();
			break;

		case TodayDeal:
			amazonTodayDealsPage = amazonMainPage.clickMainMenuTodayDeal();
			break;

		case GiftCarsRegister:
			amazonGiftCardsRegistryPage = amazonMainPage.clickMainMenuGiftCarsRegister();
			break;

		case Sell:
			amazonSellPage = amazonMainPage.clickMainMenuSell();
			break;

		case Help:
			amazonHelpPage = amazonMainPage.clickMainMenuHelp();
			break;

		default:
			System.out.println(String.format("Find not main menu name [%s]", mainMenuName));
			Assert.fail();
			break;
		}
	}

	@Then("^It will navigate to \"([^\"]*)\" page and check page title correctly$")
	public void it_will_navigate_to_page_and_check_page_title_correctly(String mainMenuName) throws Throwable {		
		AmazonMainPage.MainMenuType selectMenu = AmazonMainPage.getMainMenuType(mainMenuName);
		switch (selectMenu) {
		case YourAmazon:
			amazonYourAmazonPage.testPageTitle();
			break;

		case TodayDeal:
			amazonTodayDealsPage.testPageTitle();
			break;

		case GiftCarsRegister:
			amazonGiftCardsRegistryPage.testPageTitle();
			break;

		case Sell:
			amazonSellPage.testPageTitle();
			break;

		case Help:
			amazonHelpPage.testPageTitle();
			break;

		default:
			System.out.println(String.format("Find not main menu name [%s]", mainMenuName));
			Assert.fail();
			break;
		}
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.quit();
	}
}
