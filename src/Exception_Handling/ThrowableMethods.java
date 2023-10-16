package Exception_Handling;

public class ThrowableMethods {
    public static void main(String args[]) {
        try {
            Generate.exc();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            exc.printStackTrace();
        }
        finally {
            System.out.println("We are in Finally Block..!");
        }
    }
}
