package cucumber.amazon.pages;

import org.openqa.selenium.WebDriver;

import cucumber.utitlities.BasePage;

public class AmazonTodayDealsPage extends BasePage {
	
	public AmazonTodayDealsPage(WebDriver driver) {
		super(driver);
		this.pageTitle="Gold Box Deals | Today's Deals - Amazon.com";
	}
}
