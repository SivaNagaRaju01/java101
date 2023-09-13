package basics;

public class local_var_type_inference {
    public static void main(String args[]) {
        var i = 2;
        int var = 3;
        var x = var+i;

        for(var j=2.3; j<10.5; j++){
            System.out.println("x and j are: "+x+" and "+j);
            x = x*2;
        }

        //var[] z = new int[10]; syntax Error;
        //var z[] = new int[10]; //syntax Error;

        var z = new int[10];

        for(i=0; i<10; i++){
            z[i] = i+var*2;
            var = i+var/3;
        }

        for(var k: z){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
