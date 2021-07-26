import java.io.*;
import java.util.*;
public class remove_duplicates {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(in.readLine());
        int a[]=new int[size];
        for(int i=0; i<size; i++)
        a[i]=Integer.parseInt(in.readLine());
        System.out.println("Original Array is");
        for(int i=0; i<size; i++)
        System.out.print(a[i]);
        System.out.println();
        Arrays.sort(a);
        int j=0;
        int b[]=new int[size];
        for(int i=0;i<size-1;i++)
        {
            if(a[i]!=a[i+1])
            b[j++]=a[i];
        }
        b[j++] = a[size-1];
        System.out.println("Sorted Array is");
        for (int i = 0; i < j; i++)
            System.out.print(b[i]);
    }
}
