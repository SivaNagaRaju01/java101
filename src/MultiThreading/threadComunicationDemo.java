package MultiThreading;

class ticktock {
    String state = "tocked";

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;
        }

        try {
            if(!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exe) {
            System.out.println("\n"+exe);
        }


        System.out.print("Tick ");
        state = "ticked";
        notify();
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }

        try {
            while(!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exe) {
            System.out.println("\n"+exe);
        }

        System.out.println("Tock");
        state = "tocked";
        notify();
    }
}

class createTickTockThread implements Runnable {
    Thread thrd;
    ticktock ttob;

    createTickTockThread(String name, ticktock tt) {
        thrd = new Thread(this, name);
        ttob = tt;
    }

    public static createTickTockThread createAndStart(String name, ticktock tt) {
        createTickTockThread newThrd = new createTickTockThread(name, tt);
        newThrd.thrd.start();
        return newThrd;
    }

    public void run() {
        System.out.println("In Thread: "+thrd.getName());
        if(thrd.getName() == "Tick") {
            for(int i=0; i<5; i++)ttob.tick(true);
            ttob.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttob.tock(true);
            ttob.tock(false);
        }
    }
}

public class threadComunicationDemo {
    public static void main(String[] args) {
        ticktock tt = new ticktock();
        
        createTickTockThread t1 = createTickTockThread.createAndStart("Tick", tt);
        createTickTockThread t2 = createTickTockThread.createAndStart("Tock", tt);
        

        try {
            t1.thrd.join();
            System.out.println(t1.thrd.getName()+" is joined");
            t2.thrd.join();
            System.out.println(t2.thrd.getName()+" is joined");
        } catch (InterruptedException exe) {
            System.out.println(exe);
        }
        System.out.println("Main Thread Terminating...");
    }
}
