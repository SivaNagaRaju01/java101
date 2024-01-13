package basics;

public class printFormatting {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("The integer is: %d\n",x);
        System.out.printf("The integer is: %5d\n",x);
        System.out.printf("The integer is: %05d\n",x);
    }
}
