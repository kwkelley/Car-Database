//author @ Keane Kelley

public class GreenCar extends Car {

	private String fuelType;

	//Constructor
	public GreenCar(String model, String vehicleClass, int pollutionScore, String fuelType) {

		super(model, vehicleClass, pollutionScore);

		this.fuelType = fuelType;
	}

	//getter
	public String getFuelType() {
		return this.fuelType;
	}

}