package accessModifier;

public class Cars_Public_Class {
	// Property
	private String brandCar;
	int yearProduct;
	protected String powerCar;
	public String colorCar;

	// Contractor

	// Method
	public void showBrandCar() {
		System.out.println("I am private method" + brandCar);
	}

	protected void showYearProduct() {

	}

	// Đây là default method
	void showPowerCar() {

	}

	private void showColorCar() {

	}
}
