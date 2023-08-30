package Exam;

public class prime_or_not {
    public static void main(String args[]) {
        int n = 17;
        var ob = new prime_or_not();

        if(ob.isprime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

    boolean isprime(int n){
        int i;
        for(i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }

        if(i==n) return true;

        return true;
    }
}
