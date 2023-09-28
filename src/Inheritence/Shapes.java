package Inheritence;

class TwoDShape {
    double width;
    double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {
        width = height = x;
    }

    TwoDShape() {
        width = height = 0.0;
    }

    void showDim() {
        System.out.println("Width and Height are: "+width+" and "+height);
    }
}

class Triangle extends TwoDShape {
    String style;

    Triangle(String str, double x, double y){
        super(x,y);
        style = str;
    }

    Triangle(double x) {
        super(x);
        style = null;
    }

    Triangle() {
        super();
        style = "UnIdentified";
    }

    double area(){
        return width * height / 2;
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

class Square extends TwoDShape {
    Square(double x, double y){
        super(x,y);
    }

    void area(){
        System.out.println("Area is: "+width*height);
    }
}

public class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("Filled", 4.0, 5.0);
        Triangle t2 = new Triangle("Outlined", 10.5, 6.2);
        Triangle t3 = new Triangle();
        Triangle t4 = new Triangle(12.1);
        Square s1 = new Square(10.5, 3.6);
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
