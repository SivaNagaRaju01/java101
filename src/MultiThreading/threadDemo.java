package MultiThreading;

class myThread implements Runnable {
    String thrdName;

    myThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 20; count++) {
                Thread.sleep(400);
                System.out.println("In "+ thrdName +", count is " + count);
            }
        }catch (InterruptedException exp) {
            System.out.println("Process is Interrupted: "+thrdName);
        }

        System.out.println("Process terminated.");
    }
}

public class threadDemo {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        myThread mt = new myThread("Child #1");

        Thread newThread = new Thread(mt);

        newThread.start();

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
