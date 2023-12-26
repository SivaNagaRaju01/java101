package IO_java.bytestream;

import java.io.*;

public class RandomAccessFiles {
    public static void main(String args[]) {
        double[] dt = {27.01, 38.0, 1.29, 65.84, 84.0, 39.1, 2.0, 10.11, 21.6};

        try(RandomAccessFile raf = new RandomAccessFile("src/IO_java/Rfile.txt", "rw")) {
            for(double d: dt) {
                raf.writeDouble(d);
            }

            raf.seek(8);
            System.out.println("The second value: "+raf.readDouble());

            raf.seek(8*3);
            System.out.println("The 4th value: "+raf.readDouble());

            raf.seek(8*5);
            System.out.println("The 6th value: "+raf.readDouble());

            System.out.print("Data = [");
            int i = 0;
            while(i<dt.length) {
                raf.seek(8*i);
                System.out.print(raf.readDouble()+", ");
                i++;
            }
            System.out.println("\b\b]");

        }catch(FileNotFoundException fnf) {
            System.out.println("File you specified is not found...");
        }catch(IOException ioe) {
            System.out.println("Error while accessing file.");
        }
    }
}
