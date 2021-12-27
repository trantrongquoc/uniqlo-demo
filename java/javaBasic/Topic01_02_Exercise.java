package javaBasic;

import org.testng.annotations.Test;

public class Topic01_02_Exercise {
	@Test
	public void Topic01(){
		int a = 6;
		int b = 2;
		
		System.out.println("Tổng của a và b =  " + (a + b));
		System.out.println("Hiệu của a và b = " + (a - b));
		System.out.println("Tích của a và b = " + (a * b));
		System.out.println("Thương của a và b = " + (a / b));
	}
	
	@Test
	public void Topic02() {
		// Tính diện tích chữ nhật
		float width = 7.5f;
		float height = 3.8f;
		
		System.out.println("S of rectangle = " + (width * height));
	}
}
