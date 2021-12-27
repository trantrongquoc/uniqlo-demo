package javaBasic;

public class Topic04_05_Operator_Casting {	
	public static void main(String[] args) {
		int number = 10;
		number += 5; // Sẽ bằng number = number + 5;
		//System.out.println(number);
		// Chia lấy phần nguyên 15 / 6 = 2.5
		//System.out.println(number / 6); // Kết quả = 2
		
		// Chia lấy phần dư 15 / 7 = 2,1428.
		//System.out.println(number % 7); // Kết quả = 1
		
		System.out.println(number++);
		// In ra màn hình 15
		// Cộng cho number + 1 = 16 ( Ko in ra màn hình chỉ cộng vào biến )
		
		System.out.println(number--);
		// In ra màn hình number = 16
		// Trừ cho number - 1 = 15 ( Ko in ra màn hình chỉ trừ vào biến )
		
		System.out.println(number);
		
		// Đừng vết bad/dead code
//		if(false) {
//			
//		}
		
		// Dùng phủ định lại một điều kiện
		String address = "Ho Chi Minh";
		if(!(address == "Ha Noi")) {
			System.out.println("Address is not correct");
		}
		
		// Biểu thức tam nguyên ba điều kiện, ba dấu = ? :
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status); // In ra = false
		
		// Execercise swapNumber, có a = 6 và b = 5, swap value sao cho a = 5 và b = 6 mà không tạo thêm biến
		int a = 6;
		int b = 5;
		
		a = a + b;		
		b = a - b;
		a = a - b;
		System.out.println("Giá trị của b = " + b);
		System.out.println("Giá trị của a = " + a);
		
		// Ví dụ casting
		byte bNumber = 123;
		System.out.println(bNumber);
		// Ép kiểu ngầm định, không mất dữ liệu, exten vùng nhớ
		short sNumber = bNumber;
		System.out.println(sNumber);
		
		// Casting tường minh, lấy giá trị lớn bỏ vào vùng nhớ nhỏ hơn bị mất giá trị gốc
		double dNumber = 68901123456d;
		System.out.println(dNumber);
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		// Không mất giá trị ban đầu
		long lNumber = (long) dNumber;
		System.out.println(lNumber);
		
	}
}
