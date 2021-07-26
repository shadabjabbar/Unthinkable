public class megaprime {
    static boolean isMegaPrime(int n)
    {
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='2'&&ch!='3'&&ch!='5'&&ch!='7')
            return false;
        }
        return true;
    }
    static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        else if(n==2)
        return true;
        else if(n==3)
        return true;
        else if(n%2==0)
        return false;
        else
        {
            for(int i=3;i<=Math.sqrt(n);i=i+2)
            {
                if(n%i==0)
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args)throws Exception{
        int count=0;
        
        for(int i=1;i<=100;i++)
        {
            if(isPrime(i))
            {
                if(isMegaPrime(i)){
                    System.out.println(i);
                    count++;
                }
               
            }
        }
        System.out.print(count);
    }
}
