package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void openPageUrl(WebDriver driver, String pageUrl) {
		driver.get(pageUrl);
	}

	public void clickElement(WebDriver driver, String xpathLocator) {
		getElement(driver, xpathLocator).click();
	}

	public void inputTextToElement(WebDriver driver, String xpathLocator, String textInput) {
		WebElement element = getElement(driver, xpathLocator);
		element.clear();
		element.sendKeys(textInput);
	}

	public String getTextElement(WebDriver driver, String xpathLocator) {
		return getElement(driver, xpathLocator).getText();
	}

	public WebElement getElement(WebDriver driver, String xpathLocator) {
		return driver.findElement(getByXpath(xpathLocator));
	}

	public By getByXpath(String xpathLocator) {
		return By.xpath(xpathLocator);
	}

	public void waitElementVisible(WebDriver driver, String xpathLocator) {
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(xpathLocator)));
	}
}
