package basics;

public class sortTypeDemo {
    public static void main(String args[]) {
        sortType<Double> DOb;
        sortType<Character> Cob;

        Double[] x = {99.2, 45.0, 64.65, 32.32, 11.1, 98.6, 1.1, 54.9, 19.6, 2.0, 20.5, 10.4, 3.0};
        Character[] ch = {'z', 'y', 'x', 'w', 'b', 'h', 'H', 'A', '%'};

        DOb = new sortType<Double>();
        DOb.bubbleSort(x);

        Cob = new sortType<Character>();
        Cob.bubbleSort(ch);

        System.out.print("List = [");
        for(Double d: x) {
            System.out.print(d+" ");
        }
        System.out.println("\b]");

        System.out.print("List = [");
        for(char d: ch) {
            System.out.print(d+" ");
        }
        System.out.println("\b]");
    }
}
