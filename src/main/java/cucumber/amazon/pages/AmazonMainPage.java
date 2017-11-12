package cucumber.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.utitlities.BasePage;

public class AmazonMainPage extends BasePage {
	
	public static enum MainMenuType {
		YourAmazon("Your Amazon.com"),
		TodayDeal("Today's Deals"),
		GiftCarsRegister("Gift Cards & Registry"),
		Sell("Sell"),
		Help("Help");
		
		private String value;
		
		MainMenuType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return this.value;
		}
	}
	
	@FindBy(xpath = ".//*[@id='nav-your-amazon']") WebElement navYourAmazon;
	@FindBy(xpath = ".//*[@id='nav-xshop']/a[2]") WebElement navTodayDeals;
	@FindBy(xpath = ".//*[@id='nav-xshop']/a[3]") WebElement navGiftCardsRegistry;
	@FindBy(xpath = ".//*[@id='nav-xshop']/a[4]") WebElement navSell;
	@FindBy(xpath = ".//*[@id='nav-xshop']/a[5]") WebElement navHelp;
	
	
	public AmazonMainPage(WebDriver driver) {
		super(driver);
		this.pageUrl = "https://www.amazon.com/";
		this.pageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	}

	public void foundMainMenuYourAmazon(String mainMenuName) {
		WebElement element = getMainMenuElement(mainMenuName);
		Assert.assertTrue(element.isDisplayed());
	}

	private WebElement getMainMenuElement(String mainMenuName) {
		switch (getMainMenuType(mainMenuName)) {
		case YourAmazon:
			return navYourAmazon;
			
		case GiftCarsRegister:
			return navGiftCardsRegistry;
			
		case Help:
			return navHelp;
			
		case Sell:
			return navSell;
			
		case TodayDeal:
			return navTodayDeals;

		default:
			return null;
		}
	}
	
	public static MainMenuType getMainMenuType(String mainMenuName) {
		MainMenuType selectMenu = null;
		for (MainMenuType mmName : MainMenuType.values()) {
			if (mainMenuName.equals(mmName.getValue())) {
				selectMenu = mmName;
			}
		}
		return selectMenu;
	}

	public AmazonYourAmazonPage clickMainMenuYourAmazon() {
		clickElement(navYourAmazon);
		return PageFactory.initElements(driver, AmazonYourAmazonPage.class);
	}

	public AmazonTodayDealsPage clickMainMenuTodayDeal() {
		clickElement(navTodayDeals);
		return PageFactory.initElements(driver, AmazonTodayDealsPage.class);
	}

	public AmazonGiftCardsRegistryPage clickMainMenuGiftCarsRegister() {
		clickElement(navGiftCardsRegistry);
		return PageFactory.initElements(driver, AmazonGiftCardsRegistryPage.class);
	}

	public AmazonSellPage clickMainMenuSell() {
		clickElement(navSell);
		return PageFactory.initElements(driver, AmazonSellPage.class);
	}

	public AmazonHelpPage clickMainMenuHelp() {
		clickElement(navHelp);
		return PageFactory.initElements(driver, AmazonHelpPage.class);
	}	
}
