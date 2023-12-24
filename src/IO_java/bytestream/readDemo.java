package IO_java.bytestream;

import java.io.IOException;

public class readDemo {
    public static void main(String args[])throws IOException {
        int x,y,z;
        System.out.print("Enter any character: ");
        x = System.in.read();
        y = System.in.read();
        z = System.in.read();
        int p = System.in.read();
        System.out.println(System.in.markSupported());
        System.in.close();
        System.out.println(System.in.markSupported());
        System.out.println("x, y and z are: "+x+", "+y+" and "+z);
        System.out.println("p is: "+p);
    }
}
