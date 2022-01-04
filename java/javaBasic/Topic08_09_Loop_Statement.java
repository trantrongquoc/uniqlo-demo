package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Topic08_09_Loop_Statement {
	// for & foreach: loop method
	
	public void loopExample() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Number = " + i);
		}
	}
	
	// Có 3 vế từ trái sang phải như sau
	// Vế 1: int i = 0 tạo biến tạm gán giá trị 0 cho biến để so sánh với vế 2 (tổng giá trị)
	// Vế 2: i < size number . Điều kiện so sánh i <= 10, true thì chạy tiếp false thì dừng
	// Vế 3: i++ ở đây như là tăng i lên 1 đơn vị sau khi chạy vào vòng thân của for	
	public void showCityName() {
		String[] cityName = {"Hà Nội", "Đà Nẵng", "Hồ Chí Minh", "Cần Thơ", "Cà Mau", "New York"};
		System.out.println("Tổng số thành phố hiện có trong mảng String: " + cityName.length);
		for (int i = 0; i < cityName.length; i++) {	
			if(!cityName[i].equals("New York")) {
				System.out.println("Thành phố: " + cityName[i].toString());
			}else{
				System.out.println("Có một tên thành phố không thuộc Việt Nam: " + cityName[i]);
			}
		}
	}
	
	@Test
	public void Topic02() {
		String[] cityName = {"Hà Nội", "Đà Nẵng", "Hồ Chí Minh", "Cần Thơ", "Cà Mau", "New York"};
		// Java Collection
		// Class: ArrayList 
		// Interface: List
		System.out.println("Tổng số cityName ban đầu " + cityName.length);
		List<String> arrayAddress = new ArrayList<String>(); // Cách viết Java Generic
		// Add lúc runtime
		for (String value : cityName) {
			arrayAddress.add(value);
		}
		
		System.out.println("Tổng số arrayAddress ban đầu " + arrayAddress.size());
		// Add lúc viết code combine
		arrayAddress.add("Cao Bằng");
		System.out.println("Tổng số arrayAddress sau khi add thêm " + arrayAddress.size());	
		// Dùng foreach duyệt mảng
		for (String value : arrayAddress) {
			if(!value.equals("New York")) {
				System.out.println("Thành phố thuộc Việt Nam: " + value);
			}
		}
	}
}
