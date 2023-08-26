package basics.ctrl_flow.jump;

public class break_demo {
    public static void main(String args[]) {
        int i = 1;
        int n = 10;
        boolean b = true;

        while(b){
            if(i == n) break;
            System.out.print(i+", ");
            i++;
        }
    }
}
