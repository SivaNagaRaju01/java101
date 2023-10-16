package Exception_Handling;

public class ExcDemo1 {
    static int[] x;
    public static void main(String args[]) {
        x = new int[3];
        x[0] = 10;
        x[1] = 11;
        x[2] = 12;
        int n = 5;

        try {
            int z;
            for(int i=0; i<n; i++){
                z = genExc(i);
                System.out.print(z+" ");
            }
            System.out.println();
        }catch(ArrayIndexOutOfBoundsException Aob) {
            System.out.println("Index Out-of-bounds...!");
        }
        
        System.out.println("n is: "+n);
    }

    static int genExc(int i) {

        return x[i];
    }
}
