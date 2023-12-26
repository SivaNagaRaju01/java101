package IO_java.bytestream;

import java.io.*;

public class WritingIntegers {
    public static void main(String args[]) {
        // DataInput/OutputStream(s) only work one after the other.
        // Only Like in this program.
        int i = 987564635;
        char c = 't';
        double d = 1;
        boolean b = true;

        try(var dataout = new DataOutputStream(new FileOutputStream("src/IO_java/data1.txt")); var datain = new DataInputStream(new FileInputStream("src/IO_java/data1.txt"))) {
            dataout.writeInt(i);
            dataout.writeChar(c);
            dataout.writeDouble(d);
            dataout.writeBoolean(b);

            System.out.println("The Integer is: "+datain.readInt());
            System.out.println("The Character is: "+datain.readChar());
            System.out.println("The Double is: "+datain.readDouble());
            System.out.println("The Boolean Value is: "+datain.readBoolean());
        }catch(IOException ioe) {
            System.out.println("Error While Input...");
        }
    }
}
