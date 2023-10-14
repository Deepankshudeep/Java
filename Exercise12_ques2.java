import java.util.Scanner;

public class Exercise12_ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows for the first matrix : ");
        int mat1Rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix : ");
        int mat1Cols = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix (mat2): ");
        int mat2Rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix (mat2): ");
        int mat2Cols = scanner.nextInt();

        if (mat1Cols != mat2Rows) {
            System.out.println(" Number of columns in mat1 must be equal to the number of rows in mat2.");
            return;
        }

        double[][] mat1 = readMatrix(mat1Rows, mat1Cols, scanner, "mat1");

        double[][] mat2 = readMatrix(mat2Rows, mat2Cols, scanner, "mat2");

        double[][] prod = multiplyMatrices(mat1, mat2);


        System.out.println("Product of mat1 and mat2:");
        displayMatrix(prod);
    }

    public static double[][] readMatrix(int rows, int cols, Scanner scanner, String matrixName) {
        System.out.println("Enter the elements of " + matrixName + ":");
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }


    public static double[][] multiplyMatrices(double[][] mat1, double[][] mat2) {
        int mat1Rows = mat1.length;
        int mat1Cols = mat1[0].length;
        int mat2Cols = mat2[0].length;

        double[][] prod = new double[mat1Rows][mat2Cols];

        for (int i = 0; i < mat1Rows; i++) {
            for (int j = 0; j < mat2Cols; j++) {
                for (int k = 0; k < mat1Cols; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return prod;
    }


    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
