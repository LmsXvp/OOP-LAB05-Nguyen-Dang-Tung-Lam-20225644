

import java.util.Scanner;

public class DisplayTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of the triangle: ");
		int height = sc.nextInt();
		sc.close();
		
		int width = 2 * height - 1;
		
		for (int i = 0;i < height; ++i) {
			int numberOfStars = 2 * (i + 1) - 1;
			int spaceWidth = (width - numberOfStars) / 2;
			System.out.println(" ".repeat(spaceWidth) + "*".repeat(numberOfStars) + " ".repeat(spaceWidth));
		}
	}
}
