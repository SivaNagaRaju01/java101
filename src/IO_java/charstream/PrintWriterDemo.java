package IO_java.charstream;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String args[]) throws IOException {
        int i = 10;
        char ch = 'i';
        double d = 21.356;

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is using PritWriter");
        pw.println(i);
        pw.println(ch);
        pw.println(i + " + " + d + " = "+(i+d));
    }
}
