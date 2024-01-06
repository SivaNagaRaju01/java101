package MultiThreading;

class addList {
    private static int sum;
    static synchronized int sumList(int[] list) {
        sum = 0;
        for(int i: list) {
            sum += i;
            System.out.println("Sum in Thread "+Thread.currentThread().getName()+": "+sum);
            try {
                Thread.sleep(10);
            }catch (InterruptedException exc) {
                System.out.println("Interruption: "+exc);
            }
        }
        System.out.println();
        return sum;
    }
}

class NewThread implements Runnable {
    Thread thrd;
    int[] list;
    int sum;
    NewThread(String name, int[] x) {
        thrd = new Thread(this, name);
        list = x;
        thrd.start();
    }

    public void run() {
        System.out.println("In "+thrd.getName());
        sum = addList.sumList(list);
        System.out.println(thrd.getName()+" Terminated.");
    }
}

public class syncMethodDemo {
    public static void main(String args[]) {
        int[] list = {10, 20, 30, 40, 50, 60, 9, 8, 7, 1};
        NewThread t1 = new NewThread("ChildThread#1", list);
        NewThread t2 = new NewThread("ChildThread#2", list);

        try{
            t1.thrd.join();
            System.out.println("The sum is: "+t1.sum);
            t2.thrd.join();
            System.out.println("The sum is: "+t2.sum);
        }catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}
