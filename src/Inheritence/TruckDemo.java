package Inheritence;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    int getpassengers() { return passengers; }
    int getfuelcap() { return fuelcap; }
    int getmilage() { return mpg; }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p,f,m);
        cargocap = c;
    }

    int getcargo() { return cargocap; }
}

public class TruckDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry "+semi.getcargo()+" punds.");
        System.out.println("To go "+dist+" miles Semi needs"+gallons+" gallons of fuel.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup Truck can carry "+pickup.getcargo()+" pounds.");
        System.out.println("To go "+dist+" miles pickup truck needs "+gallons+" gallons of fuel.");
    }
}
