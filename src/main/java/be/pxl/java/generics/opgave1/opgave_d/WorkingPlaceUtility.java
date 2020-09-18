package be.pxl.java.generics.opgave1.opgave_d;

import be.pxl.java.generics.opgave1.*;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<Bike> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
