package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic01_02_Variable_DataType {
	// Global variable: Declare here	
	// Primitive Type: Kiểu dữ liệu nguyên thủy, Bên dưới là kiểu số thực
//	byte bNumner;
//	short sNumber;
//	static int studentNumber;	// Static variables is used within static method	
//	long lNumber;
//	
//	// Kiểu số nguyên có phần thập phân
//	float fNumber = 1.2f; // Khai báo với phần đuôi đại diện kí tự cho tên biến để dễ phân biệt, khai báo cùng lúc nó báo lỗi
//	double dNumber = 1.2d; 
//	char cChar = '1'; // Chỉ biểu diễn một kí tự
//	boolean bStatus; 
//		
//	// Reference Type ( Non Primitive )
//	String studentClub = "Automation FC";
//	// Array
//	String[] studentInfo = {"Name", "DOB", "Address" };
//	Integer[] studentScores = {5,6,7,8,9};
//	// Class
//	Topic01_02_Variable_DataType topic;
//	// Interface
//	WebDriver driver;
//	// Object
//	Object object;	
//	// Collection
//	// List/ Set/ Queue/ Map
//	List<WebElement> getList = driver.findElements(By.cssSelector(""));
//	Set<String> windowList = driver.getWindowHandles();
//	
//	List<String> listString = new ArrayList<String>();
	
	int number = 8;
	
	public static void main(String[] args) {
		// Local variables
		//int studentNumber = 3;
		//byte bNumner = 1;
		//System.out.println(studentNumber);
		//System.out.println(bNumner);
		
		// Can't not reference because variable is not static
		//System.out.println(studentClub);
		
		// Ví dụ về kiểu dữ liệu nguyên thủy và tham chiếu
		int x = 5;
		int y = x;
		
		System.out.println("Number x: = " + x);
		System.out.println("Number y: = " + x);
		
		Topic01_02_Variable_DataType referVariableA = new Topic01_02_Variable_DataType();
		Topic01_02_Variable_DataType referVariableB = referVariableA;
		referVariableB.number = 20;
		
		System.out.println("Number VariableA: = " + referVariableA.number);
		System.out.println("Number VariableB: = " + referVariableB.number);
		
		
	}
	
	// Getter: getCurrentUrl, getTitle 
//	public String getStudentClub() {
//		return this.studentClub;
//	}
//	
//	// Setter: click()
//	public void setStudentClub(String stdName) {
//		this.studentClub = stdName;
//	}
//	
//	// Ví dụ về kiểu dữ liệu	
//	public void variableReferenceType() {
//		// Kiểu dữ liệu tham chiếu có hàm
//		studentClub.trim();
//		studentInfo.clone();	
//	}
}
