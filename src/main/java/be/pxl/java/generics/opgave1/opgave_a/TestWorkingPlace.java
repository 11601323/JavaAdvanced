package be.pxl.java.generics.opgave1.opgave_a;


import be.pxl.java.generics.opgave1.Car;
import be.pxl.java.generics.opgave1.CircularSaw;
import be.pxl.java.generics.opgave1.Motorized;

public class TestWorkingPlace {
	public static void main(String[] args) {
		WorkingPlace<Car> carWorkingPlace = new WorkingPlace<>();
		//WorkingPlace<Bike> bikeWorkingPlace = new WorkingPlace<>();
		//WorkingPlace<Vehicle> vehicleWorkingPlace = new WorkingPlace<>();
		WorkingPlace<CircularSaw> otherWorkPlace = new WorkingPlace<>();
		WorkingPlace<Motorized> motorizedWorkingPlace = new WorkingPlace<>();
	}
}
