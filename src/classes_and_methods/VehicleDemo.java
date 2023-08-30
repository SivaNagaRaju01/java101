package classes_and_methods;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double miles = 318;

        /*minivan.passengers = 6;  -> Here The Data for Minivan Are automatically assigned.
        minivan.fuelcap = 16;
        minivan.mpg = 18;*/

        sportscar.passengers = 2; //-> Here We Changed the Default Assignment.
        sportscar.fuelcap = 12;
        sportscar.mpg = 12;

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
