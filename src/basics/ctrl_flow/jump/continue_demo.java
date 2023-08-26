package basics.ctrl_flow.jump;

public class continue_demo {
    public static void main(String args[]) {
        int i = 0;
        while(i<20){
            i++;
            if(i == 11) continue;
            System.out.println("i = "+i);
        }
    }
}
