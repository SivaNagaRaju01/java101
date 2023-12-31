package IO_java.charstream;

import java.io.*;

public class readLineDemo {
    public static void main(String args[]) throws IOException {
        String str;

        var ir = new InputStreamReader(System.in, System.console().charset());
        var br = new BufferedReader(ir);

        System.out.println("Enter a String: ");
        str = br.readLine();

        System.out.println("Your String: "+str);

        br.close();
    }
}
