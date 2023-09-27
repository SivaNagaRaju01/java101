package classes_and_methods;

class Outer {
    int nums[];
    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inob = new Inner();

        System.out.println("Minimum: "+inob.min());
        System.out.println("Maximum: "+inob.max());
        System.out.println("Average: "+inob.avg());
    }

    class Inner {
        int min() {
            int m = nums[0];

            for(int i=0; i<nums.length; i++)
                if(nums[i] < m) m = nums[i];
            
                return m;
        }

        int max() {
            int m = nums[0];

            for(int i=0; i<nums.length; i++)
                if(nums[i] > m) m = nums[i];
            
            return m;
        }

        int avg() {
            int a = 0;
            for(int i=0; i<nums.length; i++)
                a += nums[i];

            return a/nums.length;
        }
    }
}

public class nestedClassDemo {
    public static void main(String args[]) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outob = new Outer(x);

        outob.analyze();
    }
}
