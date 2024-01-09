package type_wrappers;

public class NumericDemo{
    public static void main(String[] args) {
        //NumericDemo nd = new NumericDemo();
        Integer i = Integer.valueOf(25);
        System.out.println("The integer object contains the value: "+i);
        change(i);
        int x = i.intValue();
        System.out.println("The value inside the Integer object after change(): "+x);

        Integer[] z = new Integer[10];
        for(int j=0; j<10; j++) {
            z[j] = Integer.valueOf(j+100);
        }

        show(z);
    }

    static void show(Integer[] x) {
        System.out.print("[");
        for(Integer i: x) {
            System.out.print(i.intValue()+" ");
        }
        System.out.println("\b]");
    }

    static void change(Integer i) {
        i = i+1;
        int x = i.intValue();
        System.out.println(x);
    }
}
