package generics;

class gen<T> {
    T ob;

    gen(T obj) {
        ob = obj;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: "+ob.getClass().getName());
    }
}

public class genDemo {
    public static void main(String args[]) {
        gen<Integer> intOb = new gen<Integer>(27);
        intOb.showType();
        int x = intOb.getOb();
        System.out.println("Print Integer: "+x);

        System.out.println();

        gen<String> sOb = new gen<String>("Siva Naga Raju Tirumalasetti");
        sOb.showType();
        String z = sOb.getOb();
        System.out.println(z);
    }
}
