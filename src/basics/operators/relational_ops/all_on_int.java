package basics.operators.relational_ops;

public class all_on_int {
    //The Relational Operators output the Boolean Values.
    public static void main(String args[]) {
        int x = 10;
        int y = 20;

        if(x == y) System.out.println("x and y are Equal...");
        if(x != y) System.out.println("x is either Greater or Less than y");
        if(x >= y) System.out.println("x is Either Greater than or equal to y");
        if(x <= y) System.out.println("x is Either Lessthan or Equal to y");
        System.out.println("x > y : "+(x>y));
        System.out.println("x < y : "+(x<y));
    }
}
