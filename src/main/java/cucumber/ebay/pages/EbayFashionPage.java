package cucumber.ebay.pages;

import org.openqa.selenium.WebDriver;

import cucumber.utitlities.BasePage;

public class EbayFashionPage extends BasePage  {

	public EbayFashionPage(WebDriver driver) {
		super(driver);
		this.pageUrl="http://www.ebay.com/";
	}

}
