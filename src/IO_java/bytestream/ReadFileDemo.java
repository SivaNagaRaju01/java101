package IO_java.bytestream;

import java.io.*;

public class ReadFileDemo {
    public static void main(String args[]) {
        FileInputStream fn = null;

        if(args.length != 1) {
            System.out.println("Please specify file name at the terminal.");
            return;
        }

        try {
            fn = new FileInputStream(args[0]);
            int i = 0;
            while(i != -1) {
                i = fn.read();
                if(i!=-1) System.out.print((char)i);
            }
        }catch (FileNotFoundException fnf) {
            System.out.println("This file Does not Exist.");
            return;
        }catch(IOException ioe) {
            System.out.println("\nAn Error Occured while reading.");
        }finally {
            try {
            if(fn != null) fn.close();
            }catch(IOException ioe) {
                System.out.println("An Error Occured while closing file.");
            }
        }
    }
}
