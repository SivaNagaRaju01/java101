package IO_java.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceDemo {
    public static void main(String args[]) {
        try(FileInputStream fin = new FileInputStream("src/IO_java/TEXT1.txt"); FileOutputStream fout = new FileOutputStream("src/IO_java/TEXT2.txt");) {
            int i;

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        }catch(FileNotFoundException fnf) {
            System.out.println("File Not Found.");
        }catch(IOException ioe) {
            System.out.println("Error Reading File.");
        }
    }
}
