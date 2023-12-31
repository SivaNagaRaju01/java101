package IO_java.charstream;

import java.io.*;

public class FileWriterDemo {
    public static void main(String args[]) {
        InputStreamReader ir = new InputStreamReader(System.in, System.console().charset());
        BufferedReader br = new BufferedReader(ir);

        String str;

        System.out.println("Write anything to file, stop to quit");

        try(var fw = new FileWriter("src/IO_java/charstream/text1.txt")) {
            do {
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while(str.compareTo(str) == 0);
        }catch(IOException exc) {
            System.out.println("Error Occured:\n"+exc);
        }
    }
}
