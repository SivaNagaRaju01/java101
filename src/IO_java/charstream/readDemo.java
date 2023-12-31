package IO_java.charstream;

import java.io.*;

public class readDemo {
    public static void main(String args[])throws IOException {
        int x[];
        int num;
        Console con = System.console();
        if(con == null) {
            System.out.println("No Console Detected.");
            return;
        }

        var br = new BufferedReader(new InputStreamReader(System.in, con.charset()));
        var br1 = new BufferedReader(new InputStreamReader(System.in, con.charset()));

        System.out.print("Enter a Number: ");
        num = br.read() - (char)'0';
        x = new int[num];

        System.out.print("Enter a String: ");
        for(int i=0; i<num; i++) {
            x[i] = br1.read();
        }

        System.out.print("[");
        for(int i: x) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");

        br.close();
        br1.close();
    }
}
