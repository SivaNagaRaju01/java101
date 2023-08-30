package classes_and_methods;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 6;
        minivan.fuelcap = 16;
        minivan.mpg = 18;

        sportscar.passengers = 2;
        sportscar.fuelcap = 12;
        sportscar.mpg = 12;

        double range = minivan.range();
        double range2 = sportscar.range();

        System.out.println("The Minivan can carry upto "+minivan.passengers+" passengers with a Range of "+range+" Miles.");
        System.out.println("The SportsCar can carry upto "+sportscar.passengers+" passengers with a Range of "+range2+" Miles.");
    }
}
