package enumerations;
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class enumerationDemo {
    public static void main(String args[]) {
        Transport tp = Transport.AIRPLANE;
        System.out.println("Current Transport is: "+tp);

        System.out.println("All Transports are.");
        for(Transport t: Transport.values()) {
            System.out.println(t);
        }

        tp = Transport.valueOf("CAR");
        System.out.println("Now the Current Transport is: "+tp);
    }
}
