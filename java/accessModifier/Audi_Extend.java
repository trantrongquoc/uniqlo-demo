package accessModifier;

public class Audi_Extend extends Cars_Public_Class {

	String audiColor = "Black";

	// Đang extend một public class cùng package
	@Override
	public void showBrandCar() {
		// TODO Auto-generated method stub
		super.showBrandCar();
	}

	@Override
	protected void showYearProduct() {
		// TODO Auto-generated method stub
		super.showYearProduct();
	}

	@Override
	void showPowerCar() {
		// TODO Auto-generated method stub
		super.showPowerCar();
	}

}
