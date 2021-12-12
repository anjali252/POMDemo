package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase {

	@FindBy(xpath = "//h1[contains(text(),'Search - phone')]")
	WebElement searchHeader;

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateHeader() {
		return searchHeader.isDisplayed();

	}

}
