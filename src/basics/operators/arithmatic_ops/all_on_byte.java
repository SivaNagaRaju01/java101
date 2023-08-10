package basics.operators.arithmatic_ops;

public class all_on_byte {
    public static void main(String args[]) {
        byte x = 100;
        byte y = 28;

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
