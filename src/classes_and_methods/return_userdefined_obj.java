package classes_and_methods;

class err {
    String m;
    int n;

    err(String msg, int x)  {
        m = msg;
        n = x;
    }
}

class errInfo {
    String[] msg = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    int[] sev = {3,3,2,4};

    err geterrmsg(int i) {
        if(i >= 0 & i < msg.length){
            err ob = new err(msg[i], sev[i]);
            return ob;
        }
        err ob = new err("Invalid Error Code", 0);
        return ob;
    }
}

public class return_userdefined_obj {
    public static void main(String args[]){
        errInfo err = new errInfo();
        err e;
        e = err.geterrmsg(2);
        System.out.println(e.m+" Severity: "+e.n);
        e = err.geterrmsg(10);
        System.out.println(e.m+" Severity: "+e.n);
    }
}
