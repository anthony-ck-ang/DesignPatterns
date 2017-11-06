package com.anthonyang;

public class Iphone {
	private int model = 67890;
	// has no access and does not implement Android
	// is not compatible and cannot be used by User.
	public void someMethod() {

	}
	@Override
	public String toString() {
		return "Iphone [model=" + model + "]";
	}

}
