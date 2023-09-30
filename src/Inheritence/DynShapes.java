package Inheritence;

public class DynShapes {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("Outlined", 5.0, 6.8);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(8.5, 6.8);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape();

        for(int i=0; i<5; i++) {
            System.out.println("Object is "+ shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
