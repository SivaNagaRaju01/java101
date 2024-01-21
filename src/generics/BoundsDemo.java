package generics;

class NumericFns<T extends Number> {
    T num;

    NumericFns(T ob) {
        num = ob;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

/*class N<X> {
    //This won't Work...
    X num;

    N(X ob) {
        num = ob;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }
} */

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iob = new NumericFns<Integer>(5);
        System.out.println("Reciprocal of iob : "+iob.reciprocal());
        System.out.println("Fractions of iob : "+iob.fraction());

        NumericFns<Double> dob = new NumericFns<Double>(25.4);
        System.out.println("Reciprocal of dob : "+dob.reciprocal());
        System.out.println("Fractions of dob : "+dob.fraction());
    }
}
