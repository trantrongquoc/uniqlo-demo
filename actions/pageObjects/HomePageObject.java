package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {

	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToSearchTextBox(String value) {
		waitElementVisible(driver, HomePageUI.SEARCH_TEXTBOX);
		inputTextToElement(driver, HomePageUI.SEARCH_TEXTBOX, value);
		clickElement(driver, HomePageUI.SEARCH_ICON);
	}

	public String getTextInputFromSearchTextbox() {
		waitElementVisible(driver, HomePageUI.SEARCH_RESULT_TEXT);
		return getTextElement(driver, HomePageUI.SEARCH_RESULT_TEXT);
	}

	public String getNumberSearch() {
		waitElementVisible(driver, HomePageUI.SEARCH_RESULT_NUMBER);
		return getTextElement(driver, HomePageUI.SEARCH_RESULT_NUMBER);
	}
}
