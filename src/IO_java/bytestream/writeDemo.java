package IO_java.bytestream;

import java.io.IOException;

public class writeDemo {
    public static void main(String args[])throws IOException {
        int x;
        System.out.print("Enter any Number: ");
        x = System.in.read();
        System.out.write(x);
        System.out.write('k');
        System.out.write('\n');
    }
}
