package Exam;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Result {
    static HashMap<Character, Integer> map = new HashMap<>();
    static void get() {
        map.put('a', 1);
        map.put('b', 1);
        char ch = 'c';
        int val = 1;
        for(int i=3; i<=26; i++) {
            if(i%3 == 0) val++;
            map.put(ch,val);
            ch++;
        }
    }
    public static int cst(String str) {
        get();

        String[] s;
        int n = 1;
        int z = str.length();
        while(z>=2) {
            n += z; 
            z--;
        }
        s = new String[n];
        z = str.length();
        int x,ind=0;

        for(int i=0; i<str.length(); i++) {
            x = 1;
            for(int j=0; j<z; j++) {
                s[ind] = str.substring(j, x+i);
                x++;
                ind++;
            }
            z--;
        }

        int sum,len,count=0;
        String hms;
        System.out.println();

        for(int i=0; i<n; i++) {
            sum = 0;
            for(int j=0; j<s[i].length(); j++) {
                sum += map.get(s[i].charAt(j));
            }
            len = s[i].length();
            if(sum%len == 0) {
                count++;
                hms = "Yes";
            }else {
                hms = "No";
            }

            System.out.println("\t"+s[i]+":\t"+hms);
        }
        
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        /*  var bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            
            String input_str = br.readLine();

            int result = Result.cst(input_str);
            bw.write(String.valueOf(result));
            bw.newLine();

            br.close();
            bw.close();
        */

        System.out.print("Enter a String: ");
        String str = br.readLine();

        int result = Result.cst(str);
        System.out.println("Result: "+result);
    }
}
