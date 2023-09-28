package data_structures.arrays;

public class ArrayAndType {
    public static void main(String args[]) {
        int[] ar1 = new int[10];
        char[] ar2 = new char[10];
        String[] ar3 = {"Siva", "Naga", "Raju", "Tirumalasetti", "Hello", "World"};

        System.out.println("ar1 = "+ar1);
        System.out.print("ar2 = ");
        System.out.println(ar2);
        System.out.println("ar3 = "+ar3);

        for(int i=0; i<10; i++){
            ar1[i] = i*10+2;
        }

        for(int i=0; i<10; i++){
            ar2[i] = '&';
        }

        System.out.println("ar1 = "+ar1);
        System.out.print("ar2 = ");
        System.out.println(ar2);
        System.out.println();

        for(int i: ar1){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i: ar2){
            System.out.print(i+" ");
        }
        System.out.println();

        for(String i: ar3){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
