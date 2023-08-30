package Exam;

public class factors_of_n {
    public static void main(String args[]){
        int n = 64;
        int i;

        var ob = new prime_or_not();
        if(!ob.isprime(n)){
            System.out.print("Factors("+n+"): ");
            for(i=2; i<n; i++){
                if(n%i == 0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }else System.out.println(n+" is Prime Number...");
    }
}
