import java.util.Scanner;

public class largest_in_2D {
    public static void getLargest(int mat[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                largest = Math.max(largest, mat[i][j]);
            }
        }
        System.out.println("Largest of the matrix is : " + largest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // input for matrix
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        getLargest(matrix);
    }
}
