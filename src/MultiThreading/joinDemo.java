package MultiThreading;

public class joinDemo {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        createThrd mt1 = new createThrd("Child #1");
        createThrd mt2 = new createThrd("Child #2");
        createThrd mt3 = new createThrd("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 joined.");
            mt2.thrd.join();
            System.out.println("Child #2 joined.");
            mt3.thrd.join();
            System.out.println("Child #3 joined.");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
