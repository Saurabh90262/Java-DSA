public class diagonal_sum {
    public static int diagonalSum(int mat[][]) { // Time Complexity is O(n^2)
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                // sum of primary diagonal element
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSumOptimized(int mat[][]) { // Time Complexity is O(n)
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - i - 1) {
                sum += mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(diagonalSum(mat));
        System.out.println(diagonalSumOptimized(mat));

    }
}
