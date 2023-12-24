package IO_java.bytestream;

public class readByteArrayDemo {
    public static void main(String args[])throws Exception {
        int len;
        byte[] b = new byte[10];
        System.out.print("Enter list of Characters: ");
        len = System.in.read(b);
        System.out.println(System.in.markSupported());
        System.out.println(len+" bytes are read From the Stream.");
        System.out.print("[");
        for(int i=0; i<len; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("\b]");
    }
}
