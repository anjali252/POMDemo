package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase {

	HomePage homePage;
	SearchResultPage searchResultPage;
	// IPhonePage iPhonePage;

	public PlaceOrderTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		initialize();
		homePage = new HomePage();
		// searchResultPage = new SearchResultPage();
	}

	@Test(priority = 1)
	public void validatePageTitle() {
		String pageTitle = homePage.getPageTitle();
		Assert.assertEquals(pageTitle, "Your Store");
	}

	@Test(priority = 3)
	public void resultHeaderTest() {
		boolean isPresent = searchResultPage.validateHeader();
		Assert.assertTrue(isPresent);
	}

	// @Test(priority = 4)
	// public void clickOnResult() {
	// iPhonePage = SearchResultPage.clickOnPhone();
	// Assert.assertTrue(iPhonePage.validateTitle());
	// }

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
