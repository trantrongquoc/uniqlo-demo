package uniqlo.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;

public class Search_Product extends BasePage {
	private WebDriver driver;
	private HomePageObject homePage;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new HomePageObject(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.uniqlo.com/vn/vi/");
	}

	@Test
	public void searchProductWithText() {
		homePage.inputToSearchTextBox("Áo");
		sleepInSecond(3);
		Assert.assertEquals(homePage.getTextInputFromSearchTextbox(), "Áo");
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

	public void sleepInSecond(int sleep) {
		try {
			Thread.sleep(sleep * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
