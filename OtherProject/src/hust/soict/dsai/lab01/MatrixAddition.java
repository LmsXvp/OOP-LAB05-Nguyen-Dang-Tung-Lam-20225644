
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int matrixRows = 0, matrixColumns = 0;
		
		System.out.println("Please type in the number of rows and columns of two matrix:");
		matrixRows = sc.nextInt();
		matrixColumns = sc.nextInt();
		
		int[][] firstMatrix = new int[matrixRows][matrixColumns]; 
		int[][] secondMatrix = new int[matrixRows][matrixColumns];
		int[][] resultMatrix = new int[matrixRows][matrixColumns];
		System.out.println("Please enter the elements of the first matrix: ");
		for (int i = 0; i < matrixRows; ++i) {
			for (int j = 0;j < matrixColumns; ++j) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Please enter the elements of the second matrix: ");
		for (int i = 0; i < matrixRows; ++i) {
			for (int j = 0;j < matrixColumns; ++j) {
				secondMatrix[i][j] = sc.nextInt();
				resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		
		System.out.println("The result of adding two matrices together is:");
		for (int i = 0; i < matrixRows; ++i) {
			for (int j = 0;j < matrixColumns; ++j) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

