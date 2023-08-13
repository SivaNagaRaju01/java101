package basics.textbook_exe;

public class BoolDemo {
    public static void main(String args[]) {
        boolean x = false;
        System.out.println("x = "+x);
        x = true;
        System.out.println("x = "+x);
        if(x){
            System.out.println("This Will print since x is True");
        }
        x = false;
        if(x) System.out.println("This Won't be Printed since x is False");

        System.out.println(9>10);
    }
}
