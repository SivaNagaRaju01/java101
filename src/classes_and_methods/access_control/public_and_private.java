package classes_and_methods.access_control;

public class public_and_private {
    public static void main(String args[]) {
        var ac = new check_access_control();
        ac.setx(10);
        System.out.println("x is "+ac.getx());

        ac.y = 20;
        ac.z = 30;

        // int sum = ac.y + ac.z + ac.x; Cannot access x like that since it is invisible to this class.

        System.out.println("y and z are: "+ac.y+" and "+ac.z);
    }
}

class check_access_control{
    private int x;
    public int y;
    int z;

    void setx(int i){
        x = i;
    }

    int getx(){
        return x;
    }
}
