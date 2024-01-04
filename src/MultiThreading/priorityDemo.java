package MultiThreading;

class Priority implements Runnable {
    Thread thrd;
    int count;
    static String currentName;
    static boolean stop = false;

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thrd.getName()+" is starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("Current Thread is: "+currentName);
            }
        } while(stop == false && count <10000000);

        stop = true;

        System.out.println(currentName + " is Teriminating.");
    }
}

public class priorityDemo {
    public static void main(String args[]) {
        Priority t1 = new Priority("High Priority");
        Priority t2 = new Priority("Low Priority");
        Priority t3 = new Priority("Norm Priority");
        Priority t4 = new Priority("Norm Priority");
        Priority t5 = new Priority("Low Priority");

        t1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        t2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        t1.thrd.start();
        t2.thrd.start();
        t3.thrd.start();
        t4.thrd.start();
        t5.thrd.start();

        try {
            t1.thrd.join();
            t2.thrd.join();
            t3.thrd.join();
            t4.thrd.join();
            t5.thrd.join();
        } catch(InterruptedException exe) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("\nHigh priority thread counted to " + t1.count); 
        System.out.println("Low priority thread counted to " + t2.count); 
        System.out.println("1st Normal priority thread counted to " + t3.count); 
        System.out.println("2nd Normal priority thread counted to " + t4.count); 
        System.out.println("3rd Normal priority thread counted to " + t5.count); 
    }
}
