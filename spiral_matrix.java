public class spiral_matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows = matrix.length;
        int column = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = column - 1, dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1)// going left to right
            {
                for (int i = left; i <= right; i++)
                    //list.add(matrix[top][i]);
                    System.out.print(matrix[top][i]+" ");
                dir = 2;
                top++;
            } else if (dir == 2)// going top to bottom
            {
                for (int i = top; i <= bottom; i++)
                    //list.add(matrix[i][right]);
                    System.out.print(matrix[i][right]+" ");
                dir = 3;
                right--;

            } else if (dir == 3)// going right to left
            {
                for (int i = right; i >= left; i--)
                    //list.add(matrix[bottom][i]);
                    System.out.print(matrix[bottom][i]+" ");

                dir = 4;
                bottom--;
            } else if (dir == 4)// going bottom to up
            {
                for (int i = bottom; i >= top; i--)
                    //list.add(matrix[i][left]);
                    System.out.print(matrix[i][left]+" ");
                left++;
                dir = 1;
            }
        }
    }
}
