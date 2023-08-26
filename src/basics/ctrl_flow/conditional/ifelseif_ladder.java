package basics.ctrl_flow.conditional;

public class ifelseif_ladder {
    public static void main(String args[]) {
        byte x = 10;
        byte y = 19;
        byte z = 15;

        if(x > y & x > z){
            System.out.println("x is the greatest number among the three");
        }else if(y > x & y > z){
            System.out.println("y is the greatest number among the three");
        }else{
            System.out.println("z is the greatest number among the three");
        }
    }
}
