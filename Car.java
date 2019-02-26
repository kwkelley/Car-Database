//author @ Keane Kelley

public abstract class Car implements Comparable<Car> {

	protected String model;
	protected String vehicleClass;
	protected int pollutionScore;

	//Constructor
	public Car(String model, String vehicleClass, int pollutionScore) {

		this.model = model;
		this.vehicleClass = vehicleClass;
		this.pollutionScore = pollutionScore;
	}

	//Getters
	public String getModel() {
		return this.model;

	}

	public String getVehicleClass() {
		return this.vehicleClass;
	}

	public int getPollutionScore() {
		return this.pollutionScore;
	}

	//method to sort cars first by pollution score least to greatest
	//if scores are the same then sort model alphabetically 
	public int compareTo(Car other) {

		if(this.pollutionScore != other.pollutionScore) {

			return this.pollutionScore - other.pollutionScore;

		}
		return this.model.compareTo(other.model);
	}

}