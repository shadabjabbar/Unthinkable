import java.io.*;
public class prime_pattern {
    static boolean isPrime(int n)
    {
        if(n==1)
        return true;
        else if(n==2)
        return true;
        else if(n == 3)
        return true;
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
            }
            return true;
        }

    }
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int prime[]=new int[n];
        int c=0,num=1;
        while(c<n)
        {
            if(isPrime(num))
            {
                prime[c]=num;
                c++;
            }
            num++;
        }
        for(int i=0;i<prime.length;i++){
            for(int j=0;j<=i;j++)
            System.out.print(prime[j]+" ");
            System.out.println();
        }

    }
}
