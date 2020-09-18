package be.pxl.java.generics.opgave1.opgave_g;

import be.pxl.java.generics.opgave1.*;

public class WorkingPlaceUtility {
	public static <T extends Vehicle & Motorized> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
