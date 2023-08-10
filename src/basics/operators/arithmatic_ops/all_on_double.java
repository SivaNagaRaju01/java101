package basics.operators.arithmatic_ops;

public class all_on_double {
    public static void main(String args[]){
        double x = 100;
        double y = 17;
        
        double ad = x+y;
        double dif = x - y;
        double mul = x * y;
        double div = x / y;
        double mod = x % y;

        System.out.println("add(x,y) = "+ad);
        System.out.println("difference(x,y) = "+dif);
        System.out.println("product(x,y) = "+mul);
        System.out.println("quotient(x,y) = "+String.format("%.2f",div));
        System.out.println("mod(x,y) = "+mod);
    }
}
