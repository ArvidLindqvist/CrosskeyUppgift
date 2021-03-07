package org.crosskey.uppgift;

import java.util.Scanner;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String testName = Customer.class.getName();
		double testLoan;
		double testInterest;
		int testYears;
		String CMonthlyPayment;
		
//		System.out.println("Please enter the customer name: ");
//		testName = in.nextLine();
//		
//		System.out.println("Please enter the loan the customer wants to take: ");
//		testLoan = in.nextDouble();
//		
//		System.out.println("Please enter the interest on the loan: ");
//		testInterest = in.nextDouble();
//		
//		System.out.println("Please enter the amount of years it will take to pay of the loan: ");
//		testYears = in.nextInt();
//		
//		Customer c = new Customer(testName, testLoan, testInterest, testYears);
//		//System.out.println(testName + testLoan + testInterest + testYears);
//		
//		CMonthlyPayment = CustomerLoan.monthlyLoan(c);
//		
//		System.out.println(c.getName() + " have to pay " + CMonthlyPayment + " per month for " + c.getYears() + " years.");  //Unit test
		
		Customer c1 = new Customer("Juha", 1000, 5, 2);
		Customer c2 = new Customer("Karvinen", 4356,1.27,6);
		Customer c3 = new Customer("Claes Månsson", 1300.55, 8.67, 2);
		Customer c4 = new Customer("Clarencé Andersson", 2000, 6, 4);
		
		String C1MonthlyPayment = CustomerLoan.monthlyLoan(c1);
		String C2MonthlyPayment = CustomerLoan.monthlyLoan(c2);
		String C3MonthlyPayment = CustomerLoan.monthlyLoan(c3);
		String C4MonthlyPayment = CustomerLoan.monthlyLoan(c4);
		
		System.out.println("Prospect 1: " + c1.getName() + " wants to borrow " + c1.getLoan() + "€ for a period of " + c1.getYears() + " years and pay " + C1MonthlyPayment + " € each month.");
		System.out.println("Prospect 2: " + c2.getName() + " wants to borrow " + c2.getLoan() + "€ for a period of " + c2.getYears() + " years and pay " + C2MonthlyPayment + " € each month.");
		System.out.println("Prospect 3: " + c3.getName() + " wants to borrow " + c3.getLoan() + "€ for a period of " + c3.getYears() + " years and pay " + C3MonthlyPayment + " € each month.");
		System.out.println("Prospect 4: " + c4.getName() + " wants to borrow " + c4.getLoan() + "€ for a period of " + c4.getYears() + " years and pay " + C4MonthlyPayment + " € each month.");
		

	}

}
