package nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class User_01_Register {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String emailAddress;
	String Password = "Test@123456";
	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://demo.nopcommerce.com/");
		emailAddress = "afc" + randomNumber() + "@yahoo.com"; 
	}

	
	public void TC_01_Register_Empty_Data() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	
	public void TC_02_Register_Invalid_Email() {
	}
	
	@Test
	public void TC_03_Register_Success() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-male")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("AFC");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Automation");
		driver.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
		// Password section
		driver.findElement(By.cssSelector("input#Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys(Password);		
		// Register button
		driver.findElement(By.cssSelector("input#register-button")).click(); 
		// Verify message after user register with valid data,
		Assert.assertEquals(driver.findElement(By.cssSelector("div.register-button")).getText(), "Your registration completed");
		// Logout to verify next test case
		driver.findElement(By.cssSelector("a.ico-logout")).click();
	}
	
	@Test
	public void TC_04_Register_Existing_Email() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-male")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("AFC");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Automation");
		// Here, we're using the emailAddress variable. It's designed value at the testcase #3 
		driver.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
		// Password section
		driver.findElement(By.cssSelector("input#Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys(Password);		
		driver.findElement(By.cssSelector("input#register-button")).click(); 
		// Verify message after user register with valid data,
		Assert.assertEquals(driver.findElement(By.cssSelector("div.div.message-error li")).getText(), "The specified email already exists");
	}
	
	@Test
	public void TC_05_Register_Password_Less_Than_Six_Chars() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-male")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("AFC");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Automation");
		// Here, we're using the emailAddress variable. It's designed value at the testcase #3 
		driver.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
		// Password section
		driver.findElement(By.cssSelector("input#Password")).sendKeys("123");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("123");		
		driver.findElement(By.cssSelector("input#register-button")).click(); 
		// Verify message after user register with valid data,
		Assert.assertEquals(driver.findElement(By.cssSelector("div.div.message-error li")).getText(), "Password must meet the following rules:\nmust have at least 6 characters");
	}
	
	public void TC_06_Register_Invalid_Confirm_Password() {
	}

	@AfterClass
	public void afterClass() {
	}
	
	// Create methods to serve this class
	public int randomNumber() {
		Random rad = new Random();
		return rad.nextInt(9999);
	}
}
