package classes_and_methods;

public class varargsDemo {
    static void vaTest(int ...x){
        System.out.println("Number of Int VarArgs: "+x.length);
        System.out.println("Contents: ");

        for(int i=0; i<x.length; i++){
            System.out.println("    arg "+i+": "+x[i]);
        }
        System.out.println();
    }

    static void vaTest(boolean ...x){
        System.out.println("Number of Boolean VarArgs: "+x.length);
        System.out.println("Contents: ");

        for(int i=0; i<x.length; i++){
            System.out.println("    arg "+i+": "+x[i]);
        }
        System.out.println();
    }

    static void vaTest(String x, int ...y){
        System.out.println("Number of Hybrid VarArgs: "+y.length);
        System.out.println("Contents: ");
        System.out.println("    The String: "+x);

        for(int i=0; i<y.length; i++){
            System.out.println("    arg "+i+": "+y[i]);
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
        vaTest("Siva Naga Raju",10,20,30);
        vaTest(true,false,false);

        vaTest2("Siva Naga Raju", false, 10,11,12,13,14);
        vaTest2("Tirumalasetti", true, 100);
    }
}
