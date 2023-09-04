package data_structures.strings;

public class string_methods {
    public static void main(String args[]) {
        String str; // -> Declaration of new String.
        str = new String("Siva Naga Raju"); // -> Allocating a String to obj str.

        System.out.println(str);

        String str1 = new String("My" + " name" + " is");
        System.out.print(str1+" "+str);

        String str2 = "Tirumalasetti";
        System.out.println(" "+str2);

        str2 = str+" "+str2;
        System.out.println(str2);

        System.out.println("str1 == str2: "+str1.equals(str2));
        System.out.println("Length of str: "+str.length());
        System.out.println("Character at 6 in str2: "+str2.charAt(6));
        System.out.println("str and str 1 are same: "+str.compareTo(str1));
        System.out.println("Tirumalasetti in str2 Starts at: "+str.indexOf("Tirumalasetti"));
        System.out.println("index of last Naga in str: "+str.lastIndexOf(str));
    }
}
