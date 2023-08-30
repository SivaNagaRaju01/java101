package classes_and_methods;

public class VehicleDemo {
    public static void main(String args[]) {
        // -> Here We dynamically assigned Values to instance variables using parameterized Constructor.
        Vehicle minivan = new Vehicle(6, 16, 18);
        Vehicle sportscar = new Vehicle(2, 12, 12);
        double miles = 318;

        double range = minivan.range();
        double minivanfuel = minivan.fuelneeded(miles);
        double range2 = sportscar.range();
        double s_carfuel = sportscar.fuelneeded(miles);

        System.out.println("The Minivan can carry upto "+minivan.passengers+" passengers with a Range of "+range+" Miles.");
        System.out.println("The Fuel needed for minivan to Complete the trip of "+miles+" miles is "+minivanfuel+" Gallons");        

        System.out.println("\nThe SportsCar can carry upto "+sportscar.passengers+" passengers with a Range of "+range2+" Miles.");
        System.out.println("The Fuel needed for sports car to Complete the trip of "+miles+" miles is "+s_carfuel+" Gallons");
    }
}
