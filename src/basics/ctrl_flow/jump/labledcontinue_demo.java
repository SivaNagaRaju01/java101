package basics.ctrl_flow.jump;

public class labledcontinue_demo {
    public static void main(String args[]) {
        int i;
        a : for(i=0; i<4; i++){
            {
                if(true){
                    if(i == 1) continue a;
                    //if(i == 1) continue b;
                    //if(i == 0) continue c;
                }//System.out.println("This is End of Block-C and i = "+i);
            }System.out.println("This is End of Block-B and i = "+i);
        }System.out.println("This is End of Block-A and i = "+i);
    }
}
