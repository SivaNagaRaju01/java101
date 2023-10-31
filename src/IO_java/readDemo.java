package IO_java;

import java.io.IOException;

public class readDemo {
    public static void main(String args[]) throws IOException {
        System.out.print("Enter a Character: ");
        int x = System.in.read();
        System.out.println("Your Input is: "+(char)x);
        System.out.println("Your Character is: "+x);
        int y = '0';
        System.out.println("ASCII value of 0: "+y);
    }
}
