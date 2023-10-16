package Exception_Handling;

import java.io.IOException;

class ExcTest {
    static void prompt() throws IOException {
        System.out.print("Enter any Character: ");
        int x = System.in.read();
        System.out.println("The character You Entered "+(char)(x));
    }
}

public class throwsDemo {
    public static void main(String args[]) {
        try {
            ExcTest.prompt();
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
    }
}
