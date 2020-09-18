package be.pxl.java.generics.opgave1.opgave_c;

import be.pxl.java.generics.opgave1.*;

public class WorkingPlace<T extends Vehicle & Motorized> {
	private T thingToFix;
	private int numberOfThingsFixed = 0;

	public boolean isEmpty() {
		return thingToFix == null;
	}

	public void startFixing(T vehicle) {
		if (!isEmpty()) {
			System.out.println("Already busy.");
		} else {
			this.thingToFix = vehicle;
		}
	}

	public void finished() {
		thingToFix = null;
		numberOfThingsFixed++;
	}

	public int getNumberOfThingsFixed() {
		return numberOfThingsFixed;
	}

}
