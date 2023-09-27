package Inheritence;

class TwoDShape {
    double width;
    double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
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

    double area(){
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is "+style);
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
        Square s1 = new Square(10.5, 3.6);

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

        System.out.println("Info For s1: ");
        s1.showDim();
        s1.area();
    }
}
