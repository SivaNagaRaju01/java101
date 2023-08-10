package basics.data_types;

public class long_type {
    public static void main(String args[]){
        int x = 100000;
        int y = 100000;
        //(int) can't handle values larger than 2*10^10 i.e, more than 32-bit values.
        //We need to use (long) to convert and store larger values.
        long z = (long)x*y;

        System.out.println("Long(z) = "+z);
    }
}
