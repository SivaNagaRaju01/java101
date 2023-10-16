package Exception_Handling;

class NonIntResultException extends Exception {
    int x,y;

    NonIntResultException(int a, int b) {
        x = a;
        y = b;
    }

    public String toString() {
        return "E_H.NonIntResultException: "+x+" / "+y+" is NonInteger..!";
    }
}

public class customException {
    public static void main(String args[]) {
        int[] numer = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };

        for(int i: numer) {
            for(int j: denom) {
                try {
                    if(i%2 != 0) throw new NonIntResultException(i, j);
                    System.out.println("\n"+i+" / "+j+" = "+i/j);
                }catch(ArithmeticException exc) {
                    System.out.println(exc);
                }catch(NonIntResultException exc) {
                    System.out.println(exc);
                }
            }
        }
    }
}
