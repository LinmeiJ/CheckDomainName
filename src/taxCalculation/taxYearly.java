package taxCalculation;

import java.util.Scanner;

public class taxYearly {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final String SALARY_PROMPT = "\nEnter annual salary (0 to exit): ";
		int annualSalary;
		int deduction;
		int totalDeductions;
		double taxRate;
		int taxToPay;

		System.out.println(SALARY_PROMPT);
		annualSalary = scnr.nextInt();
		System.out.print(annualSalary);// FIXME
		deduction = 0;
		totalDeductions = 0;
		while (annualSalary > 0) {
			System.out.println("\nenter your salary deductions: ");
			deduction = scnr.nextInt();
			System.out.println("deduction is: " + deduction); // FIXME

			while (deduction > 0) {
				totalDeductions += deduction;
				System.out.println("totaldeduction is: " + totalDeductions);
				deduction = scnr.nextInt();
				while (deduction <= 0);
			}

			System.out.println("totalDeduction is: " + totalDeductions);

			annualSalary = annualSalary - totalDeductions;
			System.out.println("annualSalary is : " + annualSalary); // FIXME

			// Determine the tax rate from the annual salary
			if (annualSalary <= 20000) {
				taxRate = 0.10; // 0.10 is 10% written as a decimal
			} else if (annualSalary <= 50000) {
				taxRate = 0.20;
			} else if (annualSalary <= 100000) {
				taxRate = 0.30;
			} else {
				taxRate = 0.40;
			}

			taxToPay = (int) (annualSalary * taxRate); // Truncate tax to an integer amount
			System.out.println("Annual salary: " + annualSalary);
			System.out.println("Tax rate: " + taxRate);
			System.out.println("Tax to pay: " + taxToPay);

			// Get the next annual salary
			System.out.println(SALARY_PROMPT);
			annualSalary = scnr.nextInt();
		}
	}
//	scnr.close();
}
