import java.util.*;
public class k_times_number {
    static int kTimes(int arr[],int n,int k)
    {
        HashMap<Integer,Integer> times = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int a=0;
            if(times.get(arr[i])!=null)
            {
                a=times.get(arr[i]);
            }
            times.put(arr[i], a+1);
        }
        for(int i=0;i<n;i++)
        {
            if(times.get(arr[i])==k)
            return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 7, 4, 3, 4, 8, 7};
        int n=arr.length;
        int k=1;
        System.out.println(kTimes(arr,n,k));

    }
}
