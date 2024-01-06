package MultiThreading;

class controlledTread implements Runnable {
    Thread thrd;
    boolean suspend;
    boolean stop;

    controlledTread(String name) {
        thrd = new Thread(this, name);
        suspend = false;
        stop = false;
    }

    public static controlledTread createAndstart(String name) {
        var cthrd = new controlledTread(name);
        cthrd.thrd.start();
        return cthrd;
    }

    public void run() {
        System.out.println(thrd.getName()+" Started.");
        try {
            for(int i=1; i<1000; i++) {
                System.out.print(i+" ");
                if(i%10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized(this) {
                    while(suspend) {
                        wait();
                    }
                    if(stop) break;
                }
            }
        } catch(InterruptedException exe) {
            System.out.println(exe);
        }
        System.out.println("Terminating "+thrd.getName());
    }

    synchronized void mystop() {
        stop = true;
        suspend = false;
        notify();
    }

    synchronized void mysuspend() {
        suspend = true;
    }

    synchronized void myresume() {
        suspend = false;
        notify();
    }
}

public class ControlledTreadDemo {
    public static void main(String args[]) {
        var ctrlThrd = controlledTread.createAndstart("C#Thread");
        System.out.println("The Process is starting....");

        try {
            Thread.sleep(1000);

            ctrlThrd.mysuspend();
            System.out.println("The Thread is suspended");
            Thread.sleep(10000);

            System.out.println("The Thread is Resumed");
            ctrlThrd.myresume();
            Thread.sleep(1000);

            System.out.println("The Thread is suspended");
            Thread.sleep(1000);

            System.out.println("The Thread is Resumed");
            ctrlThrd.myresume();
            Thread.sleep(1000);

            ctrlThrd.mystop();
            System.out.println("The Thread is stopped");

            ctrlThrd.thrd.join();
        }catch(InterruptedException exe) {
            System.out.println(exe);
        }
    }
}
