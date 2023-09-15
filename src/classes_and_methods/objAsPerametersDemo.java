package classes_and_methods;

class box {
    private int len, wid, high;
    private int volume;

    box(int x, int y, int z) {
        len = x;
        wid = y;
        high = z;
        volume = x*y*z;
    }

    boolean sameBox(box ob) {
        if(ob.len == len && ob.wid == wid && ob.high == high){
            return true;
        }
        return false;
    }

    boolean sameVol(box ob) {
        if(ob.volume == volume){
            return true;
        }
        return false;
    }
}

public class objAsPerametersDemo {
    public static void main(String args[]) {
        box box1 = new box(10, 20, 14);
        box box2 = new box(20, 14, 10);

        System.out.println("Box1 is same as Box2: "+box1.sameBox(box2));
        System.out.println("Volume(Box1) is same as Voume(Box2): "+box2.sameVol(box1));
    }
}
