package cucumber.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.utitlities.BasePage;

public class EbayHomePage extends BasePage {

	public enum NavigationLink {
		FOLLOWING("Following"), TODAY("Today"), FASHIONS("Fashions"), ELECTRONICS("Electronics");
		
		private String value;
		NavigationLink(String value) {
			this.value = value;			
		}

		public String getValue() {
			return this.value;
		}
	}

	@FindBy(xpath = ".//*[@id='navigationFragment']/div/table/tbody/tr/td[1]/a")
	WebElement navFollowing;
	@FindBy(xpath = ".//*[@id='navigationFragment']/div/table/tbody/tr/td[2]")
	WebElement navToday;
	@FindBy(xpath = ".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a")
	WebElement navFashions;
	@FindBy(xpath = ".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a")
	WebElement navElectronics;

	public EbayHomePage(WebDriver driver) {
		super(driver);
		this.pageUrl ="http://www.ebay.com/";
		this.pageTitle = " Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
	}

	public void clickNavFollowing() {
		clickElement(navFollowing);
	}

	public void clickNavToday() {
		clickNavToday();
	}

	public void clickNavFashions() {
		clickNavFashions();
	}

	public void clickNavElectronics() {
		clickNavElectronics();
	}
	
	public static NavigationLink getNavigationName(String navName) {
		NavigationLink selectNav = null;
		for (NavigationLink mmName : NavigationLink.values()) {
			if (navName.equalsIgnoreCase(mmName.getValue())) {
				selectNav = mmName;
				break;
			}
		}
		return selectNav;
	}

	public void clickNavigationLink(String navName) {
		switch (getNavigationName(navName)) {
		case ELECTRONICS:
			System.out.println("Click Electronics");
			clickNavElectronics();
			break;
		
		case FASHIONS:
			System.out.println("Click Fashion");
			clickNavFashions();
			break;
			
		case FOLLOWING:
			System.out.println("Click Following");
			clickNavFollowing();
			break;
			
		case TODAY:
			System.out.println("Click Today");
			clickNavToday();
			break;
		}
	}
}
