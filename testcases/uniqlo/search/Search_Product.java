package uniqlo.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;

public class Search_Product extends BasePage {
	private WebDriver driver;
	private HomePageObject homePage;
	JavascriptExecutor jsExecutor;
	WebDriverWait explicitWait;
	String projectPath = System.getProperty("user.dir");
	String searchValue = "Áo";

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new HomePageObject(driver);
		jsExecutor = (JavascriptExecutor) driver;
		explicitWait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.uniqlo.com/vn/vi/");
	}

	public void searchProductWithText() {
		homePage.inputToSearchTextBox(searchValue);
		sleepInSecond(3);
		Assert.assertEquals(homePage.getTextInputFromSearchTextbox(), searchValue);
	}

	@Test
	public void searchProduct() {
		homePage.inputToSearchTextBox(searchValue);
		sleepInSecond(2);

		String numberOfProductFound = driver.findElement(By.xpath("//div[@class='fr-form-label']")).getText();
		String[] number = numberOfProductFound.split(" ", 2);
		int numberResult = Integer.parseInt(number[0]);
		By itemProductList = By.xpath("//div[@class='info']");
		By loadMoreButton = By.xpath("//span[@class='text']");
		driver.findElement(By.xpath("//div[@class='close']//button[@type='button']")).click();

		for (int i = 1; i < numberResult; i++) {
			jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(itemProductList));
			Boolean check = driver.findElements(loadMoreButton).size() > 0;
			if (check.equals(true)) {
				jsExecutor.executeScript("arguments[0].click()", driver.findElement(loadMoreButton));
			} else {
				break;
			}
		}

		int countOne = 0;
		int countTwo = 0;
		List<WebElement> allItems = driver.findElements(itemProductList);

		for (WebElement item : allItems) {
			String[] productInfo = item.getText().split("\n");
			if (productInfo[2].contains(searchValue)) {
				countOne += 1;
			} else {
				countTwo += 1;
			}
		}

		System.out.println("Total product display: " + allItems.size());
		System.out.println("Product card description has contain " + searchValue + " in total = " + countOne);
		System.out.println("Product card description has NOT contain " + searchValue + " in total = " + countTwo);
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
