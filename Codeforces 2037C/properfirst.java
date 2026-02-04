package KARGIL;
import java.io.*;
import java.util.*;
public class properfirst {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out=new StringBuilder();

        int t=Integer.parseInt(br.readLine());

        while(t-- >0)
        {
            int n=Integer.parseInt(br.readLine());
            if(n==2)
            {
                out.append("-1\n");
                continue;
            }
            for(int i=2;i<=n;i+=2)
            {
                out.append(i).append(" ");
            }
            for(int i=1;i<=n;i+=2)
            {
                out.append(i).append(" ");
            }
             out.append("\n");
        }

        System.out.print(out.toString());
    }
}
