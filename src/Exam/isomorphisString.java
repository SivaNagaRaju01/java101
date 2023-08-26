package Exam;

public class isomorphisString {
    public static void main(String args[]) {
        String s1 = "nagaraju";
        String s2 = "abcbdbef";

        int i, j, flag = -1;
        char ch1, ch2;

        if(s1.length() == s2.length()){
            //ch = new char[s2.length()];
            for(i=0; i<s1.length(); i++){
                ch1 = s1.charAt(i);
                ch2 = s2.charAt(i);

                for(j=i+1; j<s1.length(); j++) {
                    if(s1.charAt(j) == ch1){
                        if(s2.charAt(j) == ch2){
                            continue;
                        }else{
                            flag = 1;
                            break;
                        }
                    }
                }
                if(flag == 1){
                    break;
                }
            }

            if(flag == -1){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            System.out.println("False");
        }
    }
}
