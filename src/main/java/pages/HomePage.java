package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name = "search")
	WebElement searchBox;
	@FindBy(className = "input-grp-btn")
	WebElement searchBtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void searchItem(String string) {
		searchBox.sendKeys(string);
		searchBtn.click();
	}
}
