package basics;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Read {
    public int read_int()throws Exception {
        System.out.println("You need to input an Integer Value...");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int x;

        x = Integer.parseInt(br.readLine());
        br.close();
        ir.close();

        return x;

    }
}
