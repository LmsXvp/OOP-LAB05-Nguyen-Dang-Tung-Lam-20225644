

import java.util.Scanner;


public class DaysInMonth {
	public static final int lenValidMonthNames = 48;
	public static String[] validMonthNames = new String[] {
		"January", "Feburary", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December",
		"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", 
		"Sep.", "Oct.", "Nov.", "Dec.", "Jan", "Feb", "Mar", "Apr", "May", 
		"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "1", "2", "3", "4", 
		"5", "6", "7", "8", "9", "10", "11", "12"
	};
	
	public static int[] validDays = new int[] {
		31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31	
	};
	
	public static boolean isValidInput(int iYearInput, String strMonthInput) {
		if (iYearInput < 0) {
			return false;
		}
		
		boolean flag = false;
		for (int i = 0; i < lenValidMonthNames; ++i) {
			if (strMonthInput.equals(validMonthNames[i])) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static boolean isLeapYear(int iYear) {
		if (iYear % 4 == 0) {
			if (iYear % 100 == 0) {
				return iYear % 400 == 0;
			}
			return true;
		}
		return false;
	}
	
	public static int getDays(int iYear, String strMonth) {
		int returnValue = 0, monthValue = 0;
		for (int i = 0;i < lenValidMonthNames; ++i) {
			if (strMonth.equals(validMonthNames[i])) {
				 monthValue = i % 12;
				 returnValue = validDays[monthValue];
				 if (monthValue + 1 == 2 && isLeapYear(iYear)) {
					 returnValue += 1;
				 }
				 break;
			}
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String strMonthInput = "";
		int iYearInput;
		boolean isValid = false;
		while (!isValid) {
			System.out.println("Please enter the year: ");
			iYearInput = sc.nextInt();
			System.out.println("Please enter the month: ");
			strMonthInput = sc.next();
			
			isValid = isValidInput(iYearInput, strMonthInput);
			if (isValid) {
				System.out.println("The number of days in that month of the year " 
									+ iYearInput + " is: " + getDays(iYearInput, strMonthInput));
			}
			else {
				System.out.println("The input is invalid, please try again");
			}
		}
		sc.close();
	}

}
