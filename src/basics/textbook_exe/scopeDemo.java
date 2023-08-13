package basics.textbook_exe;

public class scopeDemo {
    public static void main(String args[]) {
        int x = 10;
        int y;

        System.out.println("x = "+x);

        if(true){
            y = x*2;
            int z = x;

            System.out.println("z = "+z);
        }

        System.out.println("y = "+y);
        //System.out.println("z = "+z); :- "z" can't be resoved to a variable ERROR.

        {
            int a = 10;
            {
                int b = a*2;
                System.out.println("b = "+b);
            }
            //a = a*b;
            System.out.println("a = "+a);
        }
    }
}
