//Write a program to perform the matrix addition & multiplication by allocation memory for an array dynamically
import java.util.Scanner;
public class fourteen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();
            int[][] matrixA = new int[rows][cols];
            int[][] matrixB = new int[rows][cols];
            int[][] sumMatrix = new int[rows][cols];
            System.out.println("Enter elements for Matrix A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixA[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements for Matrix B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixB[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            System.out.println("Result of Matrix Addition:");
            printMatrix(sumMatrix);
            if (cols == rows) {
                int[][] productMatrix = new int[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        for (int k = 0; k < cols; k++) {
                            productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                        }
                    }
                }
                System.out.println("Result of Matrix Multiplication:");
                printMatrix(productMatrix);
            } else {
                System.out.println("Matrix multiplication not possible: column of A must equal row of B.");
            }
            sc.close();
        }
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + "\t");
                }
                System.out.println();
            }
        }
    }

