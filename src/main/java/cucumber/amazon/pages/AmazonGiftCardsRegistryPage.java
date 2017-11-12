package cucumber.amazon.pages;

import org.openqa.selenium.WebDriver;

import cucumber.utitlities.BasePage;

public class AmazonGiftCardsRegistryPage extends BasePage  {

	public AmazonGiftCardsRegistryPage(WebDriver driver) {
		super(driver);
		this.pageTitle = "Gift Cards & Registry @ Amazon.com";
	}
}
