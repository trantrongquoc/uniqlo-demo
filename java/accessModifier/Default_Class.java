package accessModifier;

class Default_Class {
	// Không chỉ định access modifier public, private, protected thì nó là "default class"
	private String brandDefault;
	int yearProductDefault;
	protected String powerDefault;
	public String colorDefault;

	public void Public_Method() {

	}

	protected void Protected_Method() {

	}

	// Đây là default method
	void Default_Method() {

	}

	private void Private_Method() {

	}
}
