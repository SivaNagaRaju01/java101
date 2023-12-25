package IO_java.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main(String args[])throws IOException {
        int len;
        FileOutputStream fout = null;
        //System.out.print("Enter size of the Data: ");
        len = 150;
        byte[] data = new byte[len];

        System.out.println("Enter "+len+" bytes of data.");
        data = System.in.readNBytes(len);

        System.in.close();

        try {
            fout = new FileOutputStream("src/IO_java/TEXT1.txt");
            for(int i: data) {
                fout.write(i);
            }
        }catch(FileNotFoundException fnf) {
            System.out.println("Cannot Create a File.");
            return;
        }catch(IOException ioe) {
            System.out.println("Error While writing to a file.");
            return;
        }finally {
            try {
                if(fout != null) fout.close();
            }catch(IOException ioe) {
                System.out.println("Error while closing the file.");
                return;
            }
        }
    }
}
