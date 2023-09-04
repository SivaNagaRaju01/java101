package data_structures.strings;

public class command_line_args {
    public static void main(String args[]) {
        System.out.println("There are "+args.length+" command line arguments, They are");
        for(String i: args){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
