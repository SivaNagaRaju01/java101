package Exception_Handling;

public class multiCatch {
    public static void main(String args[]) {
        try {
            Generate.exc();
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception Caught...!");
        }
    }
}
