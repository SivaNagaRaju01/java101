package classes_and_methods;

public class obj_reference {
    public static void main(String args[]) {
        Vehicle auto = new Vehicle(0,0,0);
        Vehicle x = new Vehicle(0,0,0);
        Vehicle bike = new Vehicle(0,0,0);

        x = auto;

        auto.passengers = 6;
        auto.fuelcap = 16;
        x.mpg = 22;

        System.out.println("x.passengers = "+x.passengers);
        System.out.println("x.fuelcap = "+x.fuelcap);
        System.out.println("auto.mpg = "+auto.mpg);

        x = bike;

        x.passengers = 2;

        System.out.println("auto.passengers = "+auto.passengers);
        System.out.println("bike.passengers = "+bike.passengers);
    }
}
