package MultiThreading;

class t1 implements Runnable {
    String tname;
    t1(String str) {
        tname = str;
    }

    public void run() {
        System.out.println("At thread-"+tname);
        try {
            for(int count=0; count<20; count++) {
                Thread.sleep(400);
                System.out.println("In "+ tname + ", count is "+ count);
            }
        }catch(InterruptedException exc) {
            System.out.println(tname + " Interrupted.");
        }
        System.out.println(tname+" terminating.");
    }
}

class t2 implements Runnable {
    String tname;
    t2(String str) {
        tname = str;
    }

    public void run() {
        System.out.println("At thread-"+tname);
        try {
            for(int count=0; count<20; count++) {
                Thread.sleep(400);
                System.out.println("In "+ tname + ", count is "+ count);
            }
        }catch(InterruptedException exc) {
            System.out.println(tname + " Interrupted.");
        }
        System.out.println(tname+" terminating.");
    }
}

public class threadDemo1 {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        t1 t1 = new t1("Child #1");
        t2 t2 = new t2("Child #2");

        Thread newThread1 = new Thread(t1);
        Thread newThread2 = new Thread(t2);

        newThread2.start();
        newThread1.start();

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
