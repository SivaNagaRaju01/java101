package basics.textbook_exe;

import java.io.IOException;

class Queue{
    char[] q;
    int putloc, getloc;

    Queue(int size){
        q = new char[size];
        putloc = 0;
        getloc = 0;
    }

    void put(char ch){
        if(putloc == q.length-1){
            System.out.println("Queue is Full...!");
            return;
        }
        q[putloc++] = ch;
        if(putloc == 1 & getloc == q.length){
            getloc = 0;
        }
    }

    char get(){
        if(getloc == q.length){
            System.out.println("Queue is Empty...!");
            putloc = 0;
            return (char) 0;
        }

        return q[getloc++];
    }
}

public class QDemo {
    public static void main(String args[]) throws IOException {
        Queue q = new Queue(10);
        for(;;){
            System.out.println("\t\t*****Menu*****");
            System.out.println("[1]. Insert a Character into Queue...");
            System.out.println("[2]. Retreive a Character From Queue...");
            System.out.print("Choose An Option: ");
            int opt = System.in.read() - (int)'0';
            System.in.read();
            int n;

            switch(opt){
                case 1: System.out.print("Enter a Character into Queue: ");
                        n = System.in.read();
                        System.in.read();
                        q.put((char)n);
                break;
                case 2: System.out.println(q.get());
                break;
                default : System.out.println("Terminating....!"); 
                        System.exit(0);
            }
        }
    }
}
