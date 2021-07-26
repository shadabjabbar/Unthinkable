import java.io.*;
public class pascal_traingle
{
    int fact(int n)
    {
        if(n<=1)
        return 1;
        else 
        return n*fact(n-1);
    }
    int nCr(int n,int r)
    {
        return (fact(n)/(fact(n-r)*fact(r)));
    }
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        pascal_traingle ob = new pascal_traingle();
        int m=n-1;
        for(int i=0;i<n;i++) {
            for(int k=1;k<=m;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print(ob.nCr(i,j)+" ");
            }
            System.out.println();
            m--;
        }
    }
}