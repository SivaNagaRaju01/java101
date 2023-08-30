package classes_and_methods;

public class Vehicle {
    int passengers;
    double fuelcap;
    double mpg;

    double range(){
        double range = fuelcap * mpg;
        return range;
    }
}
