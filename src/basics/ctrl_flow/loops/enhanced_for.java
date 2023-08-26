package basics.ctrl_flow.loops;

public class enhanced_for {
    public static void main(String args[]) {
        int x[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;
        for(int i : x){
            System.out.print(i+", ");
            sum = sum + i;
        }
        System.out.println("\nSum = "+sum);
    }
}
