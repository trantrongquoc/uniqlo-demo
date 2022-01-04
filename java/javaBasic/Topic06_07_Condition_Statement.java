package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic06_07_Condition_Statement {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	public void conditionTopic() {
		boolean statusT = 5 > 3;
		System.out.println(statusT);
		boolean statusF = 5 < 3; // 5 bé hơn 3 là sai = false
		// statementCondition("chrome");
		// Hàm if chỉ nhận một điều kiện đúng
		// Kiểm tra duy nhất một điều kiện
		// Thỏa điều kiện sẽ xử lý trong phần thân
		if(statusT) {
			// Đúng điều kiện thì vào đây xử lý
			System.out.println("Go to if block");
		}else {
			System.out.println("Go to else block");
		}
		
		// Kết hợp toán tử vào biểu thức điều kiện
		if(statusT == true && statusF == true ) {
			System.out.println("Go to if block");
		}else {
			System.out.println("Go to else block, because: It is not match with conditions above!");
		}
	}
	
	
	// Statement: for instance: switch condition method with condition is a browser name
	public void statementCondition(String browserName) {		
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
	}
	
	// For instance: Nhập số từ console và print text on console, dùng switch case
	
	public void showDayNumberBelongToMonth() {
		System.out.println("Bạn hãy nhập số của một tháng bất kì:");
		int month = scanner.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println("Bạn đã nhập tháng " + month + ", tháng này có 31 ngày !!");
			break;
		case 2:
			System.out.println("Bạn đã nhập tháng 2, tháng này có 28 ngày or 29 ngày !!");
			break;
		case 4:
		case 6:
		case 9:
		case 11:		
			System.out.println("Bạn đã nhập tháng " + month + ", tháng này có 30 ngày !!");
			break;
		
		default:
			System.out.println("Tháng bạn nhập không tồn tại, vui lòng nhập lại !!");
			break;
		}
	}
	
}
