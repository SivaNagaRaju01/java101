package Inheritence;

class A {
    int a;
    A(int x) { a = x; }

    void methodA(){
        System.out.println("This is a Method in Class-A and a: "+a);
    }
}

class B extends A {
    int b;
    B(int x, int y) {
        super(x);
        b = y;
    }

    void methodB(){
        System.out.println("This is a Method in Class-B and b: "+b);
    }
}

public class InheritenceAndMethods {
    public static void main(String args[]) {
        B ob1 = new B(10,20);
        ob1.methodA();
        ob1.methodB();

        A ob2 = new B(20, 30);
        ob2.methodA();
    }
}
