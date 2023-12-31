package IO_java.charstream;

import java.io.*;

public class charArrayWithOffsetDemo {
    public static void main(String args[]) throws IOException {
        char[] ch = new char[20];
        
        var ir = new InputStreamReader(System.in, System.console().charset());
        var br = new BufferedReader(ir);

        System.out.print("Enter a list of Characters: ");
        br.read(ch, 0, 20);

        for(int i: ch) {
            System.out.print(i+" ");
        }

        br.close();
    }
}
