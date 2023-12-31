package IO_java.charstream;
import java.io.*;
public class typeWrapers {
    public static void main(String args[])throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, System.console().charset());
        BufferedReader br = new BufferedReader(ir);

        System.out.print("Enter a Number: ");
        try {
            int x = Integer.parseInt(br.readLine());
            System.out.println(x+" is your integer..");
        }catch(NumberFormatException exc) {
            System.out.println("Format Mismatch.");
        }
    }
}
