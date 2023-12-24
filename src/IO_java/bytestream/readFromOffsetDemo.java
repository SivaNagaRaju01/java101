package IO_java.bytestream;

public class readFromOffsetDemo {
    public static void main(String args[])throws Exception {
        int x;

        byte[] bytes = new byte[10];
        System.out.print("Enter a String: ");
        x = System.in.read(bytes, 3, 5);
        System.out.println(System.in.markSupported());

        System.out.println(x+" bytes are read From the Stream.");
        System.out.print("[");
        for(int i: bytes) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");
    }
}
