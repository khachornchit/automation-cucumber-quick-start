package cucumber.amazon.pages;

import org.openqa.selenium.WebDriver;

import cucumber.utitlities.BasePage;

public class AmazonSellPage extends BasePage {

	public AmazonSellPage(WebDriver driver) {
		super(driver);
		this.pageTitle= "Amazon.com: Sell Products Online with Selling on Amazon";
	}
}
