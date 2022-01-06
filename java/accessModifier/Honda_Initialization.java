package accessModifier;

import javaOOP.CarCenter;

public class Honda_Initialization {
	// Khởi tạo thông qua new class, initialize
	Cars_Public_Class car = new Cars_Public_Class();
	Final_Class spCar = new Final_Class();
	// Khởi tạo một default class
	Default_Class df = new Default_Class();
	// Không thể Khởi tạo một abtract class
	// An_Abtract_Class abtract = new An_Abtract_Class();

	// Khởi tạo một class khác package
	CarCenter carCenter = new CarCenter();

	public void Call_Public_Class() {
		// Không gọi đc method showColorCar(), vì nó là private method
		car.showBrandCar(); // từ khóa public
		car.showPowerCar(); // từ khóa default
		car.showYearProduct(); // từ khóa protected
		// After initializing Cars class, Can NOT access brandCar, It is private variable
		System.out.println(car.yearProduct); // từ khóa default
		System.out.println(car.powerCar); // từ khóa protected
		System.out.println(car.colorCar); // từ khóa public
	}

	// Gọi method or biến từ một "default" class
	public void Call_Default_Class() {
		df.Public_Method();
		df.Protected_Method();
		df.Default_Method();
		// gọi method, ko gọi đc private method
		// dfMotobike.showColorMotobike();
		// Hoặc có thể gọi biến
		System.out.println(df.colorDefault);
	}

	// Gọi method or biến từ một (public or default) "final" class thì như nhau
	public void Call_Final_Class() {
		spCar.Protected_Method();
		spCar.Protected_Method();
		spCar.Default_Method();
		// gọi method, ko gọi đc private method
		// spCar.showFinalColorCar();

		// gọi biến, ko gọi đc rpivate variable
		System.out.println(spCar.yearSuperFinal);
	}

	public void Call_Different_Package() {
		// Không call varibale hay method từ class khác package
	}
}
