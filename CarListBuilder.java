//author @ Keane Kelley
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarListBuilder {
	public CarList buildCarList(String fileInput) {

		//create new instance of CarList
		CarList otherCarList = new CarList();
		File file = new File(fileInput);	//takes in file

		try(Scanner input = new Scanner(file)) {	//reads file
			input.useDelimiter(",|\n");				//skips over commas
			//System.out.println(input.hasNext());
			//while there is a next element continue
		 	while(input.hasNext()) {

		 		String model = input.next();
		 		input.next();
		 		String numberCylinders = input.next();			//takes in as String even though needs an int
		 		int numCyl = 0;
		 		if(!numberCylinders.contains("N/A")) {			//checks if numberCylinders contains N/A and Casts the String to int
		 			numCyl = Integer.parseInt(numberCylinders);
		 		}
		 		input.next();
		 		input.next();
		 		String fuelType = input.next();
		 		input.next();
		 		input.next();
		 		input.next();
		 		input.next();
		 		String vehicleClass = input.next();
		 		int pollutionScore = input.nextInt();
		 		input.next();
		 		input.next();
		 		
		 		String mpg = input.next();
		 		int mpg1 = 0;
		 		if(mpg.contains("/")) {
		 			String[] var = mpg.split("/");
		 			mpg1 = Integer.parseInt(var[0]);
		 			
		 		}
		 		else {
		 			mpg1 = Integer.parseInt(mpg);
		 		}

		 		input.nextLine();
		 		//checks whether to create an instance of GreenCar or GasCar
		 		if(fuelType.equals("Electricity") || fuelType.equals("Hydrogen")) {
		 			Car greenCar = new GreenCar(model, vehicleClass, pollutionScore, fuelType);
		 			otherCarList.addCar(greenCar);
		 		}
		 		else{
		 			Car gasCar = new GasCar(model, vehicleClass, pollutionScore, numCyl, mpg1);
		 			otherCarList.addCar(gasCar);
		 		}

			 }
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		return otherCarList;
	}
}