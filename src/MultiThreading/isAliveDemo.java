package MultiThreading;

public class isAliveDemo {
    public static void main(String args[]) {
        System.out.println("Main Thread is Started.");

        createThrd t1 = new createThrd("child #1");
        createThrd t2 = new createThrd("child #2");
        createThrd t3 = new createThrd("child #3");

        try {
            do {
                Thread.sleep(50);
                System.out.println(".");
            }while(t1.thrd.isAlive() || t2.thrd.isAlive() || t3.thrd.isAlive());
        }catch(InterruptedException exc) {
            System.out.println(exc);
        }

        System.out.println("Main ended...");
    }
}
