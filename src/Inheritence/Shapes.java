package Inheritence;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    String getName() { return name; }

    void showDim() {
        System.out.println("Width and Height are: "+width+" and "+height);
    }

    abstract double area();
}

class Triangle extends TwoDShape {
    String style;

    Triangle(String str, double x, double y){
        super(x,y,"Triangle");
        style = str;
    }

    Triangle(double x) {
        super(x, "Triangle");
        style = null;
    }

    Triangle() {
        super();
        style = "UnIdentified";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is "+style);
    }
}

class ColoredTriangle extends Triangle {
    private String color;

    ColoredTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Color is "+color);
    }
}

class Rectangle extends TwoDShape {
    Rectangle(double x, double y) {
        super(x,y,"Rectangle");
    }

    Rectangle(double x) {
        super(x, "Square");
    }

    Rectangle() {
        super();
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}

public class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("Filled", 4.0, 5.0);
        Triangle t2 = new Triangle("Outlined", 10.5, 6.2);
        Triangle t3 = new Triangle();
        Triangle t4 = new Triangle(12.1);

        Rectangle s1 = new Rectangle(10.5, 3.6);
        ColoredTriangle c1 = new ColoredTriangle("Red", "Controlled", 23.5, 11.1);

        System.out.println("Info For t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is : "+t1.area());

        System.out.println();

        System.out.println("Info For t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: "+t2.area());

        System.out.println();

        System.out.println("Info For t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is : "+t3.area());

        System.out.println();

        System.out.println("Info For t4: ");
        t4.showStyle();
        t4.showDim();
        System.out.println("Area is : "+t4.area());

        System.out.println();

        Triangle t5 = new Triangle(t2);
        System.out.println("Info For t5: ");
        t5.showStyle();
        t5.showDim();
        System.out.println("Area is : "+t5.area());

        System.out.println();

        System.out.println("Info For s1: ");
        s1.showDim();
        s1.area();

        System.out.println();

        System.out.println("Info For c1: ");
        c1.showStyle();
        c1.showDim();
        System.out.println("Area is : "+c1.area());
    }
}
