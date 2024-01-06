package MultiThreading;
class SumArray { 
    private int sum; 
    synchronized int sumArray(int[] nums) { 
        sum = 0; // reset sum 
        for(int i=0; i<nums.length; i++) { 
            sum += nums[i]; 
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum); 
            try {
                Thread.sleep(10); // allow task-switch 
            } 
            catch(InterruptedException exc) { 
                System.out.println("Thread interrupted."); 
            }
        } 
        return sum; 
    } 
}

class MyThread implements Runnable { 
    Thread thrd;
    int opt;
    static lockThisClass lock = new lockThisClass(); 
    int[] a; 
    //int answer; 

    MyThread(String name, int[] nums, int x) { 
        thrd = new Thread(this, name);
        opt = x;
        a = nums; 
    } 

    public static MyThread createAndStart(String name, int[] nums, int x) {
        MyThread myThrd = new MyThread(name, nums, x);
        myThrd.thrd.start();
        return myThrd;
    }
 
    public void run() { 
        System.out.println(thrd.getName() + " starting.");
        synchronized(lock){
            if(opt == 1) lock.add(a);
            else lock.multiply(a);
        }
        //System.out.println("Sum for " + thrd.getName() + " is " + answer); 
        System.out.println(thrd.getName() + " terminating.");
    } 
} 

public class syncTextExe {
    /*public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
            
    } */
}
