package classes_and_methods;

class errmsg {
    String[] msg = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };

    String geterrmsg(int i) {
        if(i >= 0 & i < msg.length){
            return msg[i];
        }
        return "Invalid Error Code";
    }
}

public class returning_obj {
    public static void main(String args[]){
        errmsg err = new errmsg();
        System.out.println(err.geterrmsg(2));
        System.out.println(err.geterrmsg(10));
    }
}