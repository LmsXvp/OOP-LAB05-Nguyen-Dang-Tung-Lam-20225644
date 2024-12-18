
import java.util.Scanner;
public class EquationSolver {
	
	public static boolean isZero(double number, double threshold) {
		return (number >= -threshold && number <= threshold);
	}
	
	public static String linearEquationSolver(double a, double b) {
		String strReturnMessage = "";
		if (a == 0) {
			if (b == 0) {
				strReturnMessage = "The equation has infinite solutions!";
			}
			else {
				strReturnMessage = "The equation has no solutions!";
			}
		}
		else {
			double solution = (double)(-b) / (double)a;
			strReturnMessage = "The equation has one solution, x = " + String.format("%.2f", solution);
		}
		return strReturnMessage;
	}
	
	public static String linearSystemSolver(double a11, double a12, double a21, double a22, double b1, double b2) {
		String strReturnMessage = "";
		double d = a11 * a22 - a12 * a21;
		double dx1 = b1 * a22 - b2 * a12;
		double dx2 = (a11 * b2 - a21 * b1);
		
		if (isZero(d, (double)(1e-3))) {
			if (isZero(dx1, (double)(1e-3))) {
				strReturnMessage = "The equation has infinite solutions";
			}
			else {
				strReturnMessage = "The equation has no solutions";
			}	
		}
		else {
			strReturnMessage = "The equation has one solution: x1 = " + String.format("%.2f", dx1/d);
			strReturnMessage += ", x2 = " + String.format("%.2f", dx2/d);
		}
		return strReturnMessage;
	}
	
	public static String quadraticEquationSolver(double a, double b, double c) {
		String strReturnMessage = "";
		
		if (isZero(a, (double)(1e-3))) {
			return linearEquationSolver(b, c);
		}
		else {
			double delta = b * b - 4 * a * c;
			if (isZero(delta, (double)(1e-3))) {
				strReturnMessage = "The system has double root solution, x = " 
									+ String.format("%.2f", -b / 2 / a);
			}
			else {
				if (delta > 0) {
					strReturnMessage = "The system has 2 solutions, x1 = " 
										+ String.format("%.2f", (-b + Math.sqrt(delta)) / 2 / a);
					strReturnMessage += " x2 = " + String.format("%.2f", (-b - Math.sqrt(delta)) / 2 / a);
				} 
				else {
					strReturnMessage = "The system has no solution";
				}
			}
		}
		return strReturnMessage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to linear solver, here's the menu: ");
		System.out.println("Type 0 if you want to solve a linear equation.");
		System.out.println("Type 1 if you want to solve a linear system.");
		System.out.println("Type 2 if you want to solve a quadratic equation");
		System.out.print("Your choice:");
		
		int option = sc.nextInt();
		switch(option) {
			case 0:
				System.out.println("Please enter a, b for ax + b = 0: ");
				double a = sc.nextDouble(), b = sc.nextDouble();
				System.out.println(linearEquationSolver(a, b));
				break;
			case 1:
				System.out.println("Please enter the coeffcients of the first linear equation: a11 * x1 + a12 * x2 = b1: ");
				double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble();
				System.out.println("Please enter the coeffcients of the first linear equation: a11 * x1 + a12 * x2 = b1: ");
				double a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();
				System.out.println(linearSystemSolver(a11, a12, a21, a22, b1, b2));	
				break;
			case 2:
				System.out.println("Please enter a, b, c for ax^2 + bx + c = 0: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				double c = sc.nextDouble();
				System.out.println(quadraticEquationSolver(a, b, c));
				break;
			default: 
				System.out.println("Invalid option!");
				break;
		}		
		sc.close();
	}

}

