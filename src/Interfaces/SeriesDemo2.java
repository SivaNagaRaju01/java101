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

        twoob.reset();
        twoob.setStart(118);

        System.out.println("The Current Element is: "+twoob.getNext());
        int[] x = twoob.skipAndgetNextArray(20, 20);

        System.out.println();

        System.out.print("Next[20] After{40}: ");

        for(int i: x){
            System.out.print(i+" ");
        }
        System.out.println("\b");
    }
}
