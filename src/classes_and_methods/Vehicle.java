package classes_and_methods;

public class Vehicle {
    int passengers;
    double fuelcap;
    double mpg;

    Vehicle(int x, double y, double z){ //This is a Constructor Used to initialize values to a Vehicle.
        passengers = x;
        fuelcap = y;
        mpg = z;
    }

    double range(){
        double range = fuelcap * mpg;
        return range;
    }

    double fuelneeded(double miles){
        return miles/mpg;
    }
}
