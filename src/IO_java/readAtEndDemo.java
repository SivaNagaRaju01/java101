package IO_java;

import java.util.ArrayList;
import java.io.IOException;

public class readAtEndDemo {
    public static void main(String args[])throws IOException {
        ArrayList<Character> al = new ArrayList<>();
        System.out.print("Enter a String: ");
        al.add((char)System.in.read());
        int i = 0;
        while(al.get(i) != 13) {
           al.add((char)System.in.read());
           i++;
        }
        al.remove(i);
        System.out.println("\n"+al);
    }
}
