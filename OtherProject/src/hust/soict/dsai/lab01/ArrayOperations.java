

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int arrayLength = 0, arraySum = 0;
			System.out.println("Please type in the size of the array:");
			arrayLength = sc.nextInt();
			int[] array = new int[arrayLength];
			System.out.println("Please type in the elements in the array");
			for (int i = 0;i < arrayLength; ++i) {
				array[i] = sc.nextInt();
				arraySum += array[i];
			}
			
			for (int i = 0;i < arrayLength - 1; ++i) {
				for (int j = i + 1;j < arrayLength; ++j) {
					if (array[i] > array[j]) {
						int tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}
			
			double arrayMean = (double) arraySum / (double) arrayLength;
			System.out.println("The sum of the array is: " + arraySum);
			System.out.println("The mean value of the array is: " + arrayMean);
			System.out.println("The array after being sorted:");
			
			for (int i = 0;i < arrayLength; ++i) {
				System.out.print(array[i] + " ");
			}
			
			sc.close();
		}
}
