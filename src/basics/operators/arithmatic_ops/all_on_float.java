package basics.operators.arithmatic_ops;

public class all_on_float {
    public static void main(String args[]){
        float x = 100;
        float y = 17;
        
        float ad = x+y;
        float dif = x - y;
        float mul = x * y;
        float div = x / y;
        float mod = x % y;

        System.out.println("add(x,y) = "+ad);
        System.out.println("difference(x,y) = "+dif);
        System.out.println("product(x,y) = "+mul);
        System.out.println("quotient(x,y) = "+String.format("%.2f",div));
        System.out.println("mod(x,y) = "+mod);
    }
}
