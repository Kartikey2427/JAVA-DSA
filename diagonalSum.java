public class diagonalSum {
    
    public static int diagonal(int matrix[4][4]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                    else if(i + j == matrix.length - 1) {
                        sum += matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix ={{1,2,3,4},
                    {5,6,7,8},
                    {10,11,12,14},
                    {70,80,90,45}};
                    System.out.println(diagonal(matrix));
    }
}
