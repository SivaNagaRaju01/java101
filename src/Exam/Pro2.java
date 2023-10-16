package Exam;

//import java.util.ArrayList;
import java.util.HashMap;

public class Pro2 {
	public static void main(String ar[]) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int finalValue=0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int currentNumber = 1;
        for (char letter : alphabet.toCharArray()) {
            switch (letter) {
                case 'a': case 'b':
                    currentNumber = 1;
                    break;
                case 'd': case 'e': case 'c':
                    currentNumber = 2;
                    break;
                case 'f' : case 'g': case 'h':
                    currentNumber = 3;
                    break;
                case 'i': case 'j': case 'k':
                    currentNumber = 4;
                    break;
                case 'l': case 'm': case 'n':
                    currentNumber = 5;
                    break;
                case 'o': case 'p': case 'q':
                    currentNumber = 6;
                    break;
                case 'r': case 's': case 't':
                    currentNumber = 7;
                    break;
                case 'u': case 'v': case 'w':
                    currentNumber = 8;
                    break;
                case 'x': case 'y': case 'z':
                    currentNumber = 9;
                    break;
            }
            hm.put(letter, currentNumber);
        }
        System.out.println(hm);
        //ArrayList<String> al=new ArrayList<String>();
		String input_str="asdf";
		for(int i=0;i<input_str.length();i++) {
			for(int j=i+1;j<input_str.length()+1;j++) {
				String s=input_str.substring(i,j);
				
				int len=s.length();
				int sum=0;
				for(int k=0;k<s.length();k++) {
					int value= hm.get(s.charAt(i));
					sum+=value;
				}
				System.out.println(sum);
				if(sum%len==0) {
					finalValue+=1;
				}
				System.out.println(s+""+finalValue);
				
			}
		}
		System.out.println(finalValue);
		
	}
}
