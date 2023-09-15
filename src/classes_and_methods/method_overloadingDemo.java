package classes_and_methods;

class overloadedMethods {
    void display() {
        System.out.println("There is Nothing To Display...");
    }

    void display(int[] ar) {
        System.out.print("List = [");
        for(int i: ar){
            System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }

    void display(String str){
        System.out.println(str+": is the given String...");
    }

    void display(int[] ar, String str){
        System.out.print(str+" = [");
        for(int i: ar){
            System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }
}

public class method_overloadingDemo {
    public static void main(String args[]) {
        overloadedMethods om = new overloadedMethods();
        int[] x = new int[10];

        for(int i=0; i<10; i++) {
            x[i] = i*2 + 10;
        }

        om.display();
        om.display("Siva Naga Raju");
        om.display(x);
        om.display(x, "The Array");
    }
}
