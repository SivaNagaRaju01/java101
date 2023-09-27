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

    static void vaTest2(String x, boolean y, int ...z){
        System.out.println("Number of VarArgs in vaTest2: "+z.length);
        System.out.println("Contents: ");
        System.out.println("    The String: "+x);
        System.out.println("    Boolean: "+y);

        for(int i=0; i<z.length; i++){
            System.out.println("    args "+i+": "+z[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        vaTest(10);
        vaTest(10,30,40,50,60,70);
        vaTest();

        vaTest2("Siva Naga Raju", false, 10,11,12,13,14);
        vaTest2("Tirumalasetti", true, 100);
    }
}
