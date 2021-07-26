public class border_matrix {
    public static void main(String[] args) {
        int a[][]={ { 1, 2, 3 }, { 1, 2, 3},  { 1, 2, 3},};

        for(int i=0;i<a.length;i++){
            if(i==0||i==(a.length)-1)
            {
                for (int j = 0; j < a[0].length; j++) 
                    System.out.print(a[i][j]+" ");
            }
            else if(i>0&&i<(a.length)-1){
                System.out.print(a[i][0]+" ");
                for(int j=0;j<a[0].length-2;j++){
                    System.out.print("  ");
                }
                System.out.print(a[i][(a[0].length - 1)] + " ");
            }
            System.out.println();
        }
    }
}
