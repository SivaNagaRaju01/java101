package Inheritence;

class X {
    int a;

    X(int i) { a = i; }
}

class Y extends X {
    int b;

    Y(int i, int j){
        super(i);
        System.out.println("I was Invoked Here....");
        b = j;
    }
}
public class superRef_subObj {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;

        Y y = new Y(10, 20);

        x2 = x;
        System.out.println("x2.a: "+x2.a);

        x2 = y;
        System.out.println("x2.a From y Reference: "+x2.a);
        //System.out.println("x2.b Doesn't have: "+x2.b);
        X x3 = new Y(10,20);
        System.out.println("x3.a From Y constructor: "+x3.a);
        //System.out.println("x3.b From Y constructor: "+x3.b);

        //Y y2 = (Y) new X(10);
        //System.out.println("y2.a and y2.b: "+y2.a+" and "+y2.b);
    }
}
