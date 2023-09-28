package classes_and_methods;

class ol_cons {
    int x;
    ol_cons() {
        System.out.println("Inside the ol_cons()...");
        x = 0;
    }

    ol_cons(int i) {
        System.out.println("Inside The ol_cons(int)...");
        x = i;
    }

    ol_cons(double d) {
        System.out.println("Inside the ol_cons(double)...");
        x = (int)d;
    }

    ol_cons(int i, int j){
        System.out.println("Insider the ol_cons(int, int)...");
        x = i + j;
    }
}

public class constructor_overloading {
    public static void main(String args[]) {
        ol_cons t1 = new ol_cons();
        ol_cons t2 = new ol_cons(10);
        ol_cons t3 = new ol_cons(25.63);
        ol_cons t4 = new ol_cons(15, 15);

        System.out.println("t1.x = "+t1.x);
        System.out.println("t2.x = "+t2.x);
        System.out.println("t3.x = "+t3.x);
        System.out.println("t4.x = "+t4.x);
    }
}
