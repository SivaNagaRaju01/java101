package IO_java.bytestream;

import java.io.IOException;

public class readNBytesFromOffsetDemo {
    public static void main(String args[])throws IOException {
        byte[] bytes = new byte[10];
        int n;
        System.out.print("Enter a String: ");
        n = System.in.readNBytes(bytes, 3, 5);
        System.out.println(n+" byte have been read from the Stream.");

        System.out.print("[");
        for(int i: bytes) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");
    }
}
