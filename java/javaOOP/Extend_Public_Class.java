package javaOOP;

import accessModifier.Cars_Public_Class;

public class Extend_Public_Class extends Cars_Public_Class {
	// Có thể extends một public class khác package, bằng cách import "package.class"
	// Khác package thì không thể extend một default class

	// Sau khi extends một class (đang khác package) thì có thể dùng những method trong Class đó
	// Gọi một public method từ một package khác
	@Override
	public void showBrandCar() {
		// TODO Auto-generated method stub
		super.showBrandCar();
	}

	// Gọi một protected method từ một package khác
	@Override
	protected void showYearProduct() {
		// TODO Auto-generated method stub
		super.showYearProduct();
	}

}
