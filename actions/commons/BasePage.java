package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	// Best practice: Không dùng if else quá nhiều
	@Parameters ("browser")
	@Test
	public void swapBrowser(String browserName) {		
//		if(browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//			driver = new ChromeDriver();	
//		} else if(browserName.equalsIgnoreCase("firefox")) {			
//			System.setProperty("webdriver.gecko.driver", projectPath +  "\\browserDrivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}else if(browserName.equalsIgnoreCase("edge")) {			
//			System.setProperty("webdriver.edge.driver", projectPath +  "\\browserDrivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//		}else {
//			throw new RuntimeException("Please select correct browser name such as: chrome, firefox or edge");
//		}
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath +  "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath +  "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();	
			break;

		default:
			new RuntimeException("Please input correct browser name!");
			break;
		}
		
		System.out.println(browserName);
		System.out.println(driver.toString());		
		driver.quit();
	}
	
	// get browser driver
	public WebDriver getDriverBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath +  "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath +  "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();	
			break;
		default:
			new RuntimeException("Please input correct browser name!");
			break;
		}
		return driver;
	}
}
