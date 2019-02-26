//author @ Keane Kelley"
import java.io.PrintStream;

public class CarDBDriver {
  public CarDBDriver() {}
  
  public static void main(String[] paramArrayOfString) {
    CarListBuilder localCarListBuilder = new CarListBuilder();
    
    CarList localCarList = localCarListBuilder.buildCarList(paramArrayOfString[0]);
    
    System.out.println("All Cars:");
    System.out.println(localCarList.toString());
    System.out.println("Green Cars - Fuel Type:");
    System.out.println(localCarList.toStringGreenCars());
    System.out.println("Average MPG All: " + String.format("%.2f", new Object[] { Double.valueOf(localCarList.avgMpg()) }));
    System.out.println();
    System.out.println("Average MPG Subaru: " + String.format("%.2f", new Object[] { Double.valueOf(localCarList.avgMpgByPartialModel("SUBARU")) }));
    System.out.println();
    System.out.println("Average MPG Toyota: " + String.format("%.2f", new Object[] { Double.valueOf(localCarList.avgMpgByPartialModel("TOYOTA")) }));
    System.out.println();
    System.out.println("Average MPG Ferrari: " + String.format("%.2f", new Object[] { Double.valueOf(localCarList.avgMpgByPartialModel("FERRARI")) }));
    System.out.println();
    System.out.println("Vehicle Classes with 4-Cylinder Cars:");
    

    String[] arrayOfString1 = localCarList.findClassesByCylinders(4);
    for (int i = 0; i < arrayOfString1.length; i++) {
      System.out.println("\t" + arrayOfString1[i]);
    }
    
    System.out.println();
    System.out.println("Vehicle Classes with 6-Cylinder Cars:");
    

    String[] arrayOfString2 = localCarList.findClassesByCylinders(6);
    for (int j = 0; j < arrayOfString2.length; j++) {
      System.out.println("\t" + arrayOfString2[j]);
    }
    
    System.out.println();
    System.out.println("Small SUVs with MPG > 22:");
    

    String[] arrayOfString3 = localCarList.findModelsByClassAndMpg("small SUV", 22);
    for (int k = 0; k < arrayOfString3.length; k++) {
      System.out.println("\t" + arrayOfString3[k]);
    }
    
    System.out.println();
    System.out.println("Small Cars with MPG > 35:");
    
    String[] arrayOfString4 = localCarList.findModelsByClassAndMpg("small car", 35);
    for (int m = 0; m < arrayOfString4.length; m++) {
      System.out.println("\t" + arrayOfString4[m]);
    }
  }
}
