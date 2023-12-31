package IO_java.charstream;

import java.io.*;

public class FileReaderDemo {
    public static void main(String args[]) {
        String str;
        try(var br = new BufferedReader(new FileReader("src/IO_java/charstream/text1.txt"))) {
            do {
                str = br.readLine();
                if(str != null) System.out.println(str);
            } while(str != null);
        }catch(IOException exc) {
            System.out.println("Error Occured:\n"+exc);
        }
    }
}
