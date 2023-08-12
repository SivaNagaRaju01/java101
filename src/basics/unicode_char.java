package basics;

public class unicode_char {
    public static void main(String args[]) {
        char ch = 0;
        int i = 0;

        while(ch <= 256){
            System.out.println("Unicode Character-"+i+" : "+ch);
            ch++;
            i++;
        }
    }
}
