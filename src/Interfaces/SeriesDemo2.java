package Interfaces;

public class SeriesDemo2 {
    public static void main(String args[]) {
        ByTwos twoob = new ByTwos();
        ByThree threeob = new ByThree();
        Series ob;

        //ob = new ByTwos();
        for(int i=0; i<5; i++) {
            ob = twoob;
            System.out.println("Next Bytwos value is " + ob.getNext());
            ob = threeob;
            System.out.println("Next Bythrees value is " + ob.getNext());
        }
        System.out.println();

        /*ob = new ByThree();
        for(int i=0; i<5; i++) {
            System.out.println("Next Bythrees value is " + ob.getNext());
        }*/
    }
}
