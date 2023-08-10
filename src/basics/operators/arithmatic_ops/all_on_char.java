package basics.operators.arithmatic_ops;

public class all_on_char {
    public static void main(String args[]) {
        char x = 'A';
        char y = 'B';

        int sum = x+y;
        int dif = x-y;
        int mult = x*y;
        double div = (double)x/y;
        int mod = x%y;

        System.out.println("sum(x,y) = "+sum);
        System.out.println("dif(x,y) = "+dif);
        System.out.println("product(x,y) = "+mult);
        System.out.println("quotient(x,y) = "+div);
        System.out.println("modulo(x,y) = "+mod);
    }
}
