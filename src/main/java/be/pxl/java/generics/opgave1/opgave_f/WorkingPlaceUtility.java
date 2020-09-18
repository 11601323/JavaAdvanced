package be.pxl.java.generics.opgave1.opgave_f;

import be.pxl.java.generics.opgave1.*;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<? extends Motorized> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
