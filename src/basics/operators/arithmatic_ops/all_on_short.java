package basics.operators.arithmatic_ops;

public class all_on_short {
    public static void main(String args[]) {
        short x = 100;
        short y = 28;

        //short sum = x+y; -> Error:- int type can't be assigned to short;
        //JVM's type conversion will convert short(char and byte) to int when arithmatic op were involved.

        int sum = x+y;
        int dif = x-y;
        int prod = x*y;
        double div = (double)x/y;
        int mod = x%y;

        System.out.println("add(x,y) = "+sum);
        System.out.println("difference(x,y) = "+dif);
        System.out.println("product(x,y) = "+prod);
        System.out.println("quotient(x,y) = "+div);
        System.out.println("mod(x,y) = "+mod);
    }
}
