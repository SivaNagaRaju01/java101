package MultiThreading;
class lockThisClass {
    void add(int[] list) {
        int sum = 0;
        for(int i: list) {
            sum += i;
            System.out.println("Addition at "+Thread.currentThread().getName()+" is: "+sum);
            try {
                Thread.sleep(10); // allow task-switch 
            } 
            catch(InterruptedException exc) { 
                System.out.println("Thread interrupted."); 
            }
        }
        System.out.println("Result of sum in "+Thread.currentThread().getName()+" is: "+sum);
    }

    void multiply(int[] list) {
        int product = 1;
        for(int i: list) {
            product *= i;
            System.out.println("Multiplication at "+Thread.currentThread().getName()+" is: "+product);
            try {
                Thread.sleep(10); // allow task-switch 
            } 
            catch(InterruptedException exc) { 
                System.out.println("Thread interrupted."); 
            }
        }
        System.out.println("Result of product in "+Thread.currentThread().getName()+" is: "+product);
    }
}

public class lockAllMehtodsDemo {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Child #1", a, 1);
        MyThread mt2 = MyThread.createAndStart("Child #2", a, 2);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
