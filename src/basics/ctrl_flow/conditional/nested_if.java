package basics.ctrl_flow.conditional;

public class nested_if {
    public static void main(String args[]) {
        int x = 110;
        boolean b1=x>10, b2=x<100;
        if(b1){
            if(b2){
                System.out.println("x is greaterthan 10 and lessthan 100!");
            }else{
                System.out.println("x is greaterthan 10 and 100.");
            }
        }else{
            System.out.println("x is not greaterthan 10!");
        }
    }
}
