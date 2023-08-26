package basics.ctrl_flow.conditional;

public class if_demo {
    public static void main(String args[]) {
        int i=11;
        boolean b = i>10;

        if(b){
            System.out.println("i is greater than 10");
        }
        
        if(!b){
            System.out.println("i is less than 10");
        }
    }
}
