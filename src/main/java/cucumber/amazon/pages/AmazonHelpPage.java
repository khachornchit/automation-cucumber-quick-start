package cucumber.amazon.pages;

import org.openqa.selenium.WebDriver;

import cucumber.utitlities.BasePage;

public class AmazonHelpPage extends BasePage {

	public AmazonHelpPage(WebDriver driver) {
		super(driver);
		this.pageTitle = "Amazon.com Help";
	}
}