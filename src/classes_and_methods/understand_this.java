package classes_and_methods;

class pwr{
    double b;
    int e;
    double val;

    pwr(double base, int exp){
        b = base;
        e = exp;
       double val = 1;

        if(exp == 0) return;
        for(; exp>0; exp--) val = val*base;
    }

    double get_pwr(){
        return val;
    }
}

public class understand_this {
    public static void main(String args[]) {
        pwr x = new pwr(3.0, 2);
        pwr y = new pwr(4.0, 2);
        pwr z = new pwr(5.0, 2);

        System.out.println(x.b+" to the power of "+x.e+" is equals to "+x.get_pwr());
        System.out.println(y.b+" to the power of "+y.e+" is equals to "+y.get_pwr());
        System.out.println(z.b+" to the power of "+z.e+" is equals to "+z.get_pwr());
    }
}
