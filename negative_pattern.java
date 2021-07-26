import java.io.*;
public class negative_pattern {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            min=a[i];
            a[i]=Integer.parseInt(in.readLine());
            if(a[i]<min)
            min=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                if(a[i]!=min)
                for (int j = 1; j <= Math.abs(a[i]); j++)
                    System.out.print(" ");
                for (int j = 1; j <= Math.abs(a[i]); j++)
                    System.out.print("*");
            }
            else{
                for(int k=1;k<=Math.abs(min);k++)
                System.out.print(" ");
                for (int j = 1; j <= Math.abs(a[i]); j++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
