package Exception_Handling;

public class ExcDemo2 {
    public static void main(String args[]) {
        int[] nums = {4, 8, 10, 0, 16, 11, 5, 3, 1};
        int[] denoms = {2, 0, 5, 16, 8, 11, 0, 0};

        for(int i=0; i<nums.length; i++) {
            try {
                System.out.println(nums[i]+" / "+denoms[i]+" is "+nums[i]/denoms[i]);
            }
            catch(ArithmeticException exc) {
                System.out.println("Can't divide by Zero!");
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("Array-Out-Of-Bounds!");
            }
        }
    }
}
