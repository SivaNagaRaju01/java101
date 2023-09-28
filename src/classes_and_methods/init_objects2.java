package classes_and_methods;

class object_initialization {
    int sum;
    object_initialization(int x) {
        sum = 0;
        for(int i=1; i<x; i++){
            sum = sum + i;
        }
    }

    object_initialization(object_initialization ob){
        sum = ob.sum;
    }
}

public class init_objects2 {
    public static void main(String args[]) {
        object_initialization t1 = new object_initialization(10);
        object_initialization t2 = new object_initialization(t1);

        System.out.println("t1.sum = "+t1.sum);
        System.out.println("t2.sum = "+t2.sum);
    }
}
