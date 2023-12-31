package IO_java.charstream;

import java.io.*;

public class readCharArrayDemo {
    public static void main(String args[])throws IOException {
        char[] ch = new char[20];
        InputStreamReader ir = new InputStreamReader(System.in, System.console().charset());
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter a String: ");
        br.read(ch);

        System.out.println("Your String.");
        for(int i: ch) {
            System.out.print((char)i);
        }

        br.close();
    }
}
