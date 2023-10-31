package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subsets {
    public static void main(String args[])throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of the Set: ");
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter El-"+(i+1)+": ");
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("\nList: [");
        for(int i: x) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b]\n");

        int p,q,r,u,v,w;
        p = q = 0;
        u = v = 0;

        int z = (int)Math.pow(2, n);
        String[] sets = new String[z-1];

        while(p<n) {
            z = n-1;
            w = 2;
            q = 0;
            r = 0;
            while(q<Math.pow(2, z)) {
                if(q == 0 & p != n-1) {
                    sets[u] = String.valueOf(x[p]);
                }else if(q == Math.pow(2, z)-1) {
                    r = p;
                    while(r<z) {
                        sets[u] += String.valueOf(x[r]);
                        r++;
                    }
                }else {
                    v = p;
                    while(r < w) {
                        sets[u] += String.valueOf(x[v]);
                        v++;
                        r++;
                    }
                }
                q++;
                u++;
                p++;

            }
        }
    }
}