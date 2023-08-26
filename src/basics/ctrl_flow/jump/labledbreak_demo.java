package basics.ctrl_flow.jump;

public class labledbreak_demo {
    public static void main(String args[]) {
        int i;
        a : for(i=0; i<4; i++){
            b : {
                c : if(true){
                    if(i == 2) break a;
                    if(i == 1) break b;
                    if(i == 0) break c;
                }System.out.println("This is End of Block-C and i = "+i);
            }System.out.println("This is End of Block-B and i = "+i);
        }System.out.println("This is End of Block-A and i = "+i);
    }
}
