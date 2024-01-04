package MultiThreading;

class createThrd implements Runnable{
    Thread thrd;
    createThrd(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println("\n"+thrd.getName()+" is Starting.\n");
        try {
            for(int i=0; i<10; i++) {
                Thread.sleep(100);
                System.out.println(":->"+thrd.getName()+": "+ i);
            }
        }catch (InterruptedException exc) {
            System.out.println("Process Interrupted with Exc: "+exc);
        }

        System.out.println(thrd.getName()+": Ended.");
    }
}

public class threadDemo2 {
    public static void main(String args[]) {
        System.out.println("Main Thread Started.\n");
        createThrd newThrd = new createThrd("NewThrd#1");
        System.out.println("New Thread Name: "+newThrd.thrd.getName());

        try {
            for(int i=0; i<50; i++) {
                Thread.sleep(100);
                System.out.print("["+i+"]");
            }
        }catch(InterruptedException exc) {
            System.out.println("Process Interrupted with Exc: "+exc);
        }

        System.out.println("Main Thread Ended.");
    }
}
