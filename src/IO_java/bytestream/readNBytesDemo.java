package IO_java.bytestream;

import java.io.IOException;

public class readNBytesDemo { 
    public static void main(String args[])throws IOException {
        byte[] bytes = new byte[6];
        System.out.println("There are "+System.in.available()+" bytes are available.");
        System.out.print("Enter String: ");
        bytes = System.in.readNBytes(6);
        System.in.mark(3);
        System.in.reset();
        byte[] bt = new byte[8];

        System.out.print("[");
        for(int i: bytes) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");

        System.out.println("There are "+System.in.available()+" bytes available.");
        bt = System.in.readNBytes(8);

        System.out.print("[");
        for(int i: bt) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");
    }
}
