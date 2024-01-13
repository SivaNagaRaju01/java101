package annotations;

@Deprecated
class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {return msg;}
}

public class depricatedDemo {
    public static void main(String[] args) {
        MyClass myobj = new MyClass("test");
        System.out.println(myobj.getMsg());
    }
}
