package data_structures.arrays;

public class irregular_array {
    public static void main(String args[]) {
        int ar[][] = new int[5][];
        ar[0] = new int[1];
        ar[1] = new int[3];
        ar[2] = new int[5];
        ar[3] = new int[3];
        ar[4] = new int[1];

        int i,j;
        for(i=0; i<ar.length; i++){
            for(j=0; j<ar[i].length; j++){
                ar[i][j] = i+j*2+1;
            }
        }

        for(i=0; i<ar.length; i++){
            for(j=0; j<ar[i].length; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
