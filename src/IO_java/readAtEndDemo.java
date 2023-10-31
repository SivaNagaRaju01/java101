package IO_java;

import java.util.ArrayList;
import java.io.IOException;

public class readAtEndDemo {
    public static void main(String args[])throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter a String: ");
        al.add(System.in.read());
        int i = 0;
        while(al.get(i) != -1) {
           al.add(System.in.read());
           i++;
        }
        System.out.println("\n"+al);
    }
}
