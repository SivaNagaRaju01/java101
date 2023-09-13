package classes_and_methods.access_control;

public class FailSoftArrayDemo {
    public static void main(String args[]) {
        var fsd = new FailSoftArrayDemo();
        fsd.errlessDemo();
        fsd.errDemo();
    }

    void errlessDemo(){
        var fs = new FailSoftArray(10, -1);
        for(int i=0; i<fs.len+5; i++){
            fs.put(i, i*5);
        }

        for(int i=0; i<fs.len+5; i++){
            int x = fs.get(i);
            if(x != -1){
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }

    void errDemo(){
        var fs = new FailSoftArray(10, -1);
        for(int i=0; i<fs.len+5; i++){
            if(fs.put(i, i*10)) continue;
            else System.out.println("Index "+i+" out of Bounds");
        }

        for(int i=0; i<fs.len+5; i++){
            int x = fs.get(i);
            if(x!=-1){
                System.out.print(x+" ");
            }else{
                System.out.println("\nIndex "+i+" out of Boundes");
            }
        }
    }
}

class FailSoftArray {
    private int[] ar;
    private int errval;
    public int len;

    public FailSoftArray(int size, int errv) {
        ar = new int[size];
        errval = errv;
        len = size;
    }

    private boolean indexOK(int index) {
        if(index >= 0 & index < len) return true;
        return false;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            ar[index] = val;
            return true;
        }
        return false;
    }

    public int get(int index) {
        if(indexOK(index)) {
            return ar[index];
        }
        return errval;
    }
}
