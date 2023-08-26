package Exam;

public class unicodeDemo {
    public static void main(String args[])throws Exception{
        int ch = 0;
        while(ch<125){
            System.out.println("UnicodeChar("+ch+"): "+(char)ch);
            ch++;
        }
    }
}
