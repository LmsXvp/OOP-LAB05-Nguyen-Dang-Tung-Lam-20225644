

import javax.swing.JOptionPane;

public class DoubleCalculator {
	
	public static boolean isZero(double value, double eps) {
		return (value >= -eps && value <= eps);
	}
	
	public static void main(String[] args) {
		
		String strNum1, strNum2;
		String strMessage = "";
		
		strNum1 = JOptionPane.showInputDialog(null, "Please type in the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please type in the second number", JOptionPane.INFORMATION_MESSAGE);
		
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double additionResult = num1 + num2;
		double subtractionResult = num1 - num2;
		double multiplicationResult = num1 * num2;
		
		strMessage += "The result of " + strNum1 + " + " + strNum2 + " is: " + additionResult + "\n";
		strMessage += "The result of " + strNum1 + " - " + strNum2 + " is: " + subtractionResult + "\n";
		strMessage += "The result of " + strNum1 + " * " + strNum2 + " is: " + multiplicationResult + "\n";
		
		
		if (isZero(num2, (double)1e-3)) {
			strMessage += "The quotient is zero, cannot do division!";
		}
		else {
			double divisionResult = num1 / num2;
			strMessage += "The result of " + strNum1 + " / " + strNum2 + " is: " + String.format("%.2f", divisionResult);
		}
		
		JOptionPane.showMessageDialog(null, strMessage, "Show calcuation between two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
	

