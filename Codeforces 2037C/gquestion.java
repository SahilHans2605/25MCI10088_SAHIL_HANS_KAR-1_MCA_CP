import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            if (n < 5) {
                out.append("-1\n");
                continue;
            }
            for (int i = 1; i <= n; i += 2) {
                if (i != 5) out.append(i).append(" ");
            }
            out.append("5 4 ");
            for (int i = 2; i <= n; i += 2) {
                if (i != 4) out.append(i).append(" ");
            }
            
            out.append("\n");
        }
        System.out.print(out);
    }
}