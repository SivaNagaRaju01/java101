package classes_and_methods;

public class Vehicle {
    int passengers;
    double fuelcap;
    double mpg;

    Vehicle(){ //This is a Constructor Used to initialize values to a Vehicle.
        passengers = 6;
        fuelcap = 16;
        mpg = 18;
    }

    double range(){
        double range = fuelcap * mpg;
        return range;
    }

    double fuelneeded(double miles){
        return miles/mpg;
    }
}
