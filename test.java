import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        int a,temp;
        for (int i = n; i > 0; i--) {
            a=n;
            temp=i;
            for(int j=1;j<=i*n;j++) {
                if(j%temp==0)
                {
                    System.out.print(a);
                    a--;
                }
                else
                System.out.print(a);
            }
            System.out.println();
        }
    }
}