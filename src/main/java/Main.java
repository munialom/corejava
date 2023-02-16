public class Main {
    private  static int milesPerGallon=20;
    private  static double gallonsOfGas=10.0;
    private  static int odometer=0;

    public static void main(String[] args) {
      

        drive(50);
    }

    private static void drive(int milesDriven) {

        odometer +=milesDriven;
        gallonsOfGas=gallonsOfGas-(milesDriven/milesPerGallon);
        System.out.println("Odometer  "+odometer + "Gallons of gas "+ gallonsOfGas );
    }
}
