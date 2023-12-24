package IO_java.bytestream;

import java.io.IOException;

public class writeByteArrayDemo {
    public static void main(String args[])throws IOException {
        byte[] b = new byte[10];
        System.out.print("Enter a String: ");
        System.in.read(b);
        System.out.write(b);
        //System.out.write('\n');
    }
}
