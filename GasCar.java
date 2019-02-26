//author @ Keane Kelley

public class GasCar extends Car {

	private int numberCylinders;
	private int mpg;

	//Constructor
	public GasCar(String model, String vehicleClass, int pollutionScore, int numberCylinders, int mpg) {
		super(model, vehicleClass, pollutionScore);

		this.numberCylinders = numberCylinders;
		this.mpg = mpg;
	}

	//getters
	public int getNumberCylinders() {
		return this.numberCylinders;
	}

	public int getMpg() {

		return this.mpg;
	}

}