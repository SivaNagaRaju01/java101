package enumerations;

enum Transport2 {
    BIKE(80, 45), CAR(120, 28), TRUCK(90, 12), TRAIN(180), AIRPLANE(650),  BOAT(160);
    
    private int speed;
    private int milage=1;

    Transport2(int x) {
        speed = x;
    }

    Transport2(int x, int y) {
        speed = x;
        milage = y;
    }

    int getSpeed() {return speed;}
    int getMilage() {return milage;}
}

public class enumConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Typical Speed and Milage of an Airplane "+Transport2.AIRPLANE.getSpeed()+" and "+Transport2.AIRPLANE.getMilage());

        System.out.println("Speeds and Milages of all the Transport Vehicles.");
        for(Transport2 tp : Transport2.values()) {
            System.out.println(tp+": "+tp.getSpeed()+" and "+tp.getMilage());
        }
    }
}
