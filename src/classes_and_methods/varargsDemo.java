package classes_and_methods;

public class varargsDemo {
    static void vaTest(int ...x){
        System.out.println("Number of VarArgs: "+x.length);
        System.out.println("Contents: ");

        for(int i=0; i<x.length; i++){
            System.out.println("    arg "+i+": "+x[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        vaTest(10);
        vaTest(10,30,40,50,60,70);
        vaTest();
    }
}
