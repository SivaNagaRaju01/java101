package basics.textbook_exe;

import java.io.IOException;

class Queue{
    private char[] q;
    private int putloc, getloc;

    Queue(int size){
        q = new char[size];
        putloc = 0;
        getloc = 0;
    }

    void put(char ch){
        if(putloc == q.length){
            System.out.println("Queue is Full...!");
            return;
        }
        q[putloc++] = ch;
    }

    char get(){
        if(getloc == putloc){
            System.out.println("\nQueue is Empty...!");
            putloc = getloc = 0;
            return '\t';
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
            System.out.println("[2]. Retreive Elements From Queue...");
            System.out.println("[ ]. Any Key to Quit...");
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
                case 2: char ch = '0';
                        while(ch != '\t'){
                            ch = q.get();
                            System.out.print(ch+" ");
                        }
                        System.out.println();
                break;
                default : System.out.println("Terminating....!"); 
                        System.exit(0);
            }
        }
    }
}
